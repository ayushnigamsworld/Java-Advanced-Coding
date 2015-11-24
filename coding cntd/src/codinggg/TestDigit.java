package codinggg;

public class TestDigit {

	public static void main(String[] args) 
	{
		Integer d=6;
		int n=3;
        String s=d.toString();
        while(n!=1)
        {
        	s+=d;
        	n--;
        }
        Integer num=Integer.parseInt(s);
        
        num=num*num;
        s=num.toString();
        int sum=0;
        int temp=0;
        for(int i=0;i<s.length();i++)
        {
        	temp=s.charAt(i)-'0';
        	sum+=(Math.pow(23, i)*(temp));
        }
        System.out.println(sum);
	}

}
