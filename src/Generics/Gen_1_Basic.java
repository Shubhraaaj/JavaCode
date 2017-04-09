package Generics;

//Java Program to create Generic Types

/*The Method is used to convert one type to another without use of Generics. Whenever we
call store it always has to be casted to the type passed*/

/*class Store
{
    Object item;

    public String toString(){
        return item.toString();
    }

    public void setItem(Object item) {
        this.item = item;
    }
}*/

//Below is method to do the same function by use of Generics, Here there will no Casting.
class Store<T>
{
    T item;
    public void setItem(T item) {
        this.item = item;
    }
    public String toString()
    {
        return this.item.toString();
    }
}

class HashTable<K,V>
{
    private K key;
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public String toString()
    {
        return key.toString()+"->"+value.toString();
    }
}

public class Gen_1_Basic
{
    public static void main(String args[])
    {
        Store<String> s=new Store<>();    //With this the Software will be fast enough as it will not have to cast each time
        s.setItem("SHUBHRAJ PRASAD SINGH");
        System.out.println(s);
        HashTable<Integer,String> hashTable=new HashTable<>(2,"Ashu");
        System.out.println(hashTable);
    }
}
//When we create many items for the Store class then each time the Casting will take place and
//It will be very expensive for the Software