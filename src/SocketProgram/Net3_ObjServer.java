package SocketProgram;

import java.io.*;
import java.net.*;

public class Net3_ObjServer
{
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        //Create a Server Socket at Port 6789
        ServerSocket serverSocket=new ServerSocket(6789);
        //Waiting for Connection
        System.out.println("SERVER LISTENING AT 6789");
        Socket socket=serverSocket.accept();
        System.out.println("REQUEST ACCEPTED");
        //Create an ObjectInputStream Object
        ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
        //Restore the Object
        Message msg=(Message)in.readObject();
        //Print the Message
        System.out.println("RECEIVED THE MESSAGE");
        System.out.println("SUBJECT:"+msg.getSubject()+"\nBODY:"+msg.getText());
    }
}
