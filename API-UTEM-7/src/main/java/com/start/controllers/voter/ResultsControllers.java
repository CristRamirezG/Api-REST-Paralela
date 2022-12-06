package com.start.controllers.voter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.start.models.voter.ResultStruct;
import com.start.services.voter.ResultService;
@RestController
@RequestMapping(value = {"/voter/{token}/results"})
public class ResultsControllers {

	@Autowired
	ResultService resultService;
	@GetMapping()
	public  ResultStruct MostrarResultado(@PathVariable("token") Long token) {
		
		return resultService.ObtenerResultado(token);
	}
	
}
