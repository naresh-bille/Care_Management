package com.example.care_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FamilyMembersNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public FamilyMembersNotFoundException(String message) {
        super(message);
    }
}
