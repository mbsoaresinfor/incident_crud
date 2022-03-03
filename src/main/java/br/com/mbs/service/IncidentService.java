package br.com.mbs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mbs.entity.Incident;
import br.com.mbs.exception.ValidationException;
import br.com.mbs.repository.IncidentRepository;
import br.com.mbs.validation.IncidentValidation;


@Service
public class IncidentService {

	@Autowired
	private IncidentRepository incidentRepository;
	
	@Autowired
	private IncidentValidation incidentValidation;
	
	public void delete(Integer idIncident) throws ValidationException {
		boolean isOkIdIncident = idIncident != null && idIncident > 0;		
		
		if(isOkIdIncident) {
			incidentRepository.deleteById(idIncident);
		}else {
			throw new ValidationException("Not was it possible delete Incident");
		}
		
	}

	
	public List<Incident> list() {		
		List<Incident> list = new ArrayList<Incident>();
		incidentRepository.findAll().forEach( i -> list.add(i));
		return list;
	}

	
	public Incident save(Incident incident) throws ValidationException{
		incidentValidation.valida(incident);
		incident.setCreatedAt(new Date());
		return incidentRepository.save(incident);		
	}

	
	public void  update(Incident incident) throws ValidationException {
		incidentValidation.valida(incident);
		Optional<Incident> opt =  incidentRepository.findById(incident.getIdIncident());
		if(opt.isPresent()) {
			Incident incidentFromDb = opt.get();
			incident.setUpdatedAt(new Date());
			if(incident.getClosedAIncident()) {
				incident.setClosedAt3(new Date());
			}
			incident.setCreatedAt(incidentFromDb.getCreatedAt());
			
			incidentRepository.save(incident);
		}else {
			throw new ValidationException("There is not Incident with idIncident " + incident.getIdIncident());
		}
		
	}

	
}
