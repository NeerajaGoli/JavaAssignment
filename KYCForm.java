package com.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class KYCForm {
	
	
	public static void getRangeOfDates(Calendar signUpDate,Calendar currentDate)
	{
		Date lowerDate,upperDate;
		if(signUpDate.compareTo(currentDate)>0)
		{
			System.out.println("No range");
		}

		else
		{
			
			Calendar kycDate=Calendar.getInstance();
			kycDate.set(currentDate.get(Calendar.YEAR), signUpDate.get(Calendar.MONTH), signUpDate.get(Calendar.DAY_OF_MONTH));
			
			//calculating the date before 30 days of sign up anniversary
			kycDate.add(Calendar.DAY_OF_MONTH, -30);
			System.out.print(new SimpleDateFormat("dd-MM-yyyy").format(kycDate.getTime()));
			
			//calculating the date after 30 days of sign up anniversary
			kycDate.add(Calendar.DAY_OF_MONTH, 60);
			
			//if the current date lies in the range 
			if(kycDate.compareTo(currentDate)>0)
			{
				System.out.print(" "+new SimpleDateFormat("dd-MM-yyyy").format(currentDate.getTime()));
			}
			else
			System.out.print(" "+new SimpleDateFormat("dd-MM-yyyy").format(kycDate.getTime()));
			System.out.println();
		}
	}

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		int numberOfInputs;
		String dates[];
		Calendar signUpDate = Calendar.getInstance(),currentDate=Calendar.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		numberOfInputs=scanner.nextInt();
		List<String> dateString=new ArrayList<String>();
		while(numberOfInputs>0)
		{
			 
//			String s=reader.readLine();
			dateString.add(reader.readLine());
			numberOfInputs-=1;
		}
		ListIterator<String> iterator = dateString.listIterator();
		while(iterator.hasNext()){
			
			dates=iterator.next().split(" ");
			
			for(String s1:dates)
			{
			signUpDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(dates[0]));
			currentDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(dates[1]));
			}
			getRangeOfDates(signUpDate, currentDate);
			
		}
		
	}


}


