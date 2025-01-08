package br.eb.mil.sgl.emailsender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eb.mil.sgl.emailsender.entities.Material;
import br.eb.mil.sgl.emailsender.services.MaterialService;

@RestController
@RequestMapping(value = "/materials")
public class MaterialController {

	@Autowired
	private MaterialService materialService;
	
	@GetMapping
	public ResponseEntity<Page<Material>> getAll(Pageable pageable) {
		return ResponseEntity.ok().body(materialService.getAll(pageable));
	}
}
