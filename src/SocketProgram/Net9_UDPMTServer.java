package SocketProgram;

import java.io.*;
import java.net.*;

class Handle implements Runnable
{
    DatagramSocket socket;
    DatagramPacket pkt;

    public Handle(DatagramSocket socket, DatagramPacket pkt) {
        this.socket = socket;
        this.pkt = pkt;
        new Thread(this).start();
        System.out.println("A THREAD HAS BEEN CREATED");
    }

    @Override
    public void run() {
        try
        {
            byte[] sbuf=new byte[10];
            //Extracting Data from client information from this Packet
            String data=new String(pkt.getData(),0,pkt.getLength());
            InetAddress addr=pkt.getAddress();
            int port=pkt.getPort();
            int fact=1,n=Integer.parseInt(data);
            System.out.println("RECEIVED:"+n+" FROM "+addr+" : "+port);
            for(int i=2;i<=n;i++)
                fact*=i;
            sbuf=String.valueOf(fact).getBytes();
            DatagramPacket spkt=new DatagramPacket(sbuf,sbuf.length,addr,port);
            //Send Result to client
            socket.send(spkt);
            System.out.println("SENT:"+fact);
        }
        catch(IOException e)
        {
        }
    }
}

public class Net9_UDPMTServer
{
    public static void main(String args[])throws Exception {
        //Create a server Socket at Port 5000
        DatagramSocket socket = new DatagramSocket(5000);
        System.out.println("SERVER READY");
        while (true) {
            byte[] rbuf = new byte[10];
            DatagramPacket rpkt = new DatagramPacket(rbuf, rbuf.length);
            socket.receive(rpkt);
            System.out.println("RECEIVED A PACKET");
            //Hand over this packet to Handler
            new Handle(socket, rpkt);
        }
    }
}
