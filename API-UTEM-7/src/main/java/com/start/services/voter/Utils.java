package com.start.services.voter;

import org.springframework.stereotype.Service;

@Service
public class Utils {

	
	public Long Hash(Long id) {
		id= id + 4545 * 45;
		return id;
	}
}
