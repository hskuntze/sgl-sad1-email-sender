package br.eb.mil.sgl.emailsender.services;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.eb.mil.sgl.emailsender.entities.TicketEvent;
import br.eb.mil.sgl.emailsender.exceptions.ResourceNotFoundException;
import br.eb.mil.sgl.emailsender.repositories.TicketEventRepository;

@Service
public class TicketEventService {

	@Autowired
	private TicketEventRepository ticketEventRepository;
	
	@Autowired
	private EmailService emailService;
	
	private Set<Long> processedEventIds = new HashSet<>();
	
	public Page<TicketEvent> getAll(Pageable pageable) {
		return ticketEventRepository.findAll(pageable);
	}
	
	public TicketEvent getById(Long id) {
		return ticketEventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("TicketEvent with ID " + id + " not found."));
	}
	
	//A cada 60.4s faz a verificação de novos registros
	@Scheduled(fixedRate = 60400)
	public void findRecentTicketEvents() {
		LocalDateTime now = LocalDateTime.now().plusHours(1);
		LocalDateTime oneMinAgo = now.minusSeconds(59);
		List<TicketEvent> recentEvents = ticketEventRepository.findRecentEvents(oneMinAgo, now);
		
		for(TicketEvent event : recentEvents) {
			if(!processedEventIds.contains(event.getId())) {
				processedEventIds.add(event.getId());
				emailService.sendTicketEventEmail(event);
			}
		}
	}
	
	//A cada 24h limpa o cache interno
	@Scheduled(fixedRate = 86400000)
	public void cleanProcessedEventIds() {
		processedEventIds.clear();
	}
}
