package SocketProgram;

import java.io.*;
import java.net.*;

public class Net9_UDPMTClient
{
    public static void main(String args[])throws IOException
    {
        byte[] rbuf=new byte[1024], sbuf=new byte[1024];
        BufferedReader fromUser=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket=new DatagramSocket();
        InetAddress addr=InetAddress.getByName("localhost");
        while(true)
        {
            //Get an Integer from User
            System.out.println("ENTER AN INTEGER");
            String data=fromUser.readLine();
            sbuf=data.getBytes();
            DatagramPacket spkt=new DatagramPacket(sbuf,sbuf.length,addr,5000);
            //Send to Server
            socket.send(spkt);
            System.out.println("SENT TO SERVER:"+data);
            if(data.equals("-1"))
                break;
            DatagramPacket rpkt=new DatagramPacket(rbuf,rbuf.length);
            socket.receive(rpkt);
            data=new String(rpkt.getData(),0,rpkt.getLength());
            System.out.println("RECEIVED FROM SERVER:"+data);
        }
        socket.close();
    }
}
