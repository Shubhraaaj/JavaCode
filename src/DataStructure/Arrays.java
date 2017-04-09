package DataStructure;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrays
{
    //DataStructure is best for reading and Inserting data
    //LinkedList is best for manipulating and deleting data
    //We should use List<Integer> list=new DataStructure<>();   //List is an Interface and it is a better practice
    public static void main(String args[])
    {
        int j=0;
        ArrayList<String> surname=new ArrayList<String>();
        surname.add("KRISHNA");
        surname.add("SANJAY");
        surname.add("ANKEETA");
        surname.add("SHUBHRAJ");
        surname.add("JAI");
        surname.add("KANCHANA");
        ArrayList<String> title=new ArrayList<String>();
        title.add("SAMANTARAY");
        title.add("PRASAD SINGH");
        title.add("SINGH");
        title.add("PRASAD SINGH");
        title.add("PRASAD SINGH");
        title.add("SINGH");

        surname.addAll(title);
        title.addAll(surname);

        surname.add(2,"ASHU");
        title.add(2,"TOSH");

        //DataStructure with For-Each Loop
        /*for(String i:surname) {
            System.out.print(i + " ");
            System.out.println(title.get(j));
            j++;
        }
        DataStructure<String> newy=new DataStructure<String>();
        newy.add("BABU");
        newy.add("MOTI");

        //Add new DataStructure at desired index
        //surname.addAll(3,newy);
        System.out.println("NEW ARRAYLIST WITH NEWY");
        for(String i:surname)
        {
            System.out.println(i);
        }
        if(surname.contains("ASHU")==true)
        {
            System.out.println("YAAMAN");
        }*/

        Iterator<String> iter=surname.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        while(iter.hasNext())
        {
            System.out.println("YES");
        }
    }
}
/*Notes on DataStructure:-
1. ConcurrentModificationException occurs when the list is structurally modified at any time after the iterator is created, in any way except the iterator's.
2. boolean add(datatype e); - Adds an element to the DataStructure
3. void add(index, datatype); - Adds element at a specific index
4. boolean addAll(Collection<? extends E> c) - All elements of the collection to the DataStructure
5. boolean addAll(index, Collection<? extends E> c) - All elements of the collection to the DataStructure at a specific index
6. DataStructure(initialCapacity) - Constructs an DataStructure of initial capacity.
7. void clear() - Removes all element of the DataStructure
8. Object clone() - Returns a shallow copy of DataStructure instance
9. boolean contains(Object o) - True/false
10. void ensureCapacity(int minCapacity) - Ensures the size of the DataStructure
11. Object get(index) - Returns the element of the DataStructure
12. int indexOf(Object o) - Returns index of first occurrence of the element in the list
13. boolean isEmpty() - True/False
14. int lastIndexOf(Object o) - True/False
15. boolean remove(Object o) - True/False
16. boolean removeAll(Collection<?> c) - Removes all the elements that are contained in the specified collection
17. protected void removeRange(int fromIndex, int toIndex) - Removes elements from and to
18. boolean retainAll(Collection<?> c) - Retains only the elements of the list that are contained in the specified Collection
19. Object set(int index, Object element) - Replaces the element at index with the Element in parameters
20. int size() - Returns the size
21. List<E> subList(fromIndex, toIndex) - Returns a subList fromIndex toIndex
22. Object[] toArray() - Returns an array containing all the elements in specified order
23. void trimToSize() - Trims the capacity of the DataStructure

Exceptions:-
1. IllegalArgumentException
2. NullPointerException
3. IndexOutOfBoundsException
4. ClassCastException
5. IllegalArgumentException
 */