package com.accenture.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends User {
	
	@Column(name="Address")
	private String address;

}
