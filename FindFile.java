package com.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindFile {

	public static void searchFilesWithPattern(final File folder,String filePattern) throws IOException
	{
	    boolean found=false;
		for (File file : folder.listFiles()) {
	        if (file.isDirectory()) 
	        {
	        	searchFilesWithPattern(file,filePattern);
	        } 
	        else 
	        {
	        	if(Pattern.matches(filePattern,file.getName()))
	        	{
	        		found=true;
	        		System.out.println(file.getCanonicalPath());
	        	}
	            
	        }
	    }
		
		if(!found)
		{
			System.out.println("No files found with given pattern!");
		}
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		//defining  home directory
		File homeDir=new File("..//..//");
//		System.out.println(homeDir.getCanonicalPath());
		Scanner scanner=new Scanner(System.in);
		

		String filePattern;
		System.out.println("Enter the regular expression");
		
		filePattern=scanner.next();
		
		//take inputs repeatedly until exit is entered.
		while(!filePattern.equals("exit"))
//		while(true)
		{
			
			System.out.println(filePattern);
			searchFilesWithPattern(homeDir,filePattern);
			filePattern=scanner.next();
		
		}
	}

}
