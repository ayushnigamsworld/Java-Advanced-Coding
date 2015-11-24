package codingg;
public class TestThread2 
{
	 public static void main(String args[]) 
	   {  
	      Thread T1 = new ThreadDemo( "Thread-1");
	      T1.start();  
	      Thread T2 = new ThreadDemo( "Thread-2");
	      T2.start();
	   }   
}
class ThreadDemo extends Thread 
{
	   private Thread t;
	   private String threadName;
	   ThreadDemo( String name)
	   {
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() 
	   {
	      System.out.println("Running " +  threadName );
	      try 
	      {
	         for(int i = 4; i > 0; i--) 
	         {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	     } 
	      catch (InterruptedException e) 
	      {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }
	   @Override
	   public void start ()
	   {
		   System.out.println("hummmm hunnnnnn startsssssssssssssssss     ........ ");
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	   
	}