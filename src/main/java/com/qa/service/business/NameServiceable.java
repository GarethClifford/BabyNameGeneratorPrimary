package com.qa.service.business;

import java.util.Optional;

import com.qa.persistence.domain.Name;
import com.qa.persistence.repository.NameRepoable;

public interface NameServiceable {

	void setRepo(NameRepoable persist);

	Iterable<Name> getAll();

	Name add(Name name);

	void delete(Long id);

	Optional<Name> get(Long id);

	void update(Long id, String name);
	//Not sure that this update function actually works!!!!!

}