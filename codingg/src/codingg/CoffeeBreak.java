package codingg;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeBreak {

	public static void main(String[] args) 
	{
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    arr.add(1);
	    arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    arr.add(5);
	    int arrc[]={1,2,3,4,5};
		int b[]={1,2,3,4,5};
		int q[]={5,2,2,10};
		int N=q[0];
		int K=q[1];
		int D=q[2];
		int M=q[3];
		Arrays.sort(b);
		int cntb=1;
		int cnt=0;
		int sum=0;
		/*while(K!=0)
		{
			int s=arr.indexOf(b[cnt]);
			arrc[s]=-1;
			cnt++;
			K--;
		}
		*/
		while(K!=0)
		{
		int s=arr.indexOf(b[cnt]);
		arrc[s]=-1;
		K--;
	    cnt+=D;
		}
		for(int i=0;i<arr.size();i++)
		{
			if(arrc[i]>=0)
			{
				System.out.println(arr.get(i));
				sum+=arr.get(i);
			}
		}
		System.out.println(sum);
	}
}
