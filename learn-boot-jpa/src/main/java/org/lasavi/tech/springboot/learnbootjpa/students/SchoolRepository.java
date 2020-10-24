package org.lasavi.tech.springboot.learnbootjpa.students;

import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<Student,Integer> {

}
