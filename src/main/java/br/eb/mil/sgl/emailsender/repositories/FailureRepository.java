package br.eb.mil.sgl.emailsender.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.eb.mil.sgl.emailsender.entities.Failure;

@Repository
public interface FailureRepository extends JpaRepository<Failure, Long>{
}