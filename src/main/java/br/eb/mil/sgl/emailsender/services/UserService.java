package br.eb.mil.sgl.emailsender.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.eb.mil.sgl.emailsender.entities.User;
import br.eb.mil.sgl.emailsender.exceptions.ResourceNotFoundException;
import br.eb.mil.sgl.emailsender.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public User getById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with ID " + id + " was not found."));
	}
}
