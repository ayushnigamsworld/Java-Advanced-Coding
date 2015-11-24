package codinggg;
import java.io.*;
import java.util.InputMismatchException;
public class TestASP 
{
	public static void main(String[] args) 
	{
		 InputReader in 		= new InputReader(System.in);
	        OutputWriter out	=	new OutputWriter(System.out);
	  
	//read int
	   int i = in.readInt();
	//read string
	   String s = in.readString();
	//read int array of size N
	  // int[] x = IOUtils.readIntArray(in,N);
	//printline
	   out.printLine(i);
	   out.printLine(s);
	   out.printLine("X");


	//flush output
	   out.flush();

	//remember to close the
	//outputstream, at the end
	   out.close();
	}
}
	

