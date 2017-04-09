package Exceptions;

import java.io.IOException;

public class Types
{
    public static void main(String args[]) {
        try
        {
            System.out.println(8/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("DIVISION BY ZERO");
        }
        finally
        {
            System.out.println("ALWAYS EXECUTED");
        }
        try
        {
            int x=Integer.parseInt("ASHU");
        }
        catch(NumberFormatException e)
        {
            System.out.println("INPUT OUTPUT EXCEPTION");
        }
    }
}

/*Types of Exceptions in JAVA:-
1. ArithmeticException
2. ArrayIndexOutOfBoundsException
3. ArrayStoreException - Assignment of an array element of incompatible types
4. ClassCastException - Invalid cast
5. IllegalArgumentException
6. IllegalMonitorStateException - Waiting for an Unlocked Thread
7. IllegalStateException - Application in incorrect State
8. IllegalThreadStateException
9. IndexOutOfBoundsException
10. NegativeArraySizeException
11. NullPointerException
12. NumberFormatException
13. SecurityException
14. StringIndexOutOfBoundsException
15. UnsupportedOperationException
16. ClassNotFoundException
17. CloneNotSupportedException - Attempt to clone an object that doesn't support Cloneable Interface
18. IllegalAccessException
19. InstantiationException - Create an Object of Abstract Class
20. InterruptedException
21. NoSuchFieldException
22. NoSuchMethodException
 */
