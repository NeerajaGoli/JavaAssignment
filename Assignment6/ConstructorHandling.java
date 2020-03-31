package com.assignments;

class ConstructorOverLoading
{
	ConstructorOverLoading(int a)
	{
		//invoking second constructor
		this("hello");
		System.out.println("Inside first constructor");
	}
	ConstructorOverLoading(String b)
	{
		System.out.println("Inside second cosntructor");
	}
}

class ArrayOfObjects
{
	
	ArrayOfObjects(String s)
	{
		System.out.println(s);
	}
}
public class ConstructorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating references will not execute the constructor until the object is created.
		ArrayOfObjects[] array;
		array=new ArrayOfObjects[3];
	
		//Now the constructor gets executed and the initialization messages will get printed.
		
		array[0]=new ArrayOfObjects("first object");
		array[1]=new ArrayOfObjects("second object");
	}

}
