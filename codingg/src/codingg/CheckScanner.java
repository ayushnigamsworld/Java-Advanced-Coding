package codingg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckScanner {

	public static void main(String[] args)throws IOException 
	{
		/*String s="";
		Scanner sc=new Scanner(System.in);
		int aaa=0;
		  aaa=sc.nextInt();
		//String s2=sc.next();
		  System.out.println("fff  "+aaa);
		  int x=20;
		  String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
		  System.out.println(sup);
		  */
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st=null ;
		System.out.println("input");
		while ((line = bi.readLine()) != null)
			st= new StringTokenizer(line);
		int t=Integer.parseInt(st.nextToken());
	   for(int i=1;i<=t;i++)
	   {
		   float angle=Float.parseFloat(st.nextToken());
		   System.out.println("your input is ->"+angle);
	   }
	}
}
