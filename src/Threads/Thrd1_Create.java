package Threads;
//Creating a class and implementing 2-Threads which will run simultaneously.
//In this program we are using the Thread Class to work with Threads
class Runner extends Thread
{
    String name;
    Runner(String s)
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
public class Thrd1_Create
{
    public static void main(String args[])
    {
        Runner run=new Runner("ASHU");
        run.start();

        Runner runs=new Runner("SHUBHRAJ");
        runs.start();
    }
}

/*
1. we create two Threads with the help of a Class that extends Thread.
2. Thread.sleep() will be present inside the run() function.
3. When we extend the Thread Class we need to override the run() function.
4. Creating a new Thread is Simple <ClassName> <threadName> = new <ClassName>(Parameters);
5. <threadName>.start(); for running the Thread
 */