package com.example.TestPosgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
	    Student object = (Student)studentRepository.findByStudentid(id);
	    if(object==null)
	    	throw new ResourceNotFoundException("Object is null");
	    else
	    return ResponseEntity.ok(object);
	  }
	
	
}
