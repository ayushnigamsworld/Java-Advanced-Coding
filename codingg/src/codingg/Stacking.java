package codingg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Stacking 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		int a[]={3,4,5,1,1,2};
		CopyOnWriteArrayList<Integer> ar=new CopyOnWriteArrayList<Integer>();
		ar.add(0,a[0]);
		Iterator<Integer> l=ar.iterator();
		for(int i=1;i<a.length;i++)
		{
			cnt=0;
			while(l.hasNext())
			{
				int t= l.next();
				if(a[i]>t)
				{	
				  ar.add(a[i]);
				  cnt++;
				}
		    }
			if(cnt==0)
			{
				int min=Collections.min(ar);
			   int mini = ar.indexOf(min);
			   ar.set(mini,min);
			}
	    }
		System.out.println(ar);
    }
}
