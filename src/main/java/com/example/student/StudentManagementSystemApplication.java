package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String[] args) throws Exception {
		
		
		//  Student student1 = new Student("Trisha", "M", "trix@gmail.com");
		//  studentRepository.save(student1);
		 
		//  Student student2 = new Student("JHX", "Amalraj", "jhx@gmail.com");
		//  studentRepository.save(student2);
		 
		//  Student student3 = new Student("hema", "varshika", "hemz@gmail.com");
		//  studentRepository.save(student3);
		
		
	}

}
