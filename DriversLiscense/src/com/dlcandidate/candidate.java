package com.dlcandidate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class candidate {
	private String name;
	private int age;
	private int polVerify;
	private int medVerify;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPolVerify() {
		return polVerify;
	}
	public void setPolVerify(int polVerify) {
		this.polVerify = polVerify;
	}
	public int getMedVerify() {
		return medVerify;
	}
	public void setMedVerify(int medVerify) {
		this.medVerify = medVerify;
	}
	public candidate(String name, int age, int polVerify, int medVerify) {
		super();
		this.name = name;
		this.age = age;
		this.polVerify = polVerify;
		this.medVerify = medVerify;
	}
	@Override
	public String toString() {
		return "candidate [name=" + name + ", age=" + age + ", polVerify=" + polVerify + ", medVerify=" + medVerify
				+ "]";
	}
	
	Log log= LogFactory.getLog(candidate.class);
	
	public void checkAge() {
		if (this.age<18) {
			log.error("The age is less than 18");
			throw new RuntimeException("Age not verified");
		}
	}
	
	public void verifyMedical() {
		if (this.medVerify!=1) {
			log.error("There are no medical records");
			throw new RuntimeException("Medical records not found");
		}
	}
	
	public void verifyPolice() {
		if (this.polVerify!=1) {
			log.error("Police verification not done");
			throw new RuntimeException("Police verification not done");
		}
	}
	public void check() {
		this.checkAge();
		this.verifyMedical();
		this.verifyPolice();
	}
}
