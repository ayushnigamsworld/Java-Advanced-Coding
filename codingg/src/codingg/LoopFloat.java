package codingg;

public class LoopFloat {

	public static void main(String[] args) 
	{
		int cnt=0;
		for(float i=0;i<360;i++)
		{
			cnt++;
			System.out.println(cnt);
		}
	}

}
/*
 * package codingg;
public class TIMEASR 
{
	public static void main(String[] args) 
	{
	    float h=0.0f;
	    float md;
	    float hd=0.0f;
	    for(int i=0;i<12;i++)
	    {
		  for(float m=0;m<=60;m++)
		   {
			 hd=i*30+m*(0.5f);
			 h=hd/30;
			 md=m*6;
			 if(md>180)
				md=360-md;
			 System.out.println("at hour "+i+"  at minutes-degree= "+md+"; hour-degree is= "+hd);
		   }
	    }
	}
}

 */
