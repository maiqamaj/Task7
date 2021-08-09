package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int job_id;
	private String jobTitle;
	private double minSalary;
	public Job()
	{}
	public Job(int job_id,String jobTitle,double minSalary,double maxSalary)
	{
		this.job_id = job_id;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + job_id + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}
	public int getJobId() {
		return job_id;
	}
	public void setJobId(int jobId) {
		this.job_id = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}
	public double getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}
	private double maxSalary;
}
