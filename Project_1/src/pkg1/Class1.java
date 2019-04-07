package pkg1;

import java.io.FileNotFoundException;

public class Class1 
{
	public static void main(String[] args)  throws FileNotFoundException,ArrayIndexOutOfBoundsException
	{
	 System.out.println("first line");
	 System.out.println("changes in file");
			 
	 try {
		int a=9/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		System.out.println("inside finally");
	}
	
	
	 System.out.println("Second line");
	}
	
}
