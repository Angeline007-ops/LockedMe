package com.service;
import java.util.*;
import java.io.*;

public class DisplayInfo {
	Scanner s1 = new Scanner(System.in);
	
	public void displayFiles()
	{
		File file = new File("C:/LockedMe");
        File[] fileList = file.listFiles();
        System.out.println("----The new Directroy list----");
        for (File f : fileList) 
        {
        System.out.println(f);
        }
	}
	
	//Sort in ascending order
	public void startCasting() {
	   	    File file = new File("C:/LockedMe");
	        File[] fileList = file.listFiles();
	 	    Arrays.sort(fileList, new Comparator<File>() 
	 	    {
				@Override
				public int compare(File o1, File o2) 
				{
					return o1.getName().compareTo(o2.getName());
				}
			});
	        System.out.println("------The sorted list ------");
	        for(final File f1 : fileList)
	        {	        	
	        	System.out.println(f1);
	        	System.out.println("\n");
	        }
	 }
	 //Add a file into directory
	 public void addFile() throws IOException
	 {
		boolean flag=true;
		 System.out.println("Enter the file name to be addedd");
		 String fileName = s1.nextLine();
		 try
		 {
			 File newfile = new File(fileName);
			 String line= newfile.getName();			 
			 if(! newfile.exists() )
			 {
				 System.out.println("File addedd int the directory");
				 newfile.createNewFile();					
			 }						
		 }
		 catch (Exception e)
		 {
			e.printStackTrace();
		 }
		 finally
		 {
			 File file1 = new File("C://LockedMe//"+fileName);			
		 		try
		 		{
				if(! file1.exists())
				{	
					file1.createNewFile();						
					System.out.println("File addedd");
			    }			
				FileWriter fw = new FileWriter(file1);
				fw.append(fileName);
				fw.flush();fw.close();
				displayFiles();
				}catch (IOException e) 
		 		{
					e.printStackTrace();
				}
		 }		
	}
	 
	 public void deleteFile(){
		 displayFiles();
		 System.out.println("Enter the file you want to delete from directory");
		 String deleteFile = s1.nextLine();		
		 File f2 = new File(deleteFile);
		 File dir=new File("C://LockedMe//");
		 File f3 = new File("C://LockedMe//"+f2);
		 System.out.println(f3); 	    	 
		 if(exists(dir,deleteFile)&&f3.isFile())
		 {
			 f3.delete();
			 System.out.println(" The file "+f3.getName()+"is Deteled ");
			 displayFiles();
		 }
		 else
		 {
			 System.out.println("The file " + f3.getName() + "Cannot be found");
		 } 	 
	}
	 
	@SuppressWarnings("null")
	public void FileSearch(){
		System.out.println("Ether the file to search");
		String fname = s1.nextLine();
		File dir = new File("C://LockedMe//" + fname);
		FilenameFilter filter = new FilenameFilter() 
		{
			@Override
			public boolean accept(File dir, String fname) {
					return fname.equalsIgnoreCase(fname);
			}
		};
		try
		{		
		String[] string = dir.list(filter);
		if(dir != null)
		{
			System.out.println("The file is located in "+ dir.getAbsolutePath());
		}
		}catch(NullPointerException e){
		}
		finally
		{
			String[] string = dir.list(filter);		
			for(int i=0;i<string.length;i++)
			{
				String Filename = string[i];
				System.out.println(Filename);
			}	
	    }	
    } 
	
	//Function to check the existence of the file
	public boolean exists(File dir, String filename)
	{
	    String[] files = dir.list();
	    for(String file : files)
	        if(file.equals(filename))
	            return true;
	    return false;
	}
	
	public void fileSearch()
	{
		System.out.println("Enter the file to search (case sensitive)");
		String fname = s1.nextLine();
        File f2 = new File(fname);
        File f3 = new File("C://LockedMe//"+f2);
        File dir = new File("C://LockedMe//");
        if(exists(dir,fname)&&f3.isFile())
        {
        	System.out.println("File found");
        }
        else
        {
        	System.out.println("FNF");
        }
	 }
	
}
		
	
	     

	


	 

	 
	 
	 
	 



	
	
	
	
	




