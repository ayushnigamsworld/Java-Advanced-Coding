package codingg;

import java.util.ArrayList;
import java.util.Collections;

public class MaxGrpOccur 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		//nt w[]={4,3,2,1,0};
		int w[]={0,1,2,3,4,5};
		//char s1[]={};
		//char s2[]={'Q','U','I','Z'};
		char s1[]={'A','S','D','F','G'};
		char s2[]={'W','D','Q','E','V'};
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
		System.out.println();
		for(int i=0;i<ar.size();i++)
		{
			//System.out.print(ar.get(i));
		}
		if(flag==1)
		{
		 int m=Collections.max(ar);
		 System.out.println(w[m]);
		}
		else
			System.out.println(w[0]);
	}
}