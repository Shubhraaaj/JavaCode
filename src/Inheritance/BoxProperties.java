package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class BoxProperties extends Box
{
    String color;
    int price;

    BoxProperties(int l, int b, int h, String p, int c)
    {
        super(l,b,h);
        this.price=c;
        this.color=p;
    }

    void displayColorPrice()
    {
        System.out.println("COLOR PRICE="+(color+price));
    }
}
