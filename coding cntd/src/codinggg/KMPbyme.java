package codinggg;

public class KMPbyme 
{
	public static int[] prefixcal(String p)//inputs a pattern
	{
		int m=p.length();
		int k=0;
		int pie[]=new int[p.length()+1];//array starting from index 1
		pie[1]=0;
		for(int q=2;q<p.length();q++)
		{
			while(k>0 && p.charAt(k+1)!=p.charAt(q))
			{
				k=pie[k-1];
			}
			if(p.charAt(k+1)==p.charAt(q))
			{
				k=k+1;
			}
			pie[q]=k;
		}
		return pie;
	}
	public static void KMPSearch(String pat, String txt)
	{
	    int M = pat.length();
	    int N = txt.length();
	    int lps[]=new int[M];
	    // create lps[] that will hold the longest prefix suffix
	    // values for pattern
	    int j  = 0;  // index for pat[]
	
	    lps=prefixcal(pat);
	 
	    int i = 0;  // index for txt[]
	    while (i < N)
	    {
	      if (pat.charAt(j) == txt.charAt(i))
	      {
	        j++;
	        i++;
	      }
	 
	      if (j == M)
	      {
	        System.out.println(("Found pattern at index ="+ (i-j)));
	        j = lps[j-1];
	      }
	 
	      // mismatch after j matches
	      else if (i < N && pat.charAt(j) != txt.charAt(i))
	      {
	        // Do not match lps[0..lps[j-1]] characters,
	        // they will match anyway
	        if (j != 0)
	         j = lps[j-1];
	        else
	         i = i+1;
	      }
	    }
	}
	public static void main(String a[])
	{
		KMPbyme ob=new KMPbyme();
		String inp="this is the new shit";
		String pattern="th";
		int lps[]=new int[pattern.length()];
		lps=ob.prefixcal(pattern);
		KMPSearch(pattern, inp);
	}

}
