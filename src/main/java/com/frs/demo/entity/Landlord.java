package com.frs.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "landlord")
public class Landlord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "landlordId")
	private int landlordId;

	@Column(name = "landlordName")
	@NonNull
	private String landlordName;

	@Column(name = "landlordAge")
	@Min(18)
	@Max(80)
	@NonNull
	private int landlordAge;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Flat> flatList ;

	public Landlord() {

	}

	public Landlord(int landlordId, String landlordName, int landlordAge, List<Flat> flatList) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
		this.flatList = flatList;
	}

	public int getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}

	public String getLandlordName() {
		return landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}

	public int getLandlordAge() {
		return landlordAge;
	}

	public void setLandlordAge(int landlordAge) {
		this.landlordAge = landlordAge;
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}

}