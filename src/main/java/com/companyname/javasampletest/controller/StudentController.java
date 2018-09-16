package com.companyname.javasampletest.controller;

import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.javasampletest.entity.StudentEntity;
import com.companyname.javasampletest.repository.StudentRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StudentController {
@Autowired
StudentRepository studentRepository;

@PostMapping("/student") //localhost8080
public StudentEntity createStudent(@Valid @RequestBody StudentEntity student) {
    return studentRepository.save(student);  
}

@GetMapping("/student/{id}")
public StudentEntity getStudentById(@PathVariable(value = "id") Long studentId){
    return studentRepository.findById(studentId)
	  .orElseThrow(()-> new RuntimeException("cannot find student"));
}
//@DeleteMapping("/student/{id}")
//public void deleteStudent(@PathVariable(value = "id") Long studentId) {
//	studentRepository.deleteById(studentId);
//	
//}
//@PutMapping("/student/{Id}")
//public StudentEntity updateStudentId(@RequestBody StudentEntity Student, @PathVariable(value = "id") Long StudentId) {
//java.util.Optional<StudentEntity> student1= studentRepository.findById(StudentId);
//if (Student.isPresent()) {
//	Student.setId(StudentId);
//	return studentRepository.save(Student);
	
@DeleteMapping("/student/{id}")
public void deleteStudent(@PathVariable(value="id") Long StudentId) {
    studentRepository.deleteById(StudentId);
}
@PutMapping("/student/{id}")
public ResponseEntity<Object> updateStudent1(@RequestBody StudentEntity student,@PathVariable(value="id") Long StudentId) {
    Optional<StudentEntity> student1= studentRepository.findById(StudentId);
    if (!student1.isPresent()) {
        return ResponseEntity.badRequest().build();
    }
    student.setId(StudentId);
    StudentEntity studentUpdated =studentRepository.save(student);
    return ResponseEntity.ok().body(studentUpdated);
}



}


