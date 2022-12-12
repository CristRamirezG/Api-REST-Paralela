package com.api.controllers.voter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.voter.PollModel;
import com.api.services.voter.PollService;

import io.swagger.annotations.Api;
@CrossOrigin
@RestController

@RequestMapping(value = {"/voter/polls"})
public class PollsControllers {
	@Autowired
	PollService pollService;
	@GetMapping("/Mostrar")
	public List<PollModel> MostrarEncuestas() {
		
		return pollService.obtenerEncuestas();
	}
	@PostMapping("/Crear")
	public PollModel CrearEncuesta(@RequestBody PollModel poll) {
		pollService.GuardarPoll(poll);
		return poll;
	}
	
	
}
