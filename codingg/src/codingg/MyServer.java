package codingg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MyServer 
{
	ArrayList<Socket> al=new ArrayList<Socket>();
	ServerSocket ss;
	Socket s;
	public MyServer()
	{
		try
		{
			ss=new ServerSocket(10);
			while(true)
			{
				s=ss.accept();
				System.out.println("Client connected");
				al.add(s);
				Runnable r=new MyThread(s,al);
				Thread t=new Thread(r);
				t.start();
			}
		}
		catch(Exception e)
		{
			System.out.println("error is "+e);
		}
	}
	public static void main(String[] args) 
	{
		new MyServer();
	}
}
 class MyThread implements Runnable
{
	Socket s;
	ArrayList al;
	MyThread(Socket s,ArrayList al)
	{
		this.s=s;
		this.al=al;
	}
	public void run()
	{
		String s1;
		try
		{
			DataInputStream din=new DataInputStream(s.getInputStream());
			do
			{
				s1=din.readUTF();
				System.out.println(s1);
				if(!s1.equals("stop"))
					tellEveryOne(s1);
				else
				{
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());
					dout.writeUTF(s1);
					dout.flush();
					al.remove(s);
				}
			}while(!s1.equals("stop"));
		}
		catch(Exception e)
		{
			System.out.println("error must be "+e);
		}
	}
	public void tellEveryOne(String s1)
	{
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			try
			{
				Socket sc=(Socket)i.next();
				DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
				dout.writeUTF(s1);
				dout.flush();
				System.out.println("Client");
			}
			catch(Exception e)
			{
				System.out.println("e is "+e);
			}
		}
	}
}

 
 
 
 
 
 
 
 
 