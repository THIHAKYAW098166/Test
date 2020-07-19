package com.example.web.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int price;
	private int quantity;

}
