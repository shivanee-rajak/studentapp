package com.dxctraining.entities;

public class Book {
	
	String name ,id ;
	Author author;
	double cost;
	

	public Book(String name, String id, Author author, double cost) {
		super();
		this.name = name;
		this.id = id;
		this.author = author;
		this.cost = cost;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
