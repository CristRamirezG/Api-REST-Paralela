package com.start.controllers.auth;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2LoginAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.start.models.voter.VoteModel;
import com.start.services.voter.VoteService;

@RestController
@RequestMapping(value = {"/auth/jwt"})
public class jwtControllers {
	
	@GetMapping()
	public String currentUser( OAuth2LoginAuthenticationToken token) {
		return token.getName();
	}
	
	
}
//@RequestMapping(value = {"/auth/{token}/jwt"})@PathVariable("token")