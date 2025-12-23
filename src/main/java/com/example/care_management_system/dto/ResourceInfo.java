package com.example.care_management_system.dto;



import java.util.UUID;


public class ResourceInfo {
    private Long resourceId;
    public ResourceInfo(Long resourceId, String name) {
		super();
		this.resourceId = resourceId;
		this.name = name;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourceInfo() {
		super();
	}

	private String name;

    

}
