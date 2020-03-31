package com.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class PingHost
{

	public static void runPingCommand(String command,int noOfPackets)
	{

		try {
				
				Process p = Runtime.getRuntime().exec(command);
				
				long times[]=new long[noOfPackets];
				
				BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
				String line = "";
				int count=0;
				
				// reading output of the command
				while ((line = inputStream.readLine()) != null)
				{
						if(count>0 && count<noOfPackets+1)
						{
							
							int startIndex=line.indexOf("time=")+5;
							int endIndex=line.indexOf(" ms");
							
							//extracting time for each packet
							times[noOfPackets-count]=(long)Float.parseFloat(line.substring(startIndex, endIndex));
							
						}
						System.out.println(line);
						count++;
				}
				
				Arrays.parallelSort(times);
				System.out.println("***********************************");
				
				//calculating the median of times
				if(noOfPackets%2==0)
					System.out.println("median of time taken to ping is "+(times[noOfPackets/2]+times[(noOfPackets/2)+1])/2 +" ms");
				else
					System.out.println("median of time taken to ping is "+times[noOfPackets/2]+" ms");
				

			}
		
			catch (Exception e) 
			{
				e.printStackTrace();
			}
	}
	
		
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		// TODO Auto-generated method stub
		String ipAddress;
		System.out.println("Enter IP address to ping");
		Scanner scanner=new Scanner(System.in);
		ipAddress=scanner.next();

		runPingCommand("ping -c4 "+ipAddress,4);
	}

}
