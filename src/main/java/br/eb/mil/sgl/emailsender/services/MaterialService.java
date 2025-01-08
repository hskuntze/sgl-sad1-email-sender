package br.eb.mil.sgl.emailsender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.eb.mil.sgl.emailsender.entities.Material;
import br.eb.mil.sgl.emailsender.exceptions.ResourceNotFoundException;
import br.eb.mil.sgl.emailsender.repositories.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	
	public Page<Material> getAll(Pageable pageable) {
		return materialRepository.findAll(pageable);
	}
	
	public Material getById(Long id) {
		return materialRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Material with ID " + id + " was not found."));
	}
}