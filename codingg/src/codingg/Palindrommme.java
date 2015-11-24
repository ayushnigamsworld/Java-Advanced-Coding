package codingg;

public class Palindrommme 
{
	public static void main(String[] args) 
	{
		int sum2=0;
		for(int i=123;i<151;i++)
		{
		  if(palindrome(i))
		  System.out.println("yess");
		}
	}
	public static boolean palindrome(int i)
	{
		int a=i;
		int sum=0;
		int q=3;
		while(i!=0)
		{
			int d=i%10;
			//System.out.println(" d is "+d);
			sum+=d*(Math.pow(10,q));
			//System.out.println(" sum is "+sum);
			i=i/10;
			//System.out.println(" i is "+i);
			q--;
			//System.out.println(" q is "+q);
		}
		if(sum==a)
		{
			return true;
		}else
			return false;
	}
}
