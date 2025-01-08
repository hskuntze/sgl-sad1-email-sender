package br.eb.mil.sgl.emailsender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.eb.mil.sgl.emailsender.entities.Failure;
import br.eb.mil.sgl.emailsender.exceptions.ResourceNotFoundException;
import br.eb.mil.sgl.emailsender.repositories.FailureRepository;

@Service
public class FailureService {

	@Autowired
	private FailureRepository failureRepository;
	
	public Failure getById(Long id) {
		return failureRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Failure with ID " + id + " was not found."));
	}
}
