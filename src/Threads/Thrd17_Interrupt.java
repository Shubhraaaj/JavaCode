package Threads;

import java.util.Random;

public class Thrd17_Interrupt
{
    public static void main(String args[])
    {
        System.out.print("Starting...\n");
        Random r=new Random();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1E9;i++)
                {
                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("Interrupted");
                        break;
                    }
                    Math.sin(r.nextDouble());
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt(); //Checks if thread has been interrupted.
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}
