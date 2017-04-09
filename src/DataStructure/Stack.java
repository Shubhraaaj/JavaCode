package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackFunctions extends Node
{
    Node top;
    int size;
    StackFunctions()
    {
        top=null;
        size=0;
    }

    public boolean isEmpty()
    {
        return top==null;
    }
    public void push(int value)
    {
        top=new Node(value,top);
        size++;
    }
    public int pop()
    {
        if(isEmpty())
            return 0;
        else {
            int tmp = top.getData();
            top = top.getLink();
            return tmp;
        }
    }
    public int peep()
    {
        return top.getData();
    }
}
public class Stack
{
    //protected static StackFunctions s1;
    public static void main(String args[])throws IOException
    {
        StackFunctions s1=new StackFunctions();
        short items,i;
        int insert;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ITEMS TO INSERT IN THE STACK");
        items=Short.parseShort(br.readLine());
        for(i=0;i<items;i++)
        {
            System.out.println("ENTER THE VALUE TO INSERT");
            insert=Integer.parseInt(br.readLine());
            s1.push(insert);
        }
        System.out.println("ITEM AT TOP:"+s1.peep());
        System.out.println("ENTER THE NUMBER OF VALUES TO POP");
        items=Short.parseShort(br.readLine());
        for(i=0;i<items;i++)
        {
            System.out.println("THE VALUE POPPED:"+s1.pop());
            System.out.println("SIZE:"+s1.size);
        }
        System.out.println("ITEM AT TOP:"+s1.peep());
    }
}