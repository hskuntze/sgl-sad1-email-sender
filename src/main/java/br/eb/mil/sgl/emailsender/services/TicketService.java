package br.eb.mil.sgl.emailsender.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.eb.mil.sgl.emailsender.entities.Ticket;
import br.eb.mil.sgl.emailsender.exceptions.ResourceNotFoundException;
import br.eb.mil.sgl.emailsender.repositories.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	public List<Ticket> getAll() {
		return ticketRepository.findAll();
	}
	
	public Ticket getById(Long id) {
		return ticketRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ticket with ID "+id+" not found"));
	}
}
