package SocketProgram;

import java.io.*;
import java.net.*;

public class Net1_TCPClient
{
    public static void main(String args[])throws IOException
    {
        String fact;
        Socket clientEnd=new Socket("localhost",6789);
        System.out.println("CONNECTED TO PORT 6789");
        //Get Streams
        PrintWriter toServer=new PrintWriter(clientEnd.getOutputStream(),true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        //Get an Integer from the User
        while(true) {
            System.out.println("ENTER AN INTEGER");
            String n = fromUser.readLine();
            if(n=="-1")
                break;
            //Send it to Server
            toServer.println(n);
            System.out.println("SENT TO SERVER:" + n);
            //Retrieve data from Server
            fact = fromServer.readLine();
            System.out.println("RECEIVED FROM SERVER:" + fact);
            //Close the Socket
        }
        clientEnd.close();
    }
}
