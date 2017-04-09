package Generics;

//Java Program to show usage of UpperBounded WildCards
//Suppose we need to write a program that will work on a list of Integers, Doubles, Numbers
//Arrays.asList(...) can be used to pass arrays as parameters

import java.util.Arrays;
import java.util.List;

public class Gen_5_UpperBound
{
    public static double sum(List<? extends Number> list)
    {
        double temp=0;
        for(Number number:list)
            temp=temp+number.doubleValue();
                    //We cannot use temp=temp+o; because we are not specifying if it is a number
        return temp;
    }
    public static void main(String args[])
    {
        System.out.println(sum(Arrays.asList(1,2,3,4,5)));
    }
}
