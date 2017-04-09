package Threads;
//Java Program to use a Boolean variable to manage the Thread
import java.util.Scanner;

class Processor extends Thread
{
    private volatile boolean running=true;  //Boolean variable converts to false after shutdown() function is called. Thus Terminating the Thread.
    @Override
    public void run()
    {
        while(running)
        {
            System.out.println("HELLO");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown()
    {
        running=false;
    }
}
public class Thrd4_Boolean
{
    public static void main(String args[])
    {
        Processor p=new Processor();
        p.start();
        System.out.println("PRESS RETURN TO STOP...");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        p.shutdown();
    }
}

/*
1. This method helps in synchronising a Thread in low-level.
 */