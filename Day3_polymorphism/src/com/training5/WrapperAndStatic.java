package com.training5;

public class WrapperAndStatic {
    
	private int id;
	private static String aadharNumber;
	
	public void show()
	{
		System.out.println(id);
		System.out.println(aadharNumber);
		show();
		display();

	}
	
	public static void display()
	{
		//from static method can't call instance variable
		//System.out.println(id);
		//show();
		System.out.println(aadharNumber);
		
	}
	
	public void parse(String strnumber)
	{
		int number = Integer.parseInt(strnumber);
		System.out.println(++number);
	}
	
	public String useToString(int number)
	{
		return Integer.toString(number);
	}
	
	public Integer useValueOf()
	{
		return Integer.valueOf("1010" , 2);
	}
}
