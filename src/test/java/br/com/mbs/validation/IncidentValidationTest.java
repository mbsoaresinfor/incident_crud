package br.com.mbs.validation;

import org.junit.Assert;
import org.junit.Test;

import br.com.mbs.entity.Incident;

public class IncidentValidationTest {

	IncidentValidation incidentValidation = new IncidentValidation();
	
	@Test
	public void validaNull() {
		try {
			incidentValidation.valida(null);
			Assert.fail();
		}catch(Exception e) {}
	}
	
	@Test
	public void validaParam() {
		try {
			Incident incidente =new Incident();
			incidentValidation.valida(incidente);
			Assert.fail();
		}catch(Exception e) {}
	}
}
