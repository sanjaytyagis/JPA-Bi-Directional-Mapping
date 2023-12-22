package com.example.TestPosgress;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {

	Student findByName(String i);
	Student findByStudentid(int i);

}
