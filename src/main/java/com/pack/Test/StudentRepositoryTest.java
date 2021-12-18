package com.pack.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.pack.repository.StudentRepository;
import entity.Student;

@SpringBootTest
  public class StudentRepositoryTest {
	
	

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public  void saveStudent(){
		
		Student  student = Student.builder() 
				.emailId("ahmedwoye@gmail.com")
				.firstName("Ahmed")
				.lastName("woye")
				.guardianName("Ayantoye")
				.guardianEmail("ayantoye.com")
				.guardianMobile("08033740957") 
				.build();
		
		
		studentRepository.save(student);
		
		
	}

}


