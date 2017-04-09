package SocketProgram;

import java.net.*;

public class Net7_UDPFactServer
{
    public static void main(String args[])throws Exception
    {
        byte[] rbuf=new byte[10], sbuf=new byte[10];

        //Create a Server Socket at Port:5000
        DatagramSocket socket=new DatagramSocket(5000);
        System.out.println("SERVER READY");
        DatagramPacket rpkt=new DatagramPacket(rbuf,rbuf.length);

        //Receive a Packet from Client
        socket.receive(rpkt);

        //Extract data and client Information from Packet
        String data=new String(rpkt.getData(), 0, rpkt.getLength());
        InetAddress addr=rpkt.getAddress();
        int port=rpkt.getPort();

        int fact=1,n=Integer.parseInt(data);
        System.out.println("RECEIVED:"+n+" FROM "+addr+":"+port);
        for(int i=2;i<=n;i++)
            fact*=i;
        sbuf=String.valueOf(fact).getBytes();
        DatagramPacket spkt=new DatagramPacket(sbuf,sbuf.length,addr,port);

        //Send Result to Client
        socket.send(spkt);
        System.out.println("SENT:"+fact);
    }
}
