package com.example.care_management_system.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "schedule_bookings")
@EntityListeners(AuditingEntityListener.class)
public class ScheduleBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long bookingId;

    @Column(nullable = false)
    private String resourceType;     // "PET" or "FAMILY_MEMBER"

    @Column(nullable = false)
    private Long resourceId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ServiceType careType;    // FULL_DAY, HALF_DAY, HOURLY

    @Column(nullable = false)
    private LocalDate appointmentDate;

    private String notes;

    private String paymentStatus;    // e.g., PENDING, PAID

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

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long uuid) {
		this.resourceId = uuid;
	}

	public ServiceType getCareType() {
		return careType;
	}

	public void setCareType(ServiceType careType) {
		this.careType = careType;
	}

	public ScheduleBooking(Long bookingId, String resourceType, Long resourceId, ServiceType careType,
			LocalDate appointmentDate, String notes, String paymentStatus, User user, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.bookingId = bookingId;
		this.resourceType = resourceType;
		this.resourceId = resourceId;
		this.careType = careType;
		this.appointmentDate = appointmentDate;
		this.notes = notes;
		this.paymentStatus = paymentStatus;
		this.user = user;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ScheduleBooking() {
		super();
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
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

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
