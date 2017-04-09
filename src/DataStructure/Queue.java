package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueFunctions
{
    Node front,rear;
    int size;
    QueueFunctions()
    {
        rear=front=null;
        size=0;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public int size()
    {
        return size;
    }
    public void insert(int value)
    {
        Node nptr=new Node(value,null);
        if(rear==null)
            front=rear=nptr;
        else
        {
            rear.setLink(nptr);
            rear=rear.getLink();
        }
        size++;
    }
    public int remove()
    {
        if(isEmpty())
            return 0;
        Node tmp=front;
        front=tmp.getLink();
        if(front==null)
            rear=null;
        size--;
        return tmp.getData();
    }
    public int peep()
    {
        return front.getData();
    }
}
public class Queue
{
    protected static QueueFunctions s1;
    public static void main(String args[]) throws IOException
    {
        s1 = new QueueFunctions();
        short items, i;
        int insert;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ITEMS TO INSERT IN THE STACK");
        items = Short.parseShort(br.readLine());
        for (i = 0; i < items; i++)
        {
            System.out.println("ENTER THE VALUE TO INSERT");
            insert = Integer.parseInt(br.readLine());
            s1.insert(insert);
        }
        System.out.println("ITEM AT TOP:" + s1.peep());
        System.out.println("ENTER THE NUMBER OF VALUES TO POP");
        items = Short.parseShort(br.readLine());
        for (i = 0; i < items; i++)
        {
            System.out.println("THE VALUE POPPED:" + s1.remove());
            System.out.println("SIZE:" + s1.size);
        }
        System.out.println("ITEM AT TOP:" + s1.peep());
    }
}