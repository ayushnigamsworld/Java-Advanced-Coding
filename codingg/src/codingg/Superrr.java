package codingg;

public class Superrr 
{
	public static void main(String[] args) 
	{
		Superrr ob=new Superrr();
		int n=20;
		float sum=1;
		for(float i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				if(ob.isPrime(i))
				{
					sum=sum*(1-1/i);
					System.out.println("i is "+i+" sum is "+sum);
				}
			}
		}
		double h=(n*sum);
		h=Math.ceil(h);
		System.out.println(h);
	}
	public boolean isPrime(float i)
	{
		int cnt=0;
		for(int k=2;k<=i;k++)
		{
			if(i%k==0)
			{
				cnt++;
			}
		}
		if(cnt==1)
			return true;
		else 
			return false;
	}
}
