package com.frs.demo.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FlatDto {
	@Id
	@Column(name="flatid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flatid;
	@Column(name="cost")
	@NotNull
	private float cost;
	@Column(name="flatAddress")
	@NotNull
	private String flatAddress;
	@Column(name="availability")
	@NotNull
	private String availability;

	public FlatDto() {
		
	}
	public FlatDto(int flatid, float cost, String flatAddress, String availability) {
		super();
		this.flatid = flatid;
		this.cost = cost;
		this.flatAddress = flatAddress;
		this.availability = availability;
	}
	public int getFlatid() {
		return flatid;
	}
	public void setFlatid(int flatid) {
		this.flatid = flatid;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getFlatAddress() {
		return flatAddress;
	}
	public void setFlatAddress(String flatAddress) {
		this.flatAddress = flatAddress;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
}

