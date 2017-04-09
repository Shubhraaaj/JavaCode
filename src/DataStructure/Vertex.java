package DataStructure;

import java.util.ArrayList;

public class Vertex
{
    private ArrayList<Edge> neighbourhood;
    private String label;

    public Vertex(String label) {
        this.label = label;
        this.neighbourhood = new ArrayList<Edge>();
    }

    public void addNeighbour(Edge edge)
    {
        if(this.neighbourhood.contains(edge))
            return;
        this.neighbourhood.add(edge);
    }

    public boolean containsNeighbour(Edge other)
    {
        return this.neighbourhood.contains(other);
    }

    public Edge getNeighbour(int index)
    {
        return this.neighbourhood.get(index);
    }

    Edge removeNeighbour(int index)
    {
        return this.neighbourhood.remove(index);
    }

    public void removeNeighbour(Edge e)
    {
        this.neighbourhood.remove(e);
    }

    public int getNeighbourCount()
    {
        return this.neighbourhood.size();
    }

    public String getLabel()
    {
        return this.label;
    }

    public String toString()
    {
        return "VERTEX "+ label;
    }

    public int hashCode()
    {
        return this.label.hashCode();
    }

    public boolean equals(Object other)
    {
        if(!(other instanceof Vertex))
            return false;
        Vertex v = (Vertex) other;
        return this.label.equals(v.label);
    }

    public ArrayList<Edge> getNeighbourhood()
    {
        return new ArrayList<Edge>(this.neighbourhood);
    }
}
