//Join Threads
//join() and sleep() both throw InterupptedExceptions hence we create try, catch blocks for them.
import java.util.*;

class Job1 implements Runnable
{
    int start=0;
    int end=0;
    Job1(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
}
class Job2 implements Runnable
{
    int start=0;
    int end=0;
    Job2(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
}
class Print
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1=new Thread(new Job1(1,500));
        Thread t2=new Thread(new Job2(501,1000));
        t1.start();
        try
        {
            System.out.println("Waiting for t1 to finish");
            t1.join(); //Wait for t1 to finish
            /*We write this for current thread ,i.e, for this case main thread. 
            Hence, main thread before completing its job will wait for t1 to complete first. */
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Starting thread two");
        t2.start();
    }

}