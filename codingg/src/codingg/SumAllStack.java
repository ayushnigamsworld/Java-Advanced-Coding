package codingg;
import java.util.Arrays;
public class SumAllStack 
{
	    private static final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13 , 14 , 15 };
	    public static void main(String[] args) 
	    {
	        GetAllSubSetByStack get = new GetAllSubSetByStack();
	        Arrays.sort(DATA);
	        get.populateSubset(DATA, 0, DATA.length);
	    }
}