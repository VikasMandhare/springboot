package org.lasavi.tech.springboot.learnbootjpa.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
	
	@Autowired
	SchoolRepository repository;
	
	List<Student> school = new ArrayList<>(Arrays.asList(new Student(101, "vikas", "mandhare"),
			new Student(102, "rajashree", "mandhare")));

	public List<Student> getStudentsList() {
		List<Student> students = new ArrayList<>();
		repository.findAll().forEach(students::add);
		return students;
	}

	public Optional<Student> getStudentById(int rollno) {
		return repository.findById(rollno);
	}

	public void addStudent(Student student) {
		repository.save(student);
	}

	public void updateStudent(Student student, int rollno) {
		repository.save(student);
	}

	public void deleteStudent(int rollno) {
		repository.deleteById(rollno);
	}
}
