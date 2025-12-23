package com.example.care_management_system.dto;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


public class BookingResponse {
    private Long bookingId;
    private String resourceType;
    private ResourceInfo resource;
    private String careType;
    public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public ResourceInfo getResource() {
		return resource;
	}

	public void setResource(ResourceInfo resource) {
		this.resource = resource;
	}

	public String getCareType() {
		return careType;
	}

	public void setCareType(String careType) {
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

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "BookingResponse [bookingId=" + bookingId + ", resourceType=" + resourceType + ", resource=" + resource
				+ ", careType=" + careType + ", appointmentDate=" + appointmentDate + ", notes=" + notes
				+ ", paymentStatus=" + paymentStatus + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	private LocalDate appointmentDate;
    private String notes;
    private String paymentStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor
    public BookingResponse(Long bookingId, String resourceType, ResourceInfo resource, 
                          String careType, LocalDate appointmentDate, 
                          String notes, String paymentStatus,
                          LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.bookingId = bookingId;
        this.resourceType = resourceType;
        this.resource = resource;
        this.careType = careType;
        this.appointmentDate = appointmentDate;
        this.notes = notes;
        this.paymentStatus = paymentStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
