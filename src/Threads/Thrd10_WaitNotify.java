package Threads;
//Java Program to show the usage of wait and notify functions.
import java.util.Scanner;

public class Thrd10_WaitNotify
{
    public void producer()throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("Producer is Running...");
            wait();
            System.out.println("Resumed");
        }
    }
    public void consumer()throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this)
        {
            System.out.println("Waiting for Return Key");
            sc.nextLine();
            System.out.println("Return Key Pressed");
            notify();
        }
    }
}
class ForThread10
{
    public static void main(String args[])throws InterruptedException
    {
        Thrd10_WaitNotify t=new Thrd10_WaitNotify();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}