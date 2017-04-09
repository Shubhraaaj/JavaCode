package SocketProgram;

import java.net.*;

public class Net4_MultisocketServer
{
    public static void main(String args[])
    {
        try
        {
            //Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();
            //Fill the buffer with data
            String msg = "HELLO";
            byte[] out = msg.getBytes();
            //Multicast group where packers has to be sent
            InetAddress group = InetAddress.getByName("224.0.0.1");
            //Port the receiver listens to
            int port = 8379;
            //Create a Datagram with buffer, address and port
            DatagramPacket packet = new DatagramPacket(out, out.length, group, port);
            //Send to multicasr IP Address and Port
            System.out.println("SENDING A PACKET...");
            //Send the packet now
            socket.send(packet);

            System.out.println("SENT: "+msg);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
