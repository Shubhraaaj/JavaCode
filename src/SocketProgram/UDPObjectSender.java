package SocketProgram;

import java.net.*;
import java.io.*;

public class UDPObjectSender
{
    public static void main(String[] args)
    {
        try {
            //Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();
            //Create a Message object to be sent
            Message msg = new Message("Remainder","Return my book on Monday");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(msg);
            byte[] out = baos.toByteArray();
            //Muticast group where packet has to sent
            InetAddress group = InetAddress.getByName("localhost");
            //Port the receiver listens on
            int port = 8379;
            //Create a DatagramPacket with buffer, address and port
            DatagramPacket packet = new DatagramPacket(out, out.length,group, port);
            //Send the packet now
            socket.send(packet);
            System.out.println("Sent an object");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
