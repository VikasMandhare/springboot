package org.lasavi.tech.springboot.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SchoolService {

	List<Student> school = new ArrayList<>(Arrays.asList(new Student(101, "vikas", "mandhare"),
			new Student(102, "rajashree", "mandhare")));

	public List<Student> getStudentsList() {
		return school;
	}

	public Student getStudentById(int id) {
		return school.stream().filter(t -> t.getRollNO() == id).findFirst().get();
	}

	public void addStudent(Student student) {
		school.add(student);
	}

	public void updateStudent(Student student, int rollno) {
		for (int i = 0; i < school.size(); i++) {
			if (school.get(i).getRollNO() == rollno) {
				school.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(int rollno) {
		for (int i = 0; i < school.size(); i++) {
			if (school.get(i).getRollNO() == rollno) {
				school.remove(i);
				return;
			}
		}
	}
}
