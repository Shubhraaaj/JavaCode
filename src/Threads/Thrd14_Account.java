package Threads;
//DeadLock occurs when we lock the Locks in different orders.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
class Thread14Class
{
    private Account a1=new Account();
    private Account a2=new Account();

    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();
    
    public void acquireLock(Lock firstLock,Lock secondLock)
    {
    	while(true)
    	{
    		//Acquiring Locks
    		boolean gotFirstLock=true;
    		boolean gotSecondLock=true;
    		try
    		{
    			gotFirstLock=firstLock.tryLock();
    			gotSecondLock=secondLock.tryLock();
    		}
    		finally
    		{
    			if(gotFirstLock&&gotSecondLock)
    				return;
    			if(gotFirstLock)
    				firstLock.unlock();
    			if(gotSecondLock)
    				secondLock.unlock();
    		}
    		//Lock not Acquired
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void firstThread()throws InterruptedException
    {
        Random r=new Random();
        for(int i=0;i<10000;i++)
        {
        	acquireLock(lock1,lock2);
            try
            {
                Account.tranfer(a1,a2,r.nextInt(100));
            }
            finally
            {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void secondThread()throws InterruptedException
    {
        Random r=new Random();
        for(int i=0;i<10000;i++)
        {
        	acquireLock(lock1,lock2);
            try
            {
                Account.tranfer(a2,a1,r.nextInt(100));
            }
            finally
            {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }
    public void finished()
    {
        System.out.println("Account-1 Current Balance:"+a1.getBalance());
        System.out.println("Account-2 Currenet Balance:"+a2.getBalance());
        System.out.println("Total Amount Transactioned:"+(a1.getBalance()+a2.getBalance()));
    }
}

class Account
{
    private int balance=10000;

    public void deposit(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        balance-=amount;
    }
    public int getBalance()
    {
        return balance;
    }
    public static void tranfer(Account a1, Account a2, int amount)
    {
        a1.withdraw(amount);
        a2.deposit(amount);
    }

}
public class Thrd14_Account
{
    public static void main(String args[])throws InterruptedException
    {
        Thread14Class t=new Thread14Class();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    t.secondThread();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t.finished();
    }
}
