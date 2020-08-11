package com.dxctraining.service;
import com.dxctraining.dao.BookDaoImp;
import com.dxctraining.dao.IbookDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.entities.Book;
import com.dxctraining.exceptions.BookcostException;
import com.dxctraining.exceptions.InvalidArgumentException;

@Service
public class BookServiceImp implements IBookService{
	
	@Autowired
	
	private IbookDao dao ;

	@Override
	public void addBook(Book book) {
		dao.addBook(book);
	}

	@Override
	public Book findBookId(String id) {
		validateId(id);
        Book book = dao.findBookId(id);
        return book;
		
	}

	@Override
	public void removeBook(String id) {
		
		 validateId(id);
	     dao.removeBook(id);
	}
		
		
	

	@Override
	public Book updateBookCost(String id, double cost) {
		
		 validateId(id);
	     validateCost(cost);
	     Book book=dao.updateBookCost(id,cost);
	     return book;
	      
	}
	
	

	@Override
	public List<Book> displayAllBooks() {
		 List<Book>list=dao.displayAllBooks();
	       return list;
	}

	
	 public void validateId(String id) {
	        if (id == null) {
	            throw new InvalidArgumentException("id can not be null ");
	        }
	 }
	        
	        
	        
	  private void validateCost(double cost) {
	         if(cost<0){
	                throw new BookcostException("The cost can not be negative");
	         }
	  }	        

	
	
}
