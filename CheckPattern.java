package com.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CheckPattern {

	public static void isMatching(String sentence)
	{
		if(Pattern.matches("^[A-Z].*\\.$", sentence))
			
			System.out.println("Yes! It begins with a capital letter and ends with a period.");
		else
			
			System.out.println("It does not match the given pattern");
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String sentence;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any sentence");
		sentence=reader.readLine();
		isMatching(sentence);
	}

}
