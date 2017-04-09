package Threads;
import java.util.LinkedList;

public class Thrd12_PrdCon
{
    private LinkedList<Integer> list=new LinkedList<Integer>();
    private Object Lock=new Object();

    public void produce(int x)throws InterruptedException
    {
        int value = 0;
        System.out.println("Manufacturing " + x + " Items...");
        synchronized (Lock) {
            while (true) {
                if (value != x)
                    list.add(value++);
                if (value == x) {
                    Lock.wait();
                }
            }
        }
    }
    public void consume(int x)throws InterruptedException {
        synchronized (Lock) {
            while (true) {
                if (list.size() == 0) {
                    Lock.wait();
                }
                list.removeFirst();
                if (list.size() != (list.size() - x))
                    Lock.notify();

                System.out.println("Items Consumed:"+x);
            }
        }
    }
}
