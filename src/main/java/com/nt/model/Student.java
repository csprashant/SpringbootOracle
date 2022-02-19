package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", per=" + per + "]";
	}
	@Column(name ="name")
	private String name;
	@Id
	@Column(name="roll")
	private Integer roll;
	@Column(name="per")
	private Double per;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}
	
	

}
