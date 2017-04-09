package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashs
{
    public static void main(String args[])
    {
        HashMap hs=new HashMap();
        hs.put(1,"SPOTI");
        hs.put(2,"SHUBHRAJ");
        hs.put(5,"PRASAD");
        hs.put(6,"SINGH");
        Iterator iter=hs.entrySet().iterator();
        while(iter.hasNext())
        {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("KEY=" + entry.getKey());
            System.out.println("VALUE=" + entry.getValue());
        }
    }
}
