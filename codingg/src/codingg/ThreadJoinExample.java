package codingg;
import java.util.Date;
public class ThreadJoinExample 
{
	public static void main(String[] args)throws InterruptedException 
	{
        RunnableJob r=new RunnableJob();
        Thread t1=new Thread(r,"t1");
        Thread t2=new Thread(r,"t2");
        Thread t3=new Thread(r,"t3");
        Thread t4=new Thread(r,"t4");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        //t4.join();
	}
}
class RunnableJob implements Runnable
{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Runnable job "+t.getName() +" at "+new Date());
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}