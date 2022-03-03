package br.com.mbs.validation;

import org.springframework.stereotype.Component;

import br.com.mbs.entity.Incident;
import br.com.mbs.exception.ValidationException;


@Component
public class IncidentValidation {

	public void valida(Incident incident) throws ValidationException {
		
		if(incident == null) {
			throw new ValidationException("Incident null");
		}
		
		boolean isNameEmpty = incident.getName().isBlank();
		if(isNameEmpty) {
			throw new ValidationException("Field name is empty");
		}
		
		boolean isDescrptionDescription = incident.getDescription().isBlank();
		if(isDescrptionDescription) {
			throw new ValidationException("Field Description is empty");
		}		
		
	}
}
