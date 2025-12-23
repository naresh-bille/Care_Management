package com.example.care_management_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class AuthRequest {

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;

    public String getEmail() {
		return email;
	}

	public AuthRequest() {
		super();
	}

	public AuthRequest(@NotBlank(message = "Email is mandatory") @Email(message = "Invalid email format") String email,
			@NotBlank(message = "Password is mandatory") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotBlank(message = "Password is mandatory")
    private String password;

}
