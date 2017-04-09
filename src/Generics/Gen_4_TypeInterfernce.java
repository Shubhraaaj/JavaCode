package Generics;

//Java Program to implement Type Interference
//Example:- List<Integer> list=new DataStructure<>();
//Serializable = getData("Hello world", new DataStructure<String>());

import java.util.ArrayList;
import java.util.List;

class Bucket<T>
{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}

public class Gen_4_TypeInterfernce
{
    public static <T> void addStore(T t,List<Bucket<T>> list)
    {
        Bucket<T> bucket=new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString()+" has been Added to the List");
    }
    public static void main(String args[])
    {
        List<Bucket<String>> list=new ArrayList<>();
        Gen_4_TypeInterfernce.addStore("ASHU",list);             //<class_name>.addStore(<item>,<list_name>);
    }
}