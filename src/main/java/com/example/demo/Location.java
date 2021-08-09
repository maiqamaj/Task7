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
@Table(name="locations")
public  class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int location_id;
	private String streetAddress;
	private String postalCode;
	
	private String city;
	private String stateProvince;

	@ManyToOne(targetEntity=Country.class,cascade=CascadeType.ALL)
	@JoinColumn(name="country_id")
	private Country country;
	public Location() {super();}
	public Location(int locationId,String postalCode,String streetAddress,String city,String stateProvince,List<Country>  country)
	{super();
		this.location_id = locationId;
		this.postalCode = postalCode;
		this.streetAddress = streetAddress;
		this.city = city;
		this.stateProvince = stateProvince;
		
	}

	
	@Override
	public String toString() {
		return "Location [locationId=" + location_id + ", postalCode=" + postalCode + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", country=" + country + ", stateProvince=" + stateProvince + "]";
	}
	public int getLocationId() {
		return location_id;
	}
	public void setLocationId(int locationId) {
		this.location_id = locationId;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Country  getCountry() {
		return country;
	}
	public void setCountry(Country  country) {
		this.country = country;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
	

}
