package br.eb.mil.sgl.emailsender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eb.mil.sgl.emailsender.entities.TicketEvent;
import br.eb.mil.sgl.emailsender.services.TicketEventService;

@RestController
@RequestMapping(value = "/ticketevents")
public class TicketEventController {

	@Autowired
	private TicketEventService ticketEventService;
	
	@GetMapping
	public ResponseEntity<Page<TicketEvent>> getAll(Pageable pageable) {
		return ResponseEntity.ok().body(ticketEventService.getAll(pageable));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TicketEvent> getById(@PathVariable Long id) {
		return ResponseEntity.ok().body(ticketEventService.getById(id));
	}
	
//	@GetMapping(value = "/recent")
//	public ResponseEntity<List<TicketEvent>> getRecentTicketEvents() {
//		return ResponseEntity.ok().body(ticketEventService.findRecentTicketEvents());
//	}
}
