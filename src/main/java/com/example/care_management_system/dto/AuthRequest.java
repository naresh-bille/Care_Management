package com.example.care_management_system.dto;

import com.example.care_management_system.entity.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class AuthRequest {

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;

    
    private Role role; // USER / ADMIN
    
    
    
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAdminSecretKey() {
		return adminSecretKey;
	}

	public void setAdminSecretKey(String adminSecretKey) {
		this.adminSecretKey = adminSecretKey;
	}

	private String adminSecretKey; // optional
    
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
