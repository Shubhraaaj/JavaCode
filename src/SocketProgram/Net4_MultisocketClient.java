package SocketProgram;

import java.net.*;

public class Net4_MultisocketClient
{
    public static void main(String args[])
    {
        try
        {
            //Create a MulticastSocket and bind to port 8379
            MulticastSocket socket=new MulticastSocket(8379);
            //Join to Multicast Group
            socket.joinGroup(InetAddress.getByName("224.0.0.1"));
            //Construct a DatagramPacket to receive packet
            byte[] in=new byte[256];
            DatagramPacket packet=new DatagramPacket(in,in.length);
            System.out.println("WAITING TO RECEIVE A PACKET...");
            //Receive the packet now and display
            socket.receive(packet);
            String msg=new String(in,0,packet.getLength());
            System.out.println("RECEIVED:"+msg);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
