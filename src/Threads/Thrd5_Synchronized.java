package Threads;
//Java Program to implement synchronized keyword. we create 2-Threads that call the synchronized function
public class Thrd5_Synchronized
{
    private int count=0;
    public synchronized void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        Thrd5_Synchronized t=new Thrd5_Synchronized();
        t.doWork();
    }
    public void doWork()
    {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("First Thread");
                    increment();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) {
                    System.out.println("Second Thread");
                    increment();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("COUNT="+count);
    }
}
