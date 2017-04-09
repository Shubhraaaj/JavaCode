package Threads;

import java.util.LinkedList;
import java.util.Random;

public class Thrd11_PrdCon
{
    private LinkedList<Integer> list=new LinkedList<Integer>();
    private final int LIMIT=10;
    private Object lock=new Object();

    public void produce()throws InterruptedException
    {
        int value=0;
        while (true)
        {
            synchronized (lock) {
                if (list.size() == 10) {
                    lock.wait();
                }
                list.add(value++);
            }
        }
    }
    public void consumer()throws InterruptedException
    {

        Random random=new Random();
        while (true)
        {
            synchronized (lock)
            {
                while(list.size()==0)
                {
                    lock.wait();
                }
                System.out.print("List Size:"+list.size());
                int value=list.removeFirst();
                System.out.println("    Value is:"+value);
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000));
        }
    }
}
class ForThread11
{
    public static void main(String args[])throws InterruptedException
    {
        Thrd11_PrdCon t=new Thrd11_PrdCon();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.produce();
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
