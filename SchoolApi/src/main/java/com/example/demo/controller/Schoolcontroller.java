package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.repo.Schoolrepo;

@RestController
public class Schoolcontroller {
	
	@Autowired
	Schoolrepo sr;
	
	@PostMapping("/school")
	public School addSchool(School school)
	{
		sr.save(school);
		return school;
	}
	
	
	@GetMapping("/school")
	public List<School> getSchool() 
	{
		return sr.findAll();
	}
	
	@GetMapping("/school/{id}")
	public Optional<School> getSchool(@PathVariable("id") int id) 
	{
		return sr.findById(id);
	}
	
	@PutMapping("/school")
	public School updateSchool(School school)
	{
		sr.deleteById(school.getId());
		sr.save(school);
		return school;
	}
	
	@DeleteMapping("/school/{id}")
	public Optional<School> deleteSchool(@PathVariable("id") int id) 
	{
		Optional<School> temp = sr.findById(id);
		
		sr.deleteById(id);
		
		return temp;
		
	}
	
	

}
