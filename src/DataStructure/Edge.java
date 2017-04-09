package DataStructure;

public class Edge implements Comparable<Edge>
{
    private Vertex one, two;
    private int weight;

    public Edge(Vertex one, Vertex two) {
        this(one, two, 1);
    }

    public Edge(Vertex one, Vertex two, int weight) {
        this.one = (one.getLabel().compareTo(two.getLabel())<=0)? one :two;
        this.two = (this.one == one)?two:one;
        this.weight = weight;
    }

    public Vertex getNeighbour(Vertex vertex)
    {
        if(!(vertex.equals(one)||vertex.equals(two)))
            return null;
        return (vertex.equals(one))?two:one;
    }

    public Vertex getOne()
    {
        return this.one;
    }

    public Vertex getTwo()
    {
        return this.two;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String toString()
    {
        return "({" + one +", " + two + "}, " + weight + ")";
    }

    public int hashCode() {
        return (one.getLabel() + two.getLabel()).hashCode();
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Edge))
            return false;
        Edge e = (Edge) other;
        return e.one.equals(this.one) && e.two.equals(this.two);
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}
