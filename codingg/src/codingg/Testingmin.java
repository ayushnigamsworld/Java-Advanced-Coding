package codingg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Testingmin 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();		
		//ar.add(1);
		ar.add(3);
		ar.add(4);
		int temp=5;
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
		System.out.println(w);
		ar.set(w, 100);
	}
}
