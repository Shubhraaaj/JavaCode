package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class Box
{
    int length;
    int breadth;
    int height;

    Box()
    {
        this.length=0;
        this.breadth=0;
        this.height=0;
    }
    Box(int l,int b,int h)
    {
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    void Area()
    {
        System.out.println("AREA="+(length*breadth));
    }
    void Volume()
    {
        System.out.println("VOLUME="+(length*breadth*height));
    }
}
