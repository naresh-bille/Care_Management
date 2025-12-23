package com.example.care_management_system.dto;

import com.example.care_management_system.entity.ServiceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;


public class BookingRequest {

    public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public ServiceType getCareType() {
		return careType;
	}

	public void setCareType(ServiceType careType) {
		this.careType = careType;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BookingRequest() {
		super();
	}

	@NotBlank(message = "Resource type is required")
    private String resourceType;   // e.g. PET or FAMILY_MEMBER

    public BookingRequest(@NotBlank(message = "Resource type is required") String resourceType,
			@NotNull(message = "Resource ID is required") Long resourceId,
			@NotNull(message = "Care type is required") ServiceType careType,
			@NotNull(message = "Appointment date is required") LocalDate appointmentDate, String notes) {
		super();
		this.resourceType = resourceType;
		this.resourceId = resourceId;
		this.careType = careType;
		this.appointmentDate = appointmentDate;
		this.notes = notes;
	}

	@NotNull(message = "Resource ID is required")
    private Long resourceId;

    @NotNull(message = "Care type is required")
    private ServiceType careType;  // FULL_DAY, HALF_DAY, HOURLY

    @NotNull(message = "Appointment date is required")
    private LocalDate appointmentDate;

    private String notes;

}
