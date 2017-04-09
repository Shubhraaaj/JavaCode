package Generics;

//Type Erasure is used by Java to implement Generics
//Java Program for implementing type erasure for classes

class Node<T>
{
    private T data;
    private Node<T> nextNode;

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
public class Gen_8_LinkedList
{
    public static void main(String args[])
    {

    }
}
