package com.tka.OrganizationSystem.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	String phoneno;
	// developer,marketing,sales,hr,testing
	String department;
	// data => active,inactive,suspend
	String status;
	
	Date createddtm;
	String createdby;
	Date updateddtm;
	String updatedby;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cid")
	Country country;
	

}
