package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Teacher;

@RepositoryRestResource(collectionResourceRel = "teacher" , path = "teacher")
public interface Teacherrepo  extends JpaRepository<Teacher, Integer>{

}
