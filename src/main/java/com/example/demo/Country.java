package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String country_Id;
	private String countryName;
	@ManyToOne(targetEntity=Region.class,cascade=CascadeType.ALL)
	@JoinColumn(name="region_id")
	private Region region;
	
	public Country() {
		 super();
	}
	

	public Country(String countryId, String countryName,Region region) {
		super();
		this.countryName = countryName;
		this.country_Id = countryId;
		

	}
		
	@Override
	public String toString() {
		return "Country [countryId=" + country_Id + ", countryName=" + countryName + ", region=" + region + "]";
	}
	public String getCountryId() {
		return country_Id;
	}
	public void setCountryId(String countryId) {
		this.country_Id = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
}
