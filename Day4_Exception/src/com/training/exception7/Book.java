package com.training.exception7;

import com.training.exceptionpack.MyCustomException;
import com.training.exceptionpack.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String bookName, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) throws MyCustomException {
		
		if(bookName!=null)
		{
			System.out.println(bookName);
		}
		else
		{
		try {
			throw new NullPointerException();
			}
		catch(Exception e)
			{
			    throw new MyCustomException("Book Name should not be empty",e);   
			}
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws RangeCheckException {
	
		//checked exception and throws it to parent class which is main class
				if(price<100 || price>500)
				{
					throw new RangeCheckException("Invalid book price");
				}
		
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";	}
	
	
	

}
