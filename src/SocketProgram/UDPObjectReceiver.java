package SocketProgram;

import java.net.*;
import java.io.*;
public class UDPObjectReceiver
{
    public static void main(String[] args)
    {
        try
        {
            //Create a MulticastSocket and bind it to port 8379
            DatagramSocket socket = new DatagramSocket(8379);
            //Construct a DatagramPacket to receive packet
            byte[] in = new byte[256];
            DatagramPacket packet = new DatagramPacket(in, in.length);
            System.out.println("Waiting to receive a Message object...");
            //Receive the packet now and display
            socket.receive(packet);
            ByteArrayInputStream bais = new ByteArrayInputStream(in);
            ObjectInputStream ois = new ObjectInputStream(bais);
            Message msg = (Message)ois.readObject();
            System.out.println("Received a message:");
            System.out.println("subject : " +msg.getSubject()+"\nbody :"+msg.getText());
        }
        catch (Exception ioe)
        {
            System.out.println(ioe);
        }
    }
}
