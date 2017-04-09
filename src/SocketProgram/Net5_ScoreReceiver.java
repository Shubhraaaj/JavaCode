package SocketProgram;

import java.io.*;
import java.net.*;

public class Net5_ScoreReceiver
{
    public static void main(String args[])throws Exception
    {
        byte[] inBuffer=new byte[256];
        InetAddress address=InetAddress.getByName("224.0.0.1");
        //Create a Multisocket
        MulticastSocket socket=new MulticastSocket(8379);
        //Join to the multicast group
        socket.joinGroup(address);
        while(true)
        {
            DatagramPacket packet=new DatagramPacket(inBuffer, inBuffer.length);
            socket.receive(packet);
            String msg=new String(inBuffer,0,packet.getLength());
            System.out.println("RECEIVED:"+msg);
        }

    }
}
