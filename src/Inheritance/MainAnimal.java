package Inheritance;

/**
 * Created by shubh on 07-08-2016.
 */
public class MainAnimal
{
    public static void main(String args[])
    {
        Animal a=new Animal();
        Cat c= new Cat();
        Dog d=new Dog();
        System.out.println("ANIMAL DETAILS:-\nNAME="+a.name+"\nAGE="+a.age+"\nSOUND="+a.sound);
        a.action();
        a.motion();
        a.entertainment();
        System.out.println("CAT DETAILS:-\nNAME="+c.name+"\nAGE="+c.age+"\nSOUND="+c.sound);
        c.action();
        c.motion();
        c.entertainment();
        System.out.println("DOG DETAILS:-\nNAME="+d.name+"\nAGE="+d.age+"\nSOUND="+d.sound);
        d.action();
        d.motion();
        d.entertainment();
    }
}
