package com.example.care_management_system.dto;

import com.example.care_management_system.entity.FamilyMember;
import com.example.care_management_system.entity.Pet;

import java.util.List;


public class UserResourcesResponse {
    private List<FamilyMember> familyMembers;
    private List<Pet> pets;
	public UserResourcesResponse(List<FamilyMember> familyMembers, List<Pet> pets) {
		super();
		this.familyMembers = familyMembers;
		this.pets = pets;
	}
	public List<FamilyMember> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(List<FamilyMember> familyMembers) {
		this.familyMembers = familyMembers;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public UserResourcesResponse() {
		super();
	}

	
}
