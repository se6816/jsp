package com.example.security.model;

import lombok.Data;

@Data
public class Pet {

	public String name;

	public Pet(String name) {
		this.name = name;
	}
	
	
}
