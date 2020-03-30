package com.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void countCharacters(String filename) throws IOException
	{
		int character,count=0;
		
		FileInputStream fstream=new FileInputStream(filename);
		
		Map <Character,Integer> characterMap=new HashMap<Character,Integer>();
		char letter;
		while((character=fstream.read())!=-1)
		{
			letter=(char)character;
			
			//counting the occurrence of each character
			if(characterMap.containsKey(letter))
			{
				characterMap.put(letter, characterMap.get(letter)+1);
			}
			else
			{
				characterMap.put(letter,1);
			}
		}
		
		//counting different characters
		for(Integer value:characterMap.values())
		{
			if(value==1)
			{
				count+=1;
			}
		}
		fstream.close();
		FileWriter fw=new FileWriter(filename,true);
		System.out.println(count);
		
		//wrting no. of different characters to the file
		fw.write("No of unique characters is "+count);
		fw.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		countCharacters(args[0]);
		
	}

}
