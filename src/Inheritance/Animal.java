package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class Animal
{
    public String name;
    public int age;
    public String sound;

    Animal()
    {
        this.name="HUMAN BEINGS";
        this.sound="HELLO";
        this.age=80;
    }

    Animal(String name,String sound,int age)
    {
        this.name=name;
        this.sound=sound;
        this.age=age;
    }

    public void action()
    {
        System.out.println("I LIKE TO EAT FLESH");
    }

    public void motion()
    {
        System.out.println("I LIKE TO WALK ON 2-LEGS");
    }

    public void entertainment()
    {
        System.out.println("WE FALL IN LOVE");
    }
}
