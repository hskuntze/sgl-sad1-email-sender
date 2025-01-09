package br.eb.mil.sgl.emailsender.services;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import br.eb.mil.sgl.emailsender.entities.Contact;
import br.eb.mil.sgl.emailsender.entities.Failure;
import br.eb.mil.sgl.emailsender.entities.Material;
import br.eb.mil.sgl.emailsender.entities.Ticket;
import br.eb.mil.sgl.emailsender.entities.TicketEvent;
import br.eb.mil.sgl.emailsender.entities.User;
import br.eb.mil.sgl.emailsender.enums.TicketStatus;
import br.eb.mil.sgl.emailsender.exceptions.EmailException;

@Service
public class EmailService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
	private SpringTemplateEngine templateEngine;
	private JavaMailSender mailSender;

	private static final String ENCODING = "UTF-8";
	
	@Autowired
	private MaterialService materialService;
	
	@Autowired
	private FailureService failureService;
	
	public EmailService(@Qualifier("mailSender") final JavaMailSender jms, final SpringTemplateEngine ste) {
		this.mailSender = jms;
		this.templateEngine = ste;
	}
	
	/**
	 * Função que envia um e-mail usando template gerenciado pelo Thymeleaf 
	 * @param template
	 * @param to
	 * @param subject
	 * @param variables
	 * @return String "Sucesso"; em caso de falha EmailException
	 */
	public String enviarEmailHtmlComThymeleaf(String template, String to, String subject, Map<String, Object> variables) {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, ENCODING);

			helper.setTo(to);
			helper.setSubject(subject);

			Context context = new Context();
			context.setVariables(variables);

			String content = templateEngine.process(template + ".html", context);
			helper.setText(content, true);
			
			ClassPathResource logoResource = new ClassPathResource("static/images/logo_SGC_v_positiva.png");
			helper.addInline("logo", logoResource);

			mailSender.send(message);
			return "Sucesso";
		} catch (MessagingException e) {
			throw new EmailException(e.getMessage(), e);
		}
	}

	public void sendTicketEventEmail(TicketEvent event) {
		Long materialId = event.getTicket().getMaterial();
		Material material = materialService.getById(materialId);
		
		List<User> users = new ArrayList<>();
		User userRequester = event.getTicket().getUserRequester();
		
		Ticket ticket = event.getTicket();
		Failure failure = failureService.getById(ticket.getOriginalFailure());

		users.add(userRequester);
		
		// Expressão regular para validar e-mails
	    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern emailPattern = Pattern.compile(emailRegex);
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		for(User user : users) {
			List<Contact> contacts = user.getContacts();
			if(contacts == null || contacts.isEmpty()) {
				continue;
			}
			
			for(Contact contact : contacts) {
				String value = contact.getValue();
				if(value != null && emailPattern.matcher(value).matches()) {
					LOGGER.info("[ES] - Enviando email para " + value);
					try {
						MimeMessage message = mailSender.createMimeMessage();
						MimeMessageHelper helper = new MimeMessageHelper(message, true, ENCODING);
						Map<String, Object> variables = new HashMap<>();
						
						variables.put("introducao", "Caro(a) " + user.getName() + ", ");
						variables.put("chamado", " Há uma mensagem referente ao chamado '" + ticket.getBeanIdentifier() + "'.");
						variables.put("status", "Status do chamado: " + TicketStatus.getDescriptionByName(ticket.getTicketStatus()) + ".");
						variables.put("dataHora", "Data e hora: " + event.getCreationDate().format(formatter) + ".");
						variables.put("solicitante", "Solicitante: " + userRequester.getName() + ".");
						variables.put("material", "Material: " + material.getEquipmentType().getName() + " (" + material.getEquipmentType().getPartNumber() + ").");
						variables.put("numSerie", "Número de série/Chassi: " + material.getSerialNumber() + ".");
						variables.put("dadosFalha", "Dados da falha: " + failure.getFailureName() + ".");
						variables.put("comentarioFalha", "Comentário da falha: " + ticket.getFailureDescription());

						//Aqui vai ser o "VALUE" do objeto "Contact"
						helper.setTo(value);
						helper.setSubject("[SISFRON - Sistema de Gerenciamento Logístico] Resumo do chamado - " + ticket.getBeanIdentifier());

						Context context = new Context();
						context.setVariables(variables);

						String content = templateEngine.process("email.html", context);
						helper.setText(content, true);

						mailSender.send(message);
						LOGGER.info("[ES] - Enviado");
					} catch (MessagingException e) {
						throw new EmailException(e.getMessage(), e);
					}
				}
			}
		}
	}
}
