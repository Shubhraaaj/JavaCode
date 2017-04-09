package SocketProgram;

import java.io.*;
import java.net.*;

public class Net2_TCMPTClient
{
    public static void main(String args[])throws IOException
    {
        String fact;
        //Create a Socket to Server
        Socket clientEnd=new Socket("localhost",6789);
        System.out.println("CONNECTED TO LOCAL HOST 6789");
        //Get Streams
        PrintWriter toServer=new PrintWriter(clientEnd.getOutputStream(),true);
        BufferedReader fromServer=new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            //Get integer from User
            System.out.println("ENTER AN INTEGER");
            String n=fromUser.readLine();
            //Send to Server
            toServer.println(n);
            System.out.println("SENT TO SERVER:"+n);
            if(n=="-1")
                break;
            fact=fromServer.readLine();
            System.out.println("RECEIVED FROM SERVER:"+fact);
        }
        clientEnd.close();
    }
}
