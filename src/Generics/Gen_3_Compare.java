package Generics;

//Java Program to make use of Generic Bounds
//This method will be able to compare datatypes of any type

public class Gen_3_Compare
{
    public static <T extends Comparable<T>> T calculate( T t1,T t2)
    {
        if(t1.compareTo(t2)<0)  //0 if both items are equal
        {
            return t1;
        }
        return t2;
    }
    public static void main(String args[])
    {
        System.out.println(calculate("Zshu","shubhraj"));
    }
}
