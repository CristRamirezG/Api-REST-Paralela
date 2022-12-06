package com.start.controllers.auth;

import java.util.Map;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/auth/login"})

public class LoginControllers {
	@GetMapping()
	public Map<String, Object> currentUser(OAuth2AuthenticationToken token) {
		return token.getPrincipal().getAttributes();
	}
}
