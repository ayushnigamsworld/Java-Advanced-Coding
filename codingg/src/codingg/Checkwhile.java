package codingg;

public class Checkwhile 
{
	public static void main(String[] args) 
	{
	   /*while(1)
	   {
		  x=9; 
	   }
	   */
	   //float c;
	   //System.out.println(c);
	   float farr[]=new float[20];
	   farr[4]=3;
	   System.out.println(farr[0]);
	   float far2[];
	   far2=farr;
	   System.out.println(far2[3]);
	   int I = 0;
	   /*label:
	       if (I < 2) {
	       System.out.print("I is " + I);
	       I++;
	       continue label;
	   }
	   */
	   
	   
	   
	   ////////////////////////////////////////////
	   ///////        A VERY   IMPORTANT POINT TO BE NOTED  ////////
	   try 
	   { 
	       int x = 0; 
	       int y = 5 / x; 
	   } 
	   catch (ArithmeticException ae) 
	   {
	       System.out.println(" Arithmetic Exception"); 
	   } 
	   catch (Exception e) 
	   {
	       System.out.println("Exception"); 
	   } 
	   System.out.println("finished");
	   //////////////////////////////////////////////////
	   try
	   {
		   System.out.println("hello people");
		   //int x = 0; 
	       //int y = 5 / x;
	   }
	   finally
	   {
		  System.out.println("shit its true");
	   }
	   /////////////////////////////////////////////////
	   String a = "newspaper";
	   a = a.substring(5,7);
	   char b = a.charAt(1);
	   a = a + b;
	   System.out.println(a);
	   
	   ////////////////////////////////////////
	}
}