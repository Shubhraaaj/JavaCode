package SocketProgram;

import java.util.Random;
import java.io.*;
import java.net.*;

public class Net5_ScoreSender
{
    public static void main(String args[])throws Exception
    {
        long score=0,run;
        Random r=new Random();
        int port=8379;
        InetAddress group=InetAddress.getByName("localhost");
        //Create a DatagramSocket
        DatagramSocket socket=new DatagramSocket();
        while(true)
        {
            //Fill the buffer with score generated artificially
            do
            {
                Thread.sleep(1000+r.nextInt(1000));
            }while((run=r.nextInt(7))==0);
            score+=run;
            String msg="SCORE:"+score;
            byte[] out=msg.getBytes();
            //Create a DatagramPacket
            DatagramPacket pkt=new DatagramPacket(out,out.length,group,port);
            socket.send(pkt);
            System.out.println("SENT->"+msg);
        }
    }
}
