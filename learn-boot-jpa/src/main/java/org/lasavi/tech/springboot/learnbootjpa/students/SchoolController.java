package org.lasavi.tech.springboot.learnbootjpa.students;

import java.util.List;
import java.util.Optional;

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
	private Optional<Student> getStudentById(@PathVariable("id") Integer rollNo) {
		return service.getStudentById(rollNo);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/students/add")
	private String addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return "Success";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/update/{id}")
	private String updateStudent(@RequestBody Student student, @PathVariable("id") Integer rollNo) {
		service.updateStudent(student, rollNo);
		return "Success";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/delete/{id}")
	private String deleteStudent(@PathVariable("id") Integer rollNo) {
		service.deleteStudent(rollNo);
		return "Success";
	}
}
