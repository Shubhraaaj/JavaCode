package DataStructure;

import java.util.*;

public class Iterators
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(0);l1.add(2);l1.add(7);l1.add(8);l1.add(6);l1.add(4);l1.add(3);
        list.add(12);
        list.addAll(l1);
        /*ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.set(12);
        }
        while (iterator.hasPrevious())
            System.out.println(iterator.previous());*/
        /*Enumeration<Integer> emun = Collections.enumeration(list);
        while(emun.hasMoreElements())
            System.out.println(emun.nextElement());
    */}
}

//We can also remove elements via Iterator and List Iterator.

/*Iterator Functions in JAVA:-
1. boolean hasNext()
2. next()
3. remove()
*/

/*LisIterator Functions JAVA:-
1. void add(Object e)
2. boolean hasNext()
3. boolean hasPrevious()
4. Object next()
5. int nextIndex()
6. Object previous()
7. int previousIndex()
8. void remove()
9. void set(Object e)
*/

/*Enumeration Functions JAVA:-
1. boolean hasMoreElements()
2. Object nextElement()
 */