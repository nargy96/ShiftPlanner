package com.nagarjuna;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String day;
	private String shift;

	private Employee() {}

	public Employee(String firstName, String lastName, String day, String shift) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.shift = shift;
	}
}