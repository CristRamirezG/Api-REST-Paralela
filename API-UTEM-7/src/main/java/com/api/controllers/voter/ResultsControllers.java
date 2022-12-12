package com.api.controllers.voter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.voter.OpcionModel;
import com.api.models.voter.ResultStruct;
import com.api.services.voter.ResultService;

import io.swagger.annotations.Api;
@CrossOrigin
@RestController

@RequestMapping(value = {"/voter/{token}"})
public class ResultsControllers {

	@Autowired
	ResultService resultService;
	@GetMapping("/results")
	public  ResultStruct MostrarResultado(@PathVariable("token") Long token) {
		
		return resultService.ObtenerResultado(token);
	}
	@PostMapping("/Crear")
	public  OpcionModel CrearOpcion(@PathVariable("token") Long token, @RequestBody OpcionModel opcion) {
		
		return resultService.CrearOpcion(token,opcion);
	}
	
}
