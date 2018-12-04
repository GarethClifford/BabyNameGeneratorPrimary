package com.qa.service.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Name;
import com.qa.persistence.repository.NameRepoable;
import com.qa.service.external.APICaller;

@Service
public class NameServiceImpl implements NameServiceable {

	@Autowired
	private NameRepoable repo;
	
	@Autowired
	private APICaller caller;
	
	@Override
	public void setRepo(NameRepoable persist) {
		this.repo = persist;
	}
	
	@Override
	public Iterable<Name> getAll() {
		return repo.findAll();
	}
	
	@Override
	public Name add(Name name) {
		name.setActualName(caller.getBabyName());
		caller.persist(name);
		return repo.save(name);
	}
	
	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	@Override
	public Optional<Name> get(Long id) {
		return repo.findById(id);
	}
	
	
	@Override
	public void update(Long id, String name) {
		String existance = repo.getOne(id).getActualName();
		if (existance != null) {
			existance.replaceAll(existance, name);
		}
	}
	//Not sure that this update function actually works!!!!!
	
 	
}
