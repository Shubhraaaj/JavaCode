package Generics;

//Java Program to implement LowerBounded WildCards restricts the unknown type to be specific type

import java.util.Arrays;
import java.util.List;

public class Gen_7_LowerBound
{
    public static void addNumber(List<? super Number> list)
    {
        for(Object o:list)
        {
            System.out.println(o);
        }
    }

    public static void main(String args[])
    {
        addNumber(Arrays.asList(12,12,12,12,12,1,21,2));
    }
}
