package SocketProgram;

import java.io.*;
import java.io.InputStreamReader;
import java.net.*;

class Handler implements Runnable
{
    Socket serverEnd;

    public Handler(Socket serverEnd) {
        this.serverEnd = serverEnd;
        new Thread(this).start();
        System.out.println("THREAD STARTED");
    }

    @Override
    public void run() {
        try {
            BufferedReader fromClient=new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
            PrintWriter toClient=new PrintWriter(serverEnd.getOutputStream(),true);
            while(true)
            {
                //Receive data from Client
                int n=Integer.parseInt(fromClient.readLine());
                System.out.println("RECEIVED:"+n);
                if(n==-1)
                {
                    serverEnd.close();
                    break;
                }
                int fact=1;
                for(int i=2;i<=n;i++)
                    fact*=i;
                //Sending Result back to Client
                toClient.println(fact);
                System.out.println("SENT:"+fact);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Net2_TCMPTServer
{
    public static void main(String args[]) throws IOException
    {
        ServerSocket welcomeServer=new ServerSocket(6789);
        System.out.println("SERVER READY");
        while(true)
        {
            Socket serverEnd=welcomeServer.accept();
            System.out.println("REQUEST RECEIVED");
            //Hand over this connection request to Handler
            new Handler(serverEnd);
        }
    }
}
