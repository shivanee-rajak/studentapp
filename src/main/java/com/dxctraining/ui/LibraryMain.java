package com.dxctraining.ui;

import java.awt.List;

import com.dxctraining.entities.Author;
import com.dxctraining.entities.Book;
import com.dxctraining.service.BookServiceImp;
import com.dxctraining.service.IBookService;

public class LibraryMain {
	
	 private IBookService bookservice=new BookServiceImp();
	   
	 public static void main(String args[])
	    {
	        LibraryMain libapp=new LibraryMain();
	        libapp.run();
	    }
	 
	 
	 
	    private void run() {
	        Author author1 = new Author("1", "shivi");
	        Author author2 = new Author("2", "anu");
	        Author author3 = new Author("3", "neelu");  
	        Book book1 = new Book("Aman","12i",author1,21);
	        Book book2 = new Book("raman","13i",author2,22);
	        Book book3 = new Book("gagan","14i",author3,23);
	        bookservice.addBook(book1);
	        bookservice.addBook(book2);
	        bookservice.addBook(book3);
	        displayAllbook();
	        
	    }
	    
	    
	    private void displayAllbook() {
	        List<Book> list=bookservice.displayAllBooks();
	        for(Book book:list)
	        {
	            display(book);
	        }


	        private void display(Book book) {
	            System.out.println("display the books details");
	            Author author=book.getAuthor();
	            System.out.println("The author is "+author.getName()+" Name of the book "+book.getName()+
	                    " The price "+book.getCost());
	        }
	}


