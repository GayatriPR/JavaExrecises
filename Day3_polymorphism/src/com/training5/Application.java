package com.training5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrapperAndStatic obj = new WrapperAndStatic();
		obj.parse("1234");
		
		System.out.println(obj.useToString(123).length());
		System.out.println(obj.useValueOf());
	}

}
