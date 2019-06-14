package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.User;


@RepositoryRestResource(collectionResourceRel = "user" ,path = "user")
public interface Userrepo extends JpaRepository<User, Integer>{

}
