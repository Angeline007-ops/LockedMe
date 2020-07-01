package com.service;

import java.io.*;
import java.util.*;

public class MainClass extends DisplayInfo{
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Company Lockers!!!");
		System.out.println("Developed by Angeline");
		new MainClass().LockedMe();
	}
	
	public void LockedMe() throws IOException{
		char c;
		System.out.println("Welcome to Company Lockers Pvt Ltd");
		System.out.println("Select any one of the options ");
		System.out.println("1.To Sort the files\n2.Add/Delete/Search a file to the directory list\n3.Exit");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		switch(number)
		{
		case 1:			
				new MainClass().startCasting();
				System.out.println("Do you want to continue ? y/n\n");
				c = s.next().charAt(0);
				if(c == 'Y'||c=='y')
				{
					LockedMe();
				}
				else if(c =='N'||c =='n'){
	                System.exit(0);
				}
			    break;	
		case 2:			
				System.out.println("1.Add a file into the directory\n2.Delete a file from the directory\n3.Search file in directory\n4.Back");	
				int var = s.nextInt();
				if(var == 1)
				{
					new MainClass().addFile();
					System.out.println("Do you want to continue ? y/n");
					c = s.next().charAt(0);
					if(c == 'Y'||c=='y')
					{
						LockedMe();
					}
					else if(c =='N'||c =='n')
					{
		                        System.exit(0);
					}
					else
					{
						System.out.println("Invalid response");
						LockedMe();
					}
				}
				else if(var == 2)
				{
					new MainClass().deleteFile();
					System.out.println("Do you want to continue ? y/n");
					c = s.next().charAt(0);
					if(c == 'Y'||c=='y')
					{
						LockedMe();
					}
					else if(c =='N'||c =='n')
					{
		                        System.exit(0);
		                        }
					else
					{
						System.out.println("Invalid response");
						LockedMe();
					}
				}
				else if(var == 3)
				{
					new MainClass().fileSearch();
					System.out.println("Do you want to continue ? y/n");
					c = s.next().charAt(0);
					if(c == 'Y'||c=='y')
					{
						LockedMe();
					}
					else if(c =='N'||c =='n')
					{
		                        System.exit(0);
					}
					else
					{
						System.out.println("Invalid response");
						LockedMe();
					}
				    
				}
				else if(var == 4)
				{
				LockedMe();
				}
				break;
		case 3:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			System.out.println("Enter the valid operation");		
		}
		}
	}
	
	
	


	
	


