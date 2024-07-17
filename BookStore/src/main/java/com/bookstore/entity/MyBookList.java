package com.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "MyBooks")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MyBookList {
   
	
	@Id
	private int id;
	private String name;
	private String author;
	private String price;
}
