package com.example.care_management_system.dto;


public class AuthResponse {
    private final String jwt;

   

	public AuthResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

}
