package com.qa.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Name;
import com.qa.service.business.NameServiceable;

@CrossOrigin
@RequestMapping("/names")
@RestController
public class NameEndPoint {

	@Autowired
	private NameServiceable service;

	@GetMapping("/getAllNames")
	public Iterable<Name> getAllNames() {
		return service.getAll();
	}

	@GetMapping("/getName/{id}")
	public Optional<Name> getName(@PathVariable Long id) {
		return service.get(id);
	}

	@DeleteMapping("/deleteName/{id}")
	public void deleteName(@PathVariable Long id) {
		service.delete(id);
	}
	
	@PostMapping("/addName")
	public Name addName(@RequestBody Name name) {
		return service.add(name);
	}
	
	@PutMapping("/updateName/{id}")
	public void updateName(@RequestBody Long id, @RequestBody String name) {
		service.update(id, name);
	}
	//Not sure that this will actually work 
	
}
