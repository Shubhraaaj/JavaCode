package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connection
{
    private static Connection instance=new Connection();
    private Semaphore sem=new Semaphore(10,true);
    private int count=0;
    public static Connection getInstance()
    {
        return instance;
    }
    public void connect()
    {
        try
        {
            sem.acquire();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        try
        {
            doConnect();
        }
        finally {
            sem.release();
        }
    }
    public void doConnect()
    {
        synchronized (this){

            count++;
            System.out.println("Current Connections:"+count);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            count--;
        }
    }
}
public class Thrd15_CachedThread
{
    public static void main(String args[]) throws InterruptedException {
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0;i<40;i++)
        {
            exec.submit(new Runnable() {
                @Override
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }
        exec.shutdown();
        exec.awaitTermination(1, TimeUnit.DAYS);
    }
}

/*Semaphores can be used as a Lock:-
semaphone.acquire(); - Deletes a Semaphore
semaphore.release(); - Increases a Semaphore
*/

/*CachedThreadPool will create a new Thread every time an executor is submitted.*/