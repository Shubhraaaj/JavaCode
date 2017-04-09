package Generics;

//Java Program to show implementations of Generic Methods
//Actually generic methods just informs that the method is Generic

public class Gen_2_Methods
{
    public static <T> void printData(T data)
    {
        System.out.println(data.toString());
    }
    public static void main(String args[])
    {
        printData(789);
    }
}
