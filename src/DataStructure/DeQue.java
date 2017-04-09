package DataStructure;

import java.util.*;
public class DeQue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque=new ArrayDeque<>();
        Set<Integer> set=new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size()==(m+1))
            {
                int nm=deque.removeFirst();
                if(!set.contains(nm))
                {

                }
            }
        }
        /*My method of solving the unique elements problem
        int j,x=0;
        int d=0;
        int c=d;
        List deque = new ArrayList<Integer>();
        boolean status=true;
        List<Integer> list=new ArrayList<Integer>(m);
        while((deque.size())>=m) {
            j = 0;
            for (int i = 0; i < m; i++) {
                list.add((Integer) deque.get(j));
                System.out.println("ADDED "+deque.get(j)+"TO ARRAYLIST");
                j++;
            }
            System.out.println("REMOVED FROM DEQUE:"+deque.remove(0));
            while((list.size())!=0)
            {
                Iterator<Integer> iterator=list.iterator();
                while(iterator.hasNext())
                {
                    if(status==true)
                    {
                        x=list.get(0);
                        status=false;
                    }
                    System.out.println("START OF A LOOP");
                    if(iterator.next()==x) {
                        System.out.println("FOUND "+list.get(0)+" SO REMOVED IT, SIZE:"+(list.size()-1));
                        iterator.remove();
                    }
                }
                c++;
                System.out.println("COUNTER:"+c);
                status=true;
            }
            list.clear();
            if(c>d) {
                System.out.println("C IS GREATER THAN "+d+" THEREFORE D="+c);
                d = c;
            }c=0;
        }
        System.out.println(d);*/
    }
}
