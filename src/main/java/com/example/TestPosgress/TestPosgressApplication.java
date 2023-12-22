package com.example.TestPosgress;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestPosgressApplication implements CommandLineRunner{

	@Autowired
	StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestPosgressApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Student student = new Student();
		Book book = new Book();
		book.setBookname("Sanjay's Book");
		student.setName("SanjayStudent");
		student.setBook(book);
		studentRepository.save(student); */
		Student ob = (Student)studentRepository.findByStudentid(1);		
			System.out.println(ob.getBook().getBookname());

		
	}

}
