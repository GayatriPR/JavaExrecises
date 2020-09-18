package com.training.exception7;

import java.util.NoSuchElementException;

public class BookService {

	Book[] b = new Book[20];
	int num;
	public Book[] getAllBooks()
	{
		return b;
	}
	
	public Book getOneBook(int bookId)
	{
		
		try {
			for(int i=0;i<=num;i++) {
				if(b[i].getBookId() == bookId) {
					return b[i];
				}
			}
		}
			catch(NoSuchElementException e)
			{
				System.err.println("Cannot find this book..enter valid id "+bookId);
				e.printStackTrace();
			}
		
		return null;
	}
	
	public Book[] addOneBooks(Book bk)
	{ 
	   num =0;
	   b[num]=bk;
	   num++;
	   return b;
			
	}
}

