package codingg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SumByHashMap 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		//hs.add(3);
		hs.add(4);
		//hs.add(5);
		//hs.add(6);
		hs.add(7);
		int n=7;
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			int x=it.next();
		    if(hs.contains(x))
		    {
			   if(hs.contains(n-x))
			    {
				   System.out.println("yesss");
				   System.out.println(" x is "+x+" n-x is "+(n-x));
			    }
			   else
				   System.out.println("bhakk");
		    }
		}
	}
}
