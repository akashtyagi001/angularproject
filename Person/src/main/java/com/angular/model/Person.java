package com.angular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person1")
public class Person {
	
	@Id
	@Column(name="PersonId")
private int personId;


	@Column(name="PersonName")
private String personName;


	@Column(name="gender")
private String gender;

	@Column(name="age")
	private String age;
	
	
	@Column(name="Password")
	private String password;


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", gender=" + gender + ", age=" + age
				+ ", password=" + password + "]";
	}
}

