package org.lasavi.tech.springboot.students;

public class Student {

	int rollNO;
	String firstName;
	String lastName;

	public Student(int rollNO, String firstName, String lastName) {
		super();
		this.rollNO = rollNO;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
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
