package br.eb.mil.sgl.emailsender.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eb.mil.sgl.emailsender.entities.Ticket;
import br.eb.mil.sgl.emailsender.services.TicketService;

@RestController
@RequestMapping(value = "/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@GetMapping
	public ResponseEntity<List<Ticket>> getAll() {
		return ResponseEntity.ok().body(ticketService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Ticket> getById(@PathVariable Long id) {
		return ResponseEntity.ok().body(ticketService.getById(id));
	}
}
