package com.assignments;

import java.util.Scanner;

public class AlphabetCheck {

	public static void checkAlphabets(String word)
	{
		
		int smallAlphabets[]=new int[26];
		for(int index=0;index<word.length();index++)
		{
//			
			if(Character.isLowerCase(word.charAt(index)))
			{
				int smallAlphabetIndex=word.charAt(index)%97;
				
				//marking the letter index as 1
				smallAlphabets[smallAlphabetIndex]=1;
			}
			
			
		}
		for(int index=0;index<smallAlphabets.length;index++)
		{
				//if one of the letters is not marked or not visited,then return
				if (smallAlphabets[index]!=1)
					{
						System.out.println("It does not contain all the letters a-z");
						return;
					}
		}
		System.out.println("Yes!! It contains all the letters a-z");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string");
		String word=scanner.next();
		
		//timeComplexity:O(n)  
		//Space complexity:O(26)
		checkAlphabets(word);
	}

}
