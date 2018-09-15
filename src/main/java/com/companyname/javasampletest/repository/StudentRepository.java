package com.companyname.javasampletest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.companyname.javasampletest.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository <StudentEntity, Long> {

}
