package com.milos.studentmanagementsystem.service;

import com.milos.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
