package com.example.care_management_system.dto;


import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JwtResponse {
    public JwtResponse(String token, String expiry) {
		super();
		this.token = token;
		this.expiry = expiry;
	}

	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}



	public JwtResponse() {
		super();
	}



	private String token;
    private String expiry; // human-readable date string

    public JwtResponse(String token, long expiryMillis) {
        this.token = token;
        this.expiry = convertMillisToReadableDate(expiryMillis);
    }

    private String convertMillisToReadableDate(long millis) {
        return Instant.ofEpochMilli(millis)
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
