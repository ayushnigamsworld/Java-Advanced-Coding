package codingg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class TIMEASR 
{
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st=null ;
		while ((line = bi.readLine()) != null)
			st= new StringTokenizer(line);
		int t=Integer.parseInt(st.nextToken());
	   for(int i=1;i<=t;i++)
	   {
		   float angle=Float.parseFloat(st.nextToken());
		   calculate(angle);
	   }
	}
	public static void calculate(float angle)
	{
		float h=0.0f;
	    float md;
	    float hd=0.0f;
	    float diff=0.0f;
	    ArrayList<Float> har=new ArrayList<Float>();
	    ArrayList<Float> mar=new ArrayList<Float>();
	    for(int i=0;i<12;i++)
	    {
		  for(float m=0;m<60;m++)
		   {
			 hd=i*30+m*(0.5f);
			 h=hd/30;
			 md=m*6;
			 if(hd>180)
					hd=360-hd;
			 if(md>180)
				md=360-md;
			 System.out.println("at hour "+i+"  at minutes-degree= "+md+"; hour-degree is= "+hd);
			 diff=Math.abs(hd-md);
			 if(diff==angle)
			 {
				 har.add(h);
				 mar.add(m);
			 }
		   }
	    }
	    for(int i=0;i<har.size();i++)
	    {
	    	System.out.println("hour is ->"+har.get(i));
	    	System.out.println("min is ->"+mar.get(i));
	    }
	}
}
