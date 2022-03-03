package br.com.mbs.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IncidentCrudConfiguration {

	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
