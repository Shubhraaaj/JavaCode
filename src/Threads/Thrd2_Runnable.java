package Threads;
//Java Program to implement Runnable interface from which we can create Threads
//It is another method of Thread creations
class Runners implements Runnable
{
    String name;
    Runners(String s)
    {
        this.name=s;
    }
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("HELLO "+name+" "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Thrd2_Runnable
{
    public static void main(String args[])
    {
        Thread t1=new Thread(new Runner("ASHU"));
        Thread t2=new Thread(new Runner("SHUBHRAJ"));
        t1.start();
        t2.start();
    }
}

/*
1. We can also create Threads by implementing the Runnable Interface
2. But in this type of Thread creation, We need to create Objects of the Thread Class - Thread <threadName> = new Thread(new <className>(Parameters))
 */