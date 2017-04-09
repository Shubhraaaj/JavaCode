package Jdbc;

import java.io.*;
import java.util.*;

public class Sokoban
{
    private int v;  //Number of Vertices
    private LinkedList<Integer> adj[];

    //Constructor
    Sokoban(int v)
    {
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    //Function to add an Edge into the Graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    //Printing BFS Traversal from a Given Source 's'
    void bfs(int s)
    {
        //Mark all the vertices as not visited(By Default set as False)
        boolean visited[]=new boolean[v];
        //Create a Queue of BFS
        LinkedList<Integer> queue=new LinkedList<>();

        //Mark all the Current Node as visited and Enqueue it
        visited[s]=true;
        queue.add(s);

        while(queue.size()!=0)
        {
            //Dequeue a Vertex from Queue and Print it
            s=queue.poll();
            System.out.println(s+" ");

            //Get all adjacent vertices of the Dequeued vertex s.
            //If a adjacent has been visted, then mark it
            //Visited and Enqueue it

            Iterator<Integer> iterator=adj[s].iterator();
            while(iterator.hasNext())
            {
                int n=iterator.next();
                System.out.println(n);
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String args[])
    {
        Sokoban s=new Sokoban(4);
        s.addEdge(0,1);
        s.addEdge(0,2);
        s.addEdge(1,2);
        s.addEdge(2,0);
        s.addEdge(2,3);
        s.addEdge(3,3);
        System.out.println("FOLLOWING IS BFS STARTING FROM VERTEX 2");
        s.bfs(2);

        /* Trying NPTEL Problem
        int startIndex=0,boxIndex=0,targetIndex=0;

        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();

        Sokoban s=new Sokoban(row*column);

        String[] maze=new String[column];
        for(int i=0;i<row;i++)
        {
            maze[i]=scanner.next();
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++) {
                if (maze[i].charAt(j) == 'S')
                    startIndex = (i + 1) * (j + 1);
                else if (maze[i].charAt(j)== 'B')
                    boxIndex = (i + 1) * (j + 1);
                else if (maze[i].charAt(j) == 'T')
                    targetIndex = (i + 1) * (j + 1);
            }
        }

        for(int i=1;i<=row;i++)
        {
                if((i+column)<(row*column))
                    s.addEdge((i+column),i+1);
                if((i-column)>-1)
                    s.addEdge((i-column),i-1);
                if((i+1)<=column)
                    s.addEdge(i+1,i+1);
                if((i-1)>-1)
                    s.addEdge(i-1,i-1);
        }
        System.out.println("MOVING TO BOX FROM "+startIndex+" TO "+boxIndex);
        s.bfs(startIndex,boxIndex);
        System.out.println("MOVING FROM BOX TO TARGET");
        s.bfs(boxIndex,targetIndex);*/
    }
}