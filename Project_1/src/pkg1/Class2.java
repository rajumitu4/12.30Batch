package pkg1;

public class Class2 
{
   int a;     // variable
   public void deepak()  // our method
   {
	   System.out.println("welcome all of you");   
   }
   
   public static void main(String[] args)
   {
	 Class2 abc=new Class2();  // object creation
	 abc.deepak();  // calling the method
	 abc.a=13;  // calling the variable
	 System.out.println(abc.a);  // print the value of that variable
   }
   
   
}
