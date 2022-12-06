package com.start.controllers.voter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.start.models.voter.PollModel;
import com.start.services.voter.PollService;

@RestController
@RequestMapping(value = {"/voter/polls"})
public class PollsControllers {
	@Autowired
	PollService pollService;
	@GetMapping()
	public List<PollModel> MostrarEncuestas() {
		
		return pollService.obtenerEncuestas();
	}
}
