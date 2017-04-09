//Implementation of LinkedLists by use of Node. Covering all processes from Inserting, Deleting, Displaying and Reversing

package DataStructure;
import java.io.*;

//Node class for Creation of Nodes and Initialization along with setting and getting values
class Node
{
    protected int data;
    protected Node link;

    public Node() {
        data = 0;
        link = null;
    }

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLink(Node link)
    {
        this.link=link;
    }

    public int getData()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }
}

//LinkedList class for Addition of elements to the Linked List and Deletion along with Transversal

class LinkLists extends Node
{
    protected Node Start;

    public LinkLists()
    {
        this.Start=null;
    }

    public boolean isEmpty()
    {
        return Start==null;
    }

    public void insert(int val) {
        Node nptr, ptr, save = null;
        nptr = new Node(val, null);
        boolean ins = false;                //This variable checks either a node is inserted in the middle or not
        // Adding Node at the beginning of the Linked List if the Linked List is Empty
        if (Start == null)
            Start = nptr;
        //Adding Node at the beginning if Starting node is less than the new Node
        else if (val <= Start.getData())
        {
            nptr.setLink(Start);
            Start = nptr;
        }
        //Adding Node at the Middle
        else
        {
            save = Start;
            ptr = Start.getLink();
            while (ptr != null)
            {
                if (val>=save.getData()&&val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
        //Addition at the End of the Linked List
            if (ins == false)
            {
                save.setLink(nptr);
            }
        }
    }
    public boolean delete(int val)
    {
        boolean res=false;
        if(Start.getData()==val)
        {
            Start=Start.getLink();
            res=true;
        }
        else
        {
            Node ptr,save;
            save=Start;
            ptr=Start.getLink();
            while(ptr.getLink()!=null)
            {
                if(ptr.getData()==val)
                {
                    save.setLink(ptr.getLink());
                    res=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
        }
        return res;
    }
    public void traverse()
    {
        System.out.print(Start.getData()+"-->");
        Node ptr=Start.getLink();
        while(ptr.getLink()!=null)
            {
            System.out.print(ptr.getData()+"-->");
            ptr=ptr.getLink();
        }
        System.out.print(ptr.getData());
    }
    public void concat(Node l2)
    {
        Node ptr,save=null;
        save=ptr=Start;
        while(ptr!=null)
        {
            save=ptr;
            ptr=ptr.getLink();
        }
        save.setLink(l2);
    }
    public void split(LinkLists l1, LinkLists l2)
    {
        Node ptr,save;
        System.out.println("ENTER THE NODE NUMBER FROM WHERE TO SPLIT");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int n=Integer.parseInt(br.readLine());
            if(n<=0||n>10)
                System.out.println("Invalid Input Size");
            else
            {
                l1.Start=Start;
                save=ptr=Start;
                for(int i=0;i<n;i++)
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
                save.setLink(null);
                l2.Start=ptr;
            }
        }
        catch(IOException e)
        {
            System.out.println("WRONG INPUT TYPE");
        }
    }
    /*public void reverseNew(LinkLists l1)
    {
        l1.Start=null;
        Node nptr,ptr;
        ptr=Start;
        while(ptr!=null)
        {
            nptr=new Node(ptr.getData(),null);
            if(l1.Start==null)
            {
                l1.Start=nptr;
            }
            else
            {
                nptr.setLink(l1.Start);
                l1.Start=nptr;
            }
            ptr=ptr.getLink();
        }
    }*/

    public void reverse(LinkLists L)
    {
        Node currentNode=Start;
        Node nextNode=Start.getLink();
        L.Start=Start;
        Node ptr=new Node();
        while(nextNode!=null)
        {
            ptr.setData(currentNode.getData());
            if(L.Start==null)
            {
                L.Start=ptr;
            }
            else
            {
                ptr.setLink(L.Start);
                L.Start=ptr;
            }
        }
    }
    public void reverses(int nu)
    {
        Node fp=Start,lp=null,save,ptr;
        int tmp,n=nu/2;
        for(int i=0;i<n;i++)
        {
            ptr=Start;
            while(ptr!=lp)
            {
                save=ptr;
                ptr=ptr.getLink();
                lp=save;
                tmp=fp.getData();
                fp.setData(lp.getData());
                lp.setData(tmp);
                fp=fp.getLink();
            }
        }
    }
    public int size(Node l)
    {
        if(l.getLink()==null)
            return 0;
        else
            return (1+size(l.getLink()));
    }
    public void display(Node l)
    {
        if(l!=null)
        {
            System.out.print(l.getData()+"-->");
            display(l.getLink());
        }
    }
    public int sum(Node l)
    {
        if(l.getLink()==null)
            return 0;
        else
            return l.getData()+sum(l.getLink());
    }
}
public class LinkedClass
{
    protected static LinkLists S;
    protected static LinkLists T;
    protected static LinkLists U;
    protected static LinkLists V;
    protected static LinkLists W;
    public static void main(String args[])throws IOException
    {
        int num;
        S=new LinkLists();
        T=new LinkLists();
        U=new LinkLists();
        V=new LinkLists();
        W=new LinkLists();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("STARTING THE INSERTION PROCESS\nPlease enter the number of Elements to Insert");
        short ny=Short.parseShort(br.readLine());
        for(int i=0;i<ny;i++) {
            System.out.println("ENTER A NUMBER");
            try {
                int nume = Integer.parseInt(br.readLine());
                S.insert(nume);
                System.out.println("Inserted");
            } catch (IOException e) {
                System.out.print("Please Enter a ValidInteger\n");
            }
        }
        System.out.print("Displaying Entire List:\n");
        S.traverse();
        System.out.println("REVERSING THE SECOND LIST AND STORING IT IN DIFFERENT LIST");
        T.reverse(W);
        T.traverse();
        System.out.println("ENTER THE VALUE TO DELETE");
        S.delete(Integer.parseInt(br.readLine()));
        System.out.println("Displaying Node After Deletion");
        S.traverse();
        System.out.println("Enter the Number of Elements of the 2nd Link List");
        int n=Short.parseShort(br.readLine());
        try
        {
            for(int i=0;i<n;i++) {
                System.out.println("Enter a Number");
                int nu=Integer.parseInt(br.readLine());
                T.insert(nu);
                System.out.println("INSERTED");
            }
        }
        catch (Exception e)
        {
            System.out.println("WRONG INPUT");
        }
        System.out.println("SUM OF ELEMENTS OF THE FIRST LIST:"+S.sum(S.Start));
        System.out.println("SIZE:"+S.size(S.Start));
        System.out.println("ELEMENTS OF THE FIRST LIST:");
        S.display(S.Start);
        System.out.println("Displaying List after Catenation");
        S.concat(T.Start);
        System.out.println("Concatenated List");
        S.traverse();
        S.split(U,V);
        U.traverse();
        V.traverse();
        System.out.println("REVERSING THE FIRST LIST");
        S.reverses(ny);
        S.traverse();
    }
}

/*LinkedList Functions:-
1. void element() - Retrives the head of the LinkedList
2. void getFirst()
3. void getLast()
4. int indexOf(Object e)
5. int lastIndexOf(Object e)
6. Object peek()
7. Object peekFirst()
8. Object peekLast()
9. Object poll()
10. Object[] toArray()
11. int size()
12. Object set(index, element)
13. int removeLast()

NoSuchElementException
 */