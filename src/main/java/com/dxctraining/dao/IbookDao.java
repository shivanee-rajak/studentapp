package com.dxctraining.dao;

import java.util.List;

import com.dxctraining.entities.Book;

public interface IbookDao {
	
	void addBook(Book book);
	
	Book findBookId(String id);
	
	
	void  removeBook(String id);
     
	
	Book updateBookCost(String id,double cost);
	
	List<Book>displayAllBooks();
}
