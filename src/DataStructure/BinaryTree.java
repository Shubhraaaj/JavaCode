package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeNode
{
    protected int value;
    protected TreeNode left,right;

    TreeNode()
    {
        value=0;
        left=right=null;
    }

    TreeNode(int val)
    {
        value=val;
        left=right=null;
    }
    public void setValue(int val)
    {
        value=val;
    }
    public void setLeft(TreeNode left)
    {
        this.left=left;
    }
    public void setRight(TreeNode right)
    {
        this.right=right;
    }
    public int getValue()
    {
        return value;
    }
    public TreeNode getLeft()
    {
        return left;
    }
    public TreeNode getRight()
    {
        return right;
    }
}

class TreeFunctions {
    TreeNode root;

    TreeFunctions() {
        root = null;
    }

    TreeFunctions(int val, TreeNode l, TreeNode r) {
        root.setValue(val);
        root.setLeft(l);
        root.setRight(r);
    }

    public void insert(int data)
    {
        root = insertItem(root,data);
        System.out.println("INSERTED");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeNode insertItem(TreeNode node,int data) {
        if (node == null)
            node=new TreeNode(data);
        else {
            if (data < node.value)
                node.left = insertItem(node.left, data);
            else
                node.right = insertItem(node.right, data);
        }
        return node;
    }

    public void preorderTraverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preorderTraverse(root.getLeft());
            preorderTraverse(root.getRight());
        }
    }

    public void postorderTraverse(TreeNode root) {
        if(root!=null){
            postorderTraverse(root.getLeft());
            postorderTraverse(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    public void inorderTraverse(TreeNode root) {
        if (root != null) {
            inorderTraverse(root.getLeft());
            System.out.print(root.getValue() + " ");
            inorderTraverse(root.getRight());
        }
    }

    public void preorder()
    {
        preorderTraverse(root);
    }

    public void postorder()
    {
        postorderTraverse(root);
    }

    public void inorder()
    {
        inorderTraverse(root);
    }

    public boolean search(int data)
    {
        return searchItem(root,data);
    }

    public boolean searchItem(TreeNode node,int value)
    {
        boolean status = false;
        while((node!=null)&&!status)
        {
            int rval= node.getValue();
            if(value<rval)
                node=node.getLeft();
            else if(value>rval)
                node=node.getRight();
            else {
                status=true;
                break;
            }
        }
        return status;
    }

    public void delete(int key)
    {
        if(isEmpty())
            System.out.println("EMPTY TREE");
        else if(search(key)==false)
            System.out.println("KEY NOT PRESENT IN THE TREE");
        else
        {
            root=deleteNode(root,key);
            System.out.println("DELETED");
        }
    }

    public TreeNode deleteNode(TreeNode root,int data)
    {
        TreeNode p,p2,n;
        if(root.getValue()==data)
        {
            if(root.getLeft()==null&&root.getRight()==null)
                return null;
            else if(root.getLeft()==null)
            {
                p=root.getRight();
                return p;
            }
            else if(root.getRight()==null)
            {
                p=root.getLeft();
                return p;
            }
            else
            {
                p2=root.getRight();
                p=root.getRight();
                while(p.getLeft()!=null)
                    p=p.getLeft();
                p.setLeft(root.getLeft());
                return p2;
            }
        }
        else if(data<root.getValue())
        {
            n=deleteNode(root.getLeft(),data);
            root.setLeft(n);
        }
        else
        {
            n=deleteNode(root.getRight(),data);
            root.setRight(n);
        }
        return root;
    }
}

public class BinaryTree
{
    protected static TreeFunctions t1;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t1=new TreeFunctions();
        while(true)
        {
            System.out.println("1.INSERT\n2.DELETE\n3.TRAVERSE\n4.SEARCH\n5.EXIT");
            short op=Short.parseShort(br.readLine());
            switch(op)
            {
                case 1: System.out.println("ENTER THE ELEMENT TO INSERT");
                        int ins=Integer.parseInt(br.readLine());
                        t1.insert(ins);
                        break;

                case 2: System.out.println("ENTER THE ELEMENT TO DELETE");
                        int del=Integer.parseInt(br.readLine());
                        t1.delete(del);
                        break;

                case 3: System.out.println("1.INORDER\n2.PREORDER\n3.POSTORDER");
                        short op1=Short.parseShort(br.readLine());
                        switch(op1)
                        {
                            case 1:
                                t1.inorder();
                                System.out.println();
                                break;
                            case 2:
                                t1.preorder();
                                System.out.println();
                                break;
                            case 3:
                                t1.postorder();
                                System.out.println();
                                break;
                            default:
                                System.out.println("WRONG CHOICE ENTERED");
                        }
                        break;

                case 4: System.out.println("ENTER THE ELEMENT TO SEARCH");
                        int search=Integer.parseInt(br.readLine());
                        if(t1.search(search))
                            System.out.println("KEY PRESENT");
                        else
                            System.out.println("KEY ABSENT");
                        break;

                case 5: System.exit(1);
                        break;

                default: System.out.println("WRONG CHOICE ENTERED");
            }
        }
    }
}
