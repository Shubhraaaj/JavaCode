package Generics;

//Java Program to use of Unbounded Generics
//When we have to use generics to use functions of the Object class
//Unbounded Generics is used when we don't have to use mathematical functions in the list
//Integer=Object but List<Object>!=List<Integer>

import java.util.Arrays;
import java.util.List;

public class Gen_6_Unbounded
{
    public static void printList(List<?> list)
    {
        for(Object o:list)
        {
            System.out.println(o+"\n");
        }
    }
    public static void main(String args[])
    {
        printList(Arrays.asList(12345,1234,455));
    }
}
