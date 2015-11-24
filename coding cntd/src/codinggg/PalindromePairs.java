package codinggg;

import java.util.ArrayList;

public class PalindromePairs 
{
	public static void main(String[] args) 
	{
		String ar[]={"b","ab","ba"};
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<ar.length-1;i++)
		{
			int f=ar[i].charAt(0);
			int flag=0;
			for(int j=i+1;j<ar.length;j++)
			{
				int l=ar[j].charAt(ar[j].length()-1);
				//al.add(ar[i]+ar[j]);
				//al.add(ar[j]+ar[i]);
				while(f<ar[i].length() && l>=0)
				{
					if(ar[i].charAt(f)==ar[j].charAt(l))
					{
					 f++;
					 l--;
					}
					else
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					if(ar[i].length()>ar[j].length())
					{
						if(ar[i].length()==(f+1))
						{
							System.out.println("yes");
						}
					}
					if(ar[j].length()>ar[i].length())
					{
						if(ar[j].length()==(0))
						{
							System.out.println("yes");
						}
					}
				}
			}
		}
		//for(int i=0;i<al.size();i++)
		//{
			//System.out.println(al.get(i));		
		//}
	}

}
