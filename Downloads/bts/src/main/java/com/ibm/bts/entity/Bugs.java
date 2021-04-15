package com.ibm.bts.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Bugs {
    @Id
	private String id;
	private String Description;
	@NotNull
	private String Status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
