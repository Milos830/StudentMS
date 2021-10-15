package com.milos.studentmanagementsystem;

import com.milos.studentmanagementsystem.entity.Student;
import com.milos.studentmanagementsystem.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Milos", "Milivojevic", "milivojevicm66@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Aleksandra", "Milivojevic", "aleks@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Dragica", "Alempijevic", "dragica@gmail.com");
//		studentRepository.save(student3);
//		Student student4 = new Student("Aco", "Alempijevic", "coa@gmail.com");
//		studentRepository.save(student4);


	}
}
