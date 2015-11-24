package codinggg;

import java.io.*;
import java.util.StringTokenizer;

public class ASP 
{
	public static void main(String[] args) throws IOException 
	{
		InputReader in 		= new InputReader(System.in);
        OutputWriter out	=	new OutputWriter(System.out);
        int test=in.readInt();
        for(int i=1;i<=test;i++)
        {
           	int cas=in.readInt();
           	int mark[]=new int[cas];
           	int[] x = IOUtils.readIntArray(in,cas);
           	for(int j=1;j<x.length;j++)
           	{
           		if(x[j]>=x[j-1])
           		{
           			//nothing 
           		}
           		else if(x[j]<x[j-1])
           		{
           			if(mark[j-1]==1)
           			{
           				System.out.println("nahhi");
           				break;
           			}
           			else{
           				int temp=x[j];
           				x[j]=x[j-1];
           				x[j-1]=temp;
           				mark[j]=1;
           				mark[j-1]=1;
           			}
           			
           		}
           	}
           	for(int j=1;j<x.length;j++)
           	{
           		if(x[j]<x[j-1])
           		{
           			System.out.println("nooo");
           			break;
           		}
           	}
        }
	}
}
