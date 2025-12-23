package com.example.care_management_system.repository;

import com.example.care_management_system.entity.ScheduleBooking;
import com.example.care_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleBookingRepository extends JpaRepository<ScheduleBooking, Long> {
    List<ScheduleBooking> findAllByUser(User user);
}
