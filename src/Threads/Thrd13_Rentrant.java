//Re-Entrant Locking in Threads
//Lock Object and Condition Objects are Used too
package Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

//The number of times we lock it, we need to unlock it that many times
public class Thrd13_Rentrant extends Thread
{
    private int count=0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private void increment()
    {
        for(int i=0;i<10000;i++)
        {
            count++;
        }
    }

    public void firstThread()throws InterruptedException
    {
        lock.lock();
        System.out.println("Waiting...");
        condition.await();
        System.out.println("Woken Up");
        //We are putting a try block because It might happen that the increment() function won't work
        try
        {
            increment();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void secondThread()throws InterruptedException
    {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Press the Return Key");
        new Scanner(System.in).nextLine();
        System.out.println("Return Key Pressed");
        condition.signal();
        //We are putting a try block because It might happen that the increment() function won't work
        try
        {
            increment();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void run()
    {
        while(true)
        {
            try {
                firstThread();
                secondThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void finished()
    {
        System.out.println("Count="+count);
    }

    public static void main(String args[])
    {
        Thrd13_Rentrant thread13=new Thrd13_Rentrant();
        thread13.start();
    }
}
