package com.example.care_management_system.repository;

import com.example.care_management_system.entity.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {
}
