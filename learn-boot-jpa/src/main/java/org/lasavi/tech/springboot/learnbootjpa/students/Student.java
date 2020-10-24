package org.lasavi.tech.springboot.learnbootjpa.students;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	Integer rollNO;
	String firstName;
	String lastName;

	public Student() {
		// default
	}

	public Student(Integer rollNO, String firstName, String lastName) {
		super();
		this.rollNO = rollNO;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getRollNO() {
		return rollNO;
	}

	public void setRollNO(Integer rollNO) {
		this.rollNO = rollNO;
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

}
