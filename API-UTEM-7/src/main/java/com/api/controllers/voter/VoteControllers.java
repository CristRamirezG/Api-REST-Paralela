package com.api.controllers.voter;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.api.models.voter.OpcionModel;
import com.api.models.voter.VoteModel;
import com.api.services.voter.VoteService;

import io.swagger.annotations.Api;
@CrossOrigin
@RestController

@RequestMapping(value = {"/voter/vote"})
public class VoteControllers {
	@Autowired
	VoteService voteService;
	
	@PostMapping()
	public List<OpcionModel> IngresaVoto (@RequestBody VoteModel voto) {
		List<OpcionModel> Lista = voteService.AlmacenarVoto(voto);
		return Lista;
	}
	
	/*
	public VoteModel IngresaVoto (VoteModel voto) {
		List<OpcionModel> a = voteService.AlmacenarVoto(voto);
		return voto;
	}
	*/
	
	
}
