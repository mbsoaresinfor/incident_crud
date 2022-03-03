package br.com.mbs.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IncidentControllerTest {

	@Autowired
	private IncidentController controller;
	
	public void contextLoad() throws Exception {
		assertThat(controller).isNotNull();
	}
	
}
