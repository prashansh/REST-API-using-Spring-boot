package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@GeneratedValue
	private int id ;
	@Column(name = "name")
	private String name;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "subject")
	private String subject;
	
	public Teacher() {		

	}

	public Teacher(int id, String name, String degree, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", degree=" + degree + ", subject=" + subject + "]";
	}
	
	
	
	
	
	

}
