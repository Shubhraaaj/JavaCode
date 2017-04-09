package Threads;
//Java Program to crate Threads by use of Runnable Parameters
//We can use this method to create methods and Threads inside the Main Function
public class Thrd3_Inline
{
    public static void main(String args[])
    {
        Thread t1=new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("HELLO "+ i);
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
    }
}

/*
1. This method creates Threads inside the Main() function
2. Thread <threadName> = new Thread(new Runnable(){ Override the run()}
 */