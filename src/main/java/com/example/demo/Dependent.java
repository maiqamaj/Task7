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
@Table(name="dependents")
public class Dependent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dependentId;
	@Override
	public String toString() {
		return "Dependent [dependentId=" + dependentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", relationship=" + relationship + ", employee=" + employee + "]";
	}
	public int getDependentId() {
		return dependentId;
	}
	public void setDependentId(int dependentId) {
		this.dependentId = dependentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	private String firstName;
	private String lastName;
	private String relationship;

	@ManyToOne(targetEntity=Employee.class,cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	public Dependent() {super();}
	public Dependent(int dependentId,String firstName,String lastName,String relationship,Employee employee)
	{ super();
		this.dependentId = dependentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;

	}

}
