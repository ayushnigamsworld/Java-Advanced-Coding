package codingg;

import java.util.Arrays;

public class Language 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		String a[]={"piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm","piygu","ezyfo", "rzotm"};
		String a3[]=new String[a.length];
		String a2[]={"piygu","tefwz","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu","ezyfo","tefwz","piygu"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				
				if(a[i].equals(a2[j]))
				{
					a3[i]="yes";
					break;
		        }
				else
				{
					a3[i]="no";
				}
				
				/*Arrays.sort(a2);
				int r = Arrays.binarySearch(a2,a[i]);
				if(r>=0)
				{
					a3[i]="yes";
				}
				else
				{
					a3[i]="no";
				}*/
			}
		}
		//System.out.println(a2.length);
		for(int i=0;i<a3.length;i++)
		System.out.println(a3[i]);
		long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime);
	}
}
