package Inheritance;

import java.io.*;
import java.util.*;

public class MainBox
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER THE DETAILS\nLENGTH=");
        int l=Integer.parseInt(br.readLine());
        System.out.print("BREADTH=");
        int b=Integer.parseInt(br.readLine());
        System.out.print("HEIGHT=");
        int h=Integer.parseInt(br.readLine());
        Scanner sc=new  Scanner(System.in);
        System.out.print("ENTER THE COLOR AND PRICE OF THE ARTICLE=");
        String color=sc.next();
        int price=sc.nextInt();
        BoxProperties bp=new BoxProperties(l,b,h,color,price);
        bp.Area();
        bp.Volume();
        bp.displayColorPrice();
        System.out.println("PRESS 1 TO EXIT");
        if(Integer.parseInt(br.readLine())==1)
        {
            System.exit(0);
        }
    }
}
