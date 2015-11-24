package codingg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Stacking2 
{
	public static void main(String[] args) 
	{
		int cnt=0;int j=0;
		int a[]={3,4,5,1,1,2};
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(0,a[0]);
		for(int i=1;i<a.length;i++)
		{
			cnt=0;
			for(j=0;j<ar.size();j++)
			{
				int t= ar.get(j);
				if(a[i]>t)
				{	
				  cnt++;
				}
				System.out.println(" i "+i+" j "+j+" lsit  --> "+ar);
		    }
			if(cnt==ar.size())
			{
				ar.add(a[i]);
			}
			else if(cnt>=0)
			{
				int temp=a[i];
				int w=0;
				Collections.sort(ar);
				for(w=0;w<ar.size();w++)
				{
					if(temp<ar.get(w))
					{
						temp=ar.get(w);
						break;
					}
				}
				System.out.println(" insise two   i "+i+" j "+j+" lsit  --> "+ar);
				System.out.println(w);
				ar.set(w, a[i]);
				System.out.println(" insise   i "+i+" j "+j+" lsit  --> "+ar);
			}
	    }
		System.out.println(ar);
    }
}
