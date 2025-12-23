package com.example.care_management_system.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetRequest {
	
	private String name;
	private String type;
	private String breed;
	
	private String gender;
	private Integer age;
	
    public PetRequest(String name, String type, String breed, String gender, Integer age) {
		super();
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
	}
	public PetRequest() {
		super();
	}
	@Override
	public String toString() {
		return "PetRequest [name=" + name + ", type=" + type + ", breed=" + breed + ", gender=" + gender + ", age="
				+ age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
