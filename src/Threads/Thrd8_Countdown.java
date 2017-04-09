package Threads;
//CountDown Latch is a lock used in Threads that has a condition that the number of times the Latch is pulled down it must be pulled up
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Boss implements Runnable
{
    private CountDownLatch latch;
    Boss(CountDownLatch latch)
    {
        this.latch=latch;
    }
    @Override
    public void run()
    {
        System.out.println("Starting");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        latch.countDown();
    }
}
public class Thrd8_Countdown
{
    public static void main(String args[])
    {
        CountDownLatch latch=new CountDownLatch(3);
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1;i<=3;i++)
        {
            executor.submit(new Boss(latch));
        }
        try
        {
            latch.await();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Completed");
        executor.shutdown();
    }
}