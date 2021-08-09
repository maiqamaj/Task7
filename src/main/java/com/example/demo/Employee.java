package com.example.demo;

import java.util.HashSet;

import java.util.Set;

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
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", salary=" + salary
				+ ", managerId=" + managerId + ", job=" + job + ", depatrtment=" + depatrtment + "]";
	}
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private double salary;
	@ManyToOne(targetEntity=Employee.class,cascade=CascadeType.ALL)
	private Employee managerId ;
	@ManyToOne(targetEntity=Job.class,cascade=CascadeType.ALL)
	@JoinColumn(name="job_id")
	private Job job= new Job();
	@ManyToOne(targetEntity=Department.class,cascade=CascadeType.ALL)
	@JoinColumn(name="department_id")
	 private Department depatrtment= new Department();
	
	public Employee()
    {
        super();
    }
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			String hireDate, double salary, Employee managerId,Job job, Department depatrtment) {
		 super();
		 
		 this.employee_id = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.hireDate = hireDate;
			this.salary = salary;
			
			
	}
	public int getEmployeeId() {
		return employee_id;
	}
	public void setEmployeeId(int employeeId) {
		this.employee_id = employeeId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Employee getManagerId() {
		return managerId;
	}
	public void setManagerId(Employee managerId) {
		this.managerId = managerId;
	}
	public Department getDepatrtment() {
		return depatrtment;
	}
	public void setDepatrtment(Department depatrtment) {
		this.depatrtment = depatrtment;
	}

}
