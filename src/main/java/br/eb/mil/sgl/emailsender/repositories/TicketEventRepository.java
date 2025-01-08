package br.eb.mil.sgl.emailsender.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.eb.mil.sgl.emailsender.entities.TicketEvent;

@Repository
public interface TicketEventRepository extends JpaRepository<TicketEvent, Long>{
	@Query("SELECT te FROM TicketEvent te WHERE te.creationDate >= :recentDate AND te.deleted = 0")
	List<TicketEvent> findRecentEvents(@Param("recentDate") LocalDateTime recentDate);
	
	@Query("SELECT te FROM TicketEvent te WHERE te.creationDate >= :startTime AND te.creationDate < :endTime")
	List<TicketEvent> findRecentEvents(LocalDateTime startTime, LocalDateTime endTime);
}