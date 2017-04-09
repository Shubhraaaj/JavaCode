package Exceptions;

import java.io.IOException;

public class CustomException
{
    public static void main(String args[])
    {
        int x=1;
        try
        {
            if(x==1)
            {
                throw new IOException("X is Equal to 1");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
