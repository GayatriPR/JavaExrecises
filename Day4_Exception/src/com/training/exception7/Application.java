package com.training.exception7;

import com.training.exceptionpack.MyCustomException;
import com.training.exceptionpack.RangeCheckException;

public class Application {

	public static void main(String[] args) {

		
		BookService service = new BookService();
		Book bk = new Book();
			
			bk.setBookId(101);
			bk.setAuthor("xyz");
			
		//Checking custome exception for bookName
		try {
			bk.setBookName(null);
		} catch (MyCustomException e) {
			System.err.println(e.getMessage());
		}
			
		
		// Checking Range-check exception
		try {
			bk.setPrice(800.00);
		} catch (RangeCheckException e) {
			System.err.println(e.getMessage());
		}
	
		Book java = null;
		service.addOneBooks(java);
	  
		
		Book[] book =service.getAllBooks();
	  for(int i=0;i<10;i++)
	  {
		  System.out.println(book[i]);
	  }
	  
	  System.out.println(service.getOneBook(201));
	}

}

