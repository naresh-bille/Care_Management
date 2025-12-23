package com.example.care_management_system.dto;



import java.time.LocalDate;


public class FamilyMemberRequest {
    private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getGender() {
		return gender;
	}
	public FamilyMemberRequest(String name, String relation, String gender, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.relation = relation;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "FamilyMemberRequest [name=" + name + ", relation=" + relation + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	public FamilyMemberRequest() {
		super();
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	private String relation;
    private String gender;
    private LocalDate dateOfBirth;
}
