package DataStructure;

import java.io.*;
import java.util.Scanner;

public class InputOutput
{
    public static void main(String args[])throws IOException
    {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("NAME,AGE,SEX");
        String input=br.readLine();
        StringTokenizer tokenizer=new StringTokenizer(input,", .");
        String name=tokenizer.nextToken();
        int age=Integer.parseInt(tokenizer.nextToken());
        String sx=tokenizer.nextToken();
        System.out.println("NAME="+name+"\nAGE="+age+"\nSEX="+sex);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME,AGE,SEX");
        String name=sc.next();
        int age=sc.nextInt();
        String sex=sc.next();
        System.out.println("NAME="+name+"\nAGE="+age+"\nSEX="+sex);
    }
}
/*Scanner Functions in JAVA:-
1. void close() - Closes the Scanner Class
2. Pattern delimiter() - Returns the pattern this Scanner is currently using to match delimiters
3. String findInLine(String pattern) - Finds the next occurrence of specified pattern ignoring delimiters
4. String findInLine(String pattern) - Finds the next occurrence of specified String ignoring delimiters
5. String findWithinHorizon(String Pattern, int horizon) - Find occurrence of a pattern constructed from specified String.
6. boolean hasNext()
7. boolean hasNext(Pattern pattern)
8. boolean hasNext(String pattern)
9. boolean hasNextBigDecimal()
10. boolean hasNextBigInteger()
11. boolean hasNextBigInteger(int radix)
12. boolean hasNextBoolean()
13. boolean hasNextByte()
14. boolean hasNextByte(int radix)
15. boolean hasNextDouble()
16. boolean hasNextInt()
17. boolean hasNextFloat()
18. boolean hasNextInt(int radix)
19. boolean hasNextLine()
20. boolean hasNextLong()
21. boolean hasNextLong(int radix)
22. boolean hasNextShort()
23. boolean hasNextShort(int radix)
24. IOException ioException() - Returns IOException last thrown by Scanner's underlying readable
25. Locale locale() - Returns Scanners Locale
26. String next()
27. String next(Pattern pattern)
28. String next(String pattern) - Returns the next Token if it matches the Pattern
29. String nextBigDecimal()
30. String nextBigInteger()
31. String nextBigInteger(int radix)
32. All the hasNext() have their next()
33. String nextLine()
34. int radix() - Returns Scanner's Default Radix
35. void remove()
36. Scanner reset()
37. Scanner skip(String Pattern)
38. String toString()
 */

/*StringTokenizer Functions in JAVA:-
1. int countTokens()
2. boolean hasMoreElements()
3. boolean hasMoreTokens()
4. Object nextElement()
5. String nextToken()
6. String nextToken(String delim)
 */

