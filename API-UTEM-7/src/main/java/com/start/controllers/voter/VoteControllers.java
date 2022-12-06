package com.start.controllers.voter;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.start.models.voter.OpcionModel;
import com.start.models.voter.VoteModel;
import com.start.services.voter.VoteService;

@RestController
@RequestMapping(value = {"/voter/vote"})
public class VoteControllers {
	@Autowired
	VoteService voteService;
	
	@PostMapping()
	public List<OpcionModel> IngresaVoto (VoteModel voto) {
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
