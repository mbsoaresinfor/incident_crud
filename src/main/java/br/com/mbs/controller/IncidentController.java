package br.com.mbs.controller;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.mbs.api.IncidentApi;
import br.com.mbs.entity.Incident;
import br.com.mbs.model.IncidentResponse;
import br.com.mbs.model.IncidentSaveRequest;
import br.com.mbs.model.IncidentUpdateRequest;
import br.com.mbs.service.IncidentService;

@RestController
@RequestMapping(path = "/v1")
public class IncidentController implements IncidentApi {
	
	@Autowired
	 private IncidentService incidentService;
	
	@Autowired
	private ModelMapper modelMapper;


	@Override
	public ResponseEntity<Void> delete(Long id) {				
		incidentService.delete(id.intValue());
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<List<IncidentResponse>> list() {
		List<IncidentResponse> response = new ArrayList<IncidentResponse>();
		incidentService.list().forEach( i -> response.add(modelMapper.map(i, IncidentResponse.class)));
		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<IncidentResponse> save(IncidentSaveRequest body) {
		Incident request = modelMapper.map(body, Incident.class);
		IncidentResponse response =  modelMapper.map(incidentService.save(request), IncidentResponse.class);		
		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<Void> update(IncidentUpdateRequest body) {
		
		Incident request = modelMapper.map(body, Incident.class);
		incidentService.update(request);
		return ResponseEntity.ok().build();
	}
	
	
}
