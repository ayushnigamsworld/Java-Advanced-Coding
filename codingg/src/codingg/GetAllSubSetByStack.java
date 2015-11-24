package codingg;
import java.util.Stack;
public class GetAllSubSetByStack 
{
    public static final int TARGET_SUM = 15;
    private Stack<Integer> stack = new Stack<Integer>();
    private int sumInStack = 0;

    public void populateSubset(int[] data, int fromIndex, int endIndex) 
    {
        if (sumInStack == TARGET_SUM) 
        {
            print(stack);
        }
        for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) 
        {
            if (sumInStack + data[currentIndex] <= TARGET_SUM) {
                stack.push(data[currentIndex]);
                sumInStack += data[currentIndex];
                populateSubset(data, currentIndex + 1, endIndex);
                sumInStack -= (Integer) stack.pop();
            }
        }
    }

    /**
    * Print satisfied result. i.e. 15 = 4+6+5
    */

    private void print(Stack<Integer> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(TARGET_SUM).append(" = ");
        for (Integer i : stack) {
            sb.append(i).append("+");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}
