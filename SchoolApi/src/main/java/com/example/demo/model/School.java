package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {
	
	@Id
	private int id;
	private String name;
	private String city;
	private String principal;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(int id, String name, String city, String principal) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.principal = principal;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", city=" + city + ", principal=" + principal + "]";
	}
	
	

}
