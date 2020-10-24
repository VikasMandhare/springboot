package org.lasavi.tech.springboot.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

	@Autowired
	private SchoolService service;

	@RequestMapping("/students")
	private List<Student> getStudentsList() {
		return service.getStudentsList();
	}

	@RequestMapping("/students/{id}")
	private Student getStudentById(@PathVariable("id") int rollNo) {
		return service.getStudentById(rollNo);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/students/add")
	private String addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return "Success";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/update/{id}")
	private String updateStudent(@RequestBody Student student, @PathVariable("id") int rollNo) {
		service.updateStudent(student, rollNo);
		return "Success";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/delete/{id}")
	private String deleteStudent(@PathVariable("id") int rollNo) {
		service.deleteStudent(rollNo);
		return "Success";
	}
}
