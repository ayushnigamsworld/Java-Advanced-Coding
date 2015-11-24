package codingg;

import java.io.*;
import java.net.*;
class ThreadingHandler extends Thread
{
    Socket newsock;
    int n;
    ThreadingHandler(Socket s,int v)
    {
        newsock=s;
        n=v;
    }
    public void run()
    {
        try
        {
            DataInputStream ds=new DataInputStream(newsock.getInputStream());
            PrintStream ps=new PrintStream(newsock.getOutputStream());
            ps.println("helllllllo ");
            boolean moredata=true;
            while(moredata)
            {
                String line=ds.readLine();
                if(line==null)
                    moredata=false;
                else
                    ps.println("from server "+line);
            }
            newsock.close();
        }
        catch(Exception e)
        {
        }
    }
}
            
            
                
    
