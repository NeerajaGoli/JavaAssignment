package com.assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VampireNumber 
{

	public static boolean isVampire(int number)
	{
		List<String> list=new ArrayList<String>();
		String num=String.valueOf(number);
		String fac1,fac2;
		int factor1;
		int factor2;
		int sizeOfFactor=num.length()/2;
		permutations(num, 0, num.length()-1, list);
		
		//get all possible permutations of the given number
		ListIterator<String> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			num=iterator.next();
			fac1=num.substring(0, sizeOfFactor);
			fac2=num.substring(sizeOfFactor, num.length());
			
			//factors should not have trailing zeroes
			if(fac1.charAt(0)!='0' && fac2.charAt(0)!='0' && fac1.length()==sizeOfFactor && fac2.length()==sizeOfFactor)
			{
				
			
				factor1=Integer.parseInt(fac1);
				factor2=Integer.parseInt(fac2);
				if(factor1%10==0 && factor2%10==0)
					continue;
				
				//check whether they are factors of given number or not
				if(factor1*factor2==number)
				{
					
					return true;
				}
			}
		}
		return false;
	}
	
	public static void permutations(String number,int start,int end,List list)
	{
		if (start == end) 
            list.add(number);
        else
        { 
            for (int i = start; i <= end; i++) 
            { 
            	number = swap(number,start,i); 
                permutations(number, start+1, end,list); 
                number = swap(number,start,i); 
            } 
        } 
	}
	
	public static String swap(String number, int i, int j) 
    { 
        char temp; 
        char[] charArray = number.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	
	
	public static void firstHundredVampireNumbers()
	{
		int number=1000;
		int count=0;
		while(count!=100)
		{
			//check whether the number is vampire or not
			if(isVampire(number))
			{
				System.out.println(number);
				count+=1;
			}
			number++;
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First 100 vampire numbers are :");
		firstHundredVampireNumbers();
		
	}

}
