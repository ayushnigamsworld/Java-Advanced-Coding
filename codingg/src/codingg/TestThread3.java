package codingg;

class PrintDemo 
{
	   public void printCount()
	   {
	    try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	   }

}

	class ThreadDemo2 extends Thread 
	{
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemo2( String name,  PrintDemo pd){
	       threadName = name;
	        PD = pd;
	   }
	   public void run() 
	   {
		   synchronized(PD)
		   {
	          PD.printCount();
		   }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}

	public class TestThread3 {
	   public static void main(String args[]) {

	      PrintDemo PD = new PrintDemo();

	      ThreadDemo2 T1 = new ThreadDemo2( "Thread - 1 ", PD );
	      ThreadDemo2 T2 = new ThreadDemo2( "Thread - 2 ", PD );
         System.out.println("      before   ");
	      T1.start();
	      T2.start();
          System.out.println("      after    ");
	      // wait for threads to end
	      try {
	         T1.join();
	         //T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}