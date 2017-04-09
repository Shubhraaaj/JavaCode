package Threads;

import java.util.concurrent.*;

public class Thrd16_Future
{
    public static void main(String args[])
    {
        ExecutorService exe= Executors.newCachedThreadPool();
        Future<Long> future=exe.submit(new Callable<Long>() {
                       @Override
                       public Long call() throws Exception {
                           long beg=System.currentTimeMillis();
                           System.out.print("Starting...\n");
                           Thread.sleep(10000);
                           System.out.println("Finished");
                           long end=System.currentTimeMillis();
                           return end-beg;
                       }
                   });
        exe.shutdown();
        try {
            System.out.println("RESULT:"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
