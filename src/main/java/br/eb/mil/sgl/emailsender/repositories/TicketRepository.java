package br.eb.mil.sgl.emailsender.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.eb.mil.sgl.emailsender.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
}