package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class Cat extends Animal
{
    public String name;
    public String sound;

    Cat()
    {
        this.name="CATTY";
        this.sound="MEOWY";
    }

    Cat(String name,String sound)
    {
        this.name=name;
        this.sound=sound;
    }

    public void action()
    {
        System.out.print("WE LOVE TO DRINK MILK\n");
    }

    public void motion()
    {
        System.out.print("WE HAVE TO WALK ON 4-LEGS\n");
    }
}
