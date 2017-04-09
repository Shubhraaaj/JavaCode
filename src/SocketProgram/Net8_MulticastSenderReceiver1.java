package SocketProgram;

import java.io.*;
import java.net.*;

public class Net8_MulticastSenderReceiver1
{
    String name;
    InetAddress addr;
    int port=3456;
    MulticastSocket group;

    public static void main(String args[])throws Exception
    {
        new Net8_MulticastSenderReceiver2("SHUBHRAJ");
    }

    Net8_MulticastSenderReceiver1(String name) throws Exception {
        this.name = name;
        try {
            addr = InetAddress.getByName("224.0.0.1");
            group = new MulticastSocket(port);
            new Receiver().start();
            new Sender().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        private class Sender extends Thread
        {
            public void run()
            {
                try{
                    BufferedReader fromUser=new BufferedReader(new InputStreamReader(System.in));
                    while(true)
                    {
                        String msg=name+":"+fromUser.readLine();
                        byte[] out=msg.getBytes();
                        DatagramPacket pkt=new DatagramPacket(out,out.length,addr,port);
                        group.send(pkt);
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        private class Receiver extends Thread
        {
            public void run()
            {
                try
                {
                    byte[] in=new byte[256];
                    DatagramPacket pkt=new DatagramPacket(in,in.length);
                    group.joinGroup(addr);
                    while (true)
                    {
                        group.receive(pkt);
                        System.out.println(new String(pkt.getData(),0,pkt.getLength()));
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
    }
}
