package DataStructure;

//Student is a Generic Class that is used to Sort the Students according to the condition

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int id;
    float cgpa;

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public int compareTo(Student student)
    {
        if(cgpa==student.getCgpa())
        {
            if(name.equals(student.getName()))
            {
                if(id>student.getId())
                    return -1;
                else
                    return 1;
            }
            else if(name.compareTo(student.getName())<0)
                return -1;
            else
                return 1;
        }
        else if(cgpa>student.getCgpa())
            return -1;
        else
            return 1;
    }
}

//Java Program to create a list of Students and sort them according to their CGPAs in Ascending order.

public class SortList
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        List<Student> list=new ArrayList<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER THE NAME");
            String name=scan.next();
            System.out.println("ENTER THE ID");
            int id=scan.nextInt();
            System.out.println("ENTER THE CGPA");
            float cgpa=scan.nextFloat();
            list.add(new Student(name,id,cgpa));
        }
        Collections.sort(list);
        for(int i=0;i<n;i++)
        {
            System.out.println(list.get(i).getName());
        }
    }
}
