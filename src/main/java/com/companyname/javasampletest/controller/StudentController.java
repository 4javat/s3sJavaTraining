package com.companyname.javasampletest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.javasampletest.entity.StudentEntity;
import com.companyname.javasampletest.repository.StudentRepository;
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
public StudentEntity getNoteById(@PathVariable(value = "id") Long noteId){
    return studentRepository.findById(noteId)
	  .orElseThrow(()-> new RuntimeException("cannot find student"));
}


}
