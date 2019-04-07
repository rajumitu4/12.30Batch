package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// (10+2)(10-2) 
public class Arithmetic {
	    
	 public static void main(String[] args) throws IOException 
	 {
	  Arithmetic ob=new Arithmetic();  // object created
	  ob.read(1,3);  // called the method
	 }
	 
	 public void read(int initial,int end) throws IOException
	 {
	 File f=new File("C:\\Users\\Rajesh\\Desktop\\input.txt");
	 FileReader fr=new FileReader(f);
	 BufferedReader b=new BufferedReader(fr);
	 String s;
	 int count=1;
	   while((s=b.readLine())!=null)
	   {
	      
	     if((count>=initial)&&(count<=end))
	     {
	      System.out.println(s);
	     }
	    count=count+1;
	 }
}
}