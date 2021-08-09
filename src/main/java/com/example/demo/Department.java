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
@Table(name="departments")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int department_id;
	private String departmentName;
	@ManyToOne(targetEntity=Location.class,cascade=CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location location;
	
	 public Department() {super();}
		public Department(int departmentId, String departmentName,List<Location> location) {
			super();
			this.department_id = departmentId;
			this.departmentName = departmentName;

		}
		
	@Override
	public String toString() {
		return "Department [departmentId=" + department_id + ", departmentName=" + departmentName + ", location="
				+ location + "]";
	}
	public int getDepartmentId() {
		return department_id;
	}
	public void setDepartmentId(int departmentId) {
		this.department_id = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
