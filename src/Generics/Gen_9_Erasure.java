package Generics;

//Java Program to implement Type Erasure for Methods
//Replaces all occurances of Generics with wrappers/objects

public class Gen_9_Erasure
{
    public static <T> int count(T[] items, T pattern)
    {
        int ctr=0;
        for(T actualItem:items)
        {
            if(actualItem.equals(pattern))
                ctr++;
        }
        return ctr;
    }

    public static void main(String args[])
    {
        Integer[] numbers={1,3,3,3,3,3,3,3,1};
        Integer patter=3;
        System.out.println(count(numbers,patter));
    }
}
