package codingg;

public class Sumpalindrome {

	public static void main(String[] args) 
	{
		int l=123;
		int r=150;
		int sum=0;
		int sum2=0;
		String w="";
		for(int i=l;i<=r;i++)
		{
			Integer a=i;
			String s=a.toString();
			for(int j=s.length()-1;j>=0;j--)
			{
				w+=s.charAt(j);
			}
			if(w.equals(s))
			{
				while(i!=0)
				   {
					int d=i%10;
					sum+=d;
					i=i/10;
				   }
				sum2+=sum;
				sum=0;
			}
		}
		System.out.println(sum2);
	}

}
