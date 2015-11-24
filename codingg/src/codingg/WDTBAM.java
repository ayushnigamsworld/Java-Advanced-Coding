package codingg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WDTBAM 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		int result[]=new int[r];
		for(int te=0;te<r;te++)
		{
			int size=s.nextInt();
			char s1[]=new char[size];
			char s2[]=new char[size];
			int w[]=new int[size+1];
			String ss=s.next();
			for(int h=0;h<size;h++)
			{
				s1[h]=ss.charAt(h);
			}
			String ss2=s.next();
			for(int h=0;h<size;h++)
			{
				s2[h]=ss.charAt(h);
			}
			int sss[]=new int[size+1];
			for(int h=0;h<size+1;h++)
			{
				sss[h]=s.nextInt();
			}
			for(int h=0;h<size+1;h++)
			{
				w[h]=sss[h];
			}
			for(int h=0;h<size+1;h++)
			{
				System.out.println("W IS "+w[h]);
			}
			int a[]=new int[s1.length+1];
		 for(int i=0;i<s1.length;i++)
		 {
			if(s1[i]==s2[i])
				a[i]=1;
			else
				a[i]=0;
		 }
		  a[s1.length]=2;
		  int flag=0;
		   for(int i=0;i<a.length-1;i++)
		     {
			   if(a[i]==1)
			    {
				 flag=1;
			     int t=a[i];
			     int cnt=0;
			     while(a[i]==t)
			        {
				      cnt++;
				      i++;
			        }
			     ar.add(cnt);
			     i--;
			    }
		     }
		   int m=0;
		if(flag==1)
		{
		  m=Collections.max(ar);
		  result[te]=w[m];
		}
		else
			result[te]=w[0];
	  }
		for(int i=0;i<r;i++)
		{
			System.out.println(result[i]);
		}
	}
}