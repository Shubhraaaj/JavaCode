package Jdbc;


import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();

        System.out.println("ROW:"+row+"\nCOLUMN:"+column);

        String[] maze=new String[column];
        for(int i=0;i<row;i++)
        {
            maze[i]=scanner.next();
            System.out.println("In Scanner:"+maze[i]);
        }
        char mazeChar[][]=new char[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
                mazeChar[i][j]=maze[i].charAt(j);
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
                System.out.print(mazeChar[i][j]);
            System.out.println();
        }
    }
}
