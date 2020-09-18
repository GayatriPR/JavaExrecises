package com.training.exceptionpack;

public class MyCustomException extends Exception {

	private String message;
	private Throwable err;

	public MyCustomException(String message, Throwable err) {
		
		super();
		this.message = message;
		this.err = err;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception :" + message + ": " + err;	
				}
	
}

