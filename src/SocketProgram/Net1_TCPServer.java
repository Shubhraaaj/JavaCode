package SocketProgram;

import java.io.*;
import java.net.*;

public class Net1_TCPServer
{
    public static void main(String args[]) throws IOException
    {
        //Creates a Server Socket at Port 6789
        ServerSocket serverSocket=new ServerSocket(6789);
        System.out.println("SERVER IS LISTENING AT PORT 6789");
        //Waiting for Incoming Connection
        Socket serverEnd=serverSocket.accept();
        System.out.println("REQUEST ACCEPTED");
        //Get Streams
        BufferedReader fromClient=new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
        PrintWriter toClient=new PrintWriter(serverEnd.getOutputStream(),true);
        //Receive Data from Client
        int n=Integer.parseInt(fromClient.readLine());
        System.out.println("RECEIVED FROM CLIENT:"+n);
        int fact=1;
        for(int i=2;i<=n;i++)
            fact*=i;
        //Send Data Back to the Client
        toClient.println(fact);
        System.out.println("SENT TO CLIENT:"+fact);
    }
}
