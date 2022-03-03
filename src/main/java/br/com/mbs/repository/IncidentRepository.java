package br.com.mbs.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mbs.entity.Incident; 

public interface IncidentRepository extends CrudRepository<Incident, Integer> {

	
}
