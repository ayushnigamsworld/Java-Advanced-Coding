package codinggg;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;


public class Main 
{
	public static void main(String[] args) 
	{
	    InputReader in 		= new InputReader(System.in);
	    OutputWriter out	=	new OutputWriter(System.out);
	//read int
	int i = in.readInt();
	int result[]=new int[i];
	for(int j=0;j<i;j++)
	{
		result[j]=0;
	}
	for(int j=0;j<i;j++)
	{
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0;
	  //read string
	   String s = in.readString();
	   
	   for(int k=0;k<s.length();k++)
	   {
		   if(s.charAt(k)=='L')
		   {
			    cnt1++;
		   }
		   if(s.charAt(k)=='T')
		   {
			   cnt2++;
		   }
		   if(s.charAt(k)=='I')
		   {
			   cnt3++;
		   }
		   if(s.charAt(k)=='M')
		   {
			   cnt4++;
		   }
		   if(s.charAt(k)=='E')
		   {
			   cnt5++;
		   }   
	   }
	   if(cnt1>=2)
	   {
		   if(cnt2>=2)
		   {
			   if(cnt3>=2)
			   {
				   if(cnt4>=2)
				   {
					   if(cnt5>=1)
					   {
						  result[j]=1;
					   }
				   }
			   }   
		   }
	   }
	}
	for(int s=0;s<i;s++)
	{
		if(result[s]==1)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
	out.flush();
	//remember to close the
	//outputstream, at the end
	out.close();

	}

}
