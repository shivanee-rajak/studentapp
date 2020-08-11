package com.dxctraining.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.dxctraining.entities.Book;
import com.dxctraining.exceptions.BookNotFoundException;

@Repository
public class BookDaoImp implements IbookDao {
  
	
	Map<String,Book>store = new HashMap<>();
	
	
	private int generateId;

    String generateId(){
       generateId++;
       String idnb=""+generateId;
       return idnb;
   }

	
	
	@Override
	public void addBook(Book book) {
		String id=generateId();
	       store.put(id,book);
	       book.setId(id);
		
	}

	@Override
	public Book findBookId(String id) {
		  boolean book= store.containsKey(id);
	        if(!book){
	            throw new BookNotFoundException("Book not found for id given id");
	        }
	        Book book1=store.get(id);
	        return book1;
	
	}

	@Override
	public void removeBook(String id) {
		store.remove(id);
		
	}

	@Override
	public Book updateBookCost(String id, double cost) {
		 Book book=findBookId(id);
	     book.setCost(cost);
	     return book;
		
	}

	@Override
	public List<Book> displayAllBooks() {
		 Collection<Book>collection=store.values();
         List<Book>list=new ArrayList<>();
         for (Book book:collection){
             list.add(book);
         }
        return list;
	}
	
}
