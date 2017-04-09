package Threads;
//Java Program to use Executor Service of Thread Pools
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processors implements Runnable
{
    private int id;

    public Processors(int i)
    {
        this.id=i;
    }
    @Override
    public void run()
    {
        System.out.println("STARTING..."+id);
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Completed:"+id);
    }
}
public class Thrd7_Executor
{
    public static void main(String args[])
    {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        for(int i=0;i<=5;i++)
        {
            System.out.println("YAA BABY"+i);
            executor.submit(new Processors(i));
        }
        executor.shutdown();
        System.out.println("All the tasks submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks completed");
    }
}

/*
1. Here we use the ExecutorService Class to create a fixed number of Threads.
2. exucutors.submit(no.ofThreads) is required to create the Number of Threads that needs to be created.
3. executors.shutdown()
4. executor.awaitTermination(1,TimeUnit.DAYS); is required to end the Threads if Blocked.
 */