package DataStructure;

//PriorityQueue is based on Priority Heap
//Heap DataStructure is very efficient to find the minimum and maximum of Queue

import java.util.*;
import java.util.Queue;

public class PriorityQueues
{
   public static void main(String args[])
   {
       Queue<Person> queue=new PriorityQueue<>();
       queue.add(new Person("Ashu",19));
       queue.add(new Person("Ash",15));
       queue.add(new Person("As",12));
       queue.add(new Person("A",11));
       for(Person i:queue)
       {
           System.out.println(i);
       }
       ArrayList<Person> personArrayList=new ArrayList<>();
       personArrayList.add(new Person("Ashu",1));
       personArrayList.add(new Person("Shubhraj",5));
       personArrayList.add(new Person("SP",3));
       personArrayList.add(new Person("YaaBaby",8));
       personArrayList.add(new Person("Spoti",2));
       Collections.sort(personArrayList);
       System.out.println("SORTING THE LIST");
       Iterator iterator=personArrayList.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
   }
}
