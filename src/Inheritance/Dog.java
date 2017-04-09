package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class Dog extends Animal
{
    public String name;
    public String sound;

    Dog()
    {
        this.name="DOGGY";
        this.sound="BHOW";
    }

    Dog(String name,String sound)
    {
        this.name=name;
        this.sound=sound;
    }

    public void Action()
    {
        System.out.print("WE LOVE TO DRINK MILK\n");
    }

    public void entertainment()
    {
        System.out.print("WE ARE MAN'S BEST FRIEND\n");
    }
}
