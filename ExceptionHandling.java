package com.assignments;

import java.io.FileNotFoundException;

class Example
{
	void methodThrowingException(int option) throws ArithmeticException,NullPointerException,FileNotFoundException
	{
		if(option==1)
		{
			throw new ArithmeticException();
		}
		else if(option==2)
		{
			throw new NullPointerException();
		}
		else if(option==3)
		{
			throw new FileNotFoundException();
		}
		else
		{
			System.out.println("Enter options 1-3");
		}
		
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example example=new Example();
		try 
		{
			example.methodThrowingException(1);
		} 
		catch (ArithmeticException | NullPointerException | FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Executing Finally clause");
		}
	}

}
