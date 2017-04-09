package SocketProgram;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

class Message implements Serializable
{
    String subject, text;

    public Message(String subject, String text) {
        this.subject = subject;
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}

public class Net3_ObjClient
{
    public static void main(String args[]) throws IOException {
        String fact;
        //Create a Socket to the
        Socket socket=new Socket("localhost",6789);
        System.out.println("CONNECTED TO 6789");
        //Create a Message of the Object to be Sent
        Message msg=new Message("Reminder","Buy Sweets");
        //Create an ObjectOutputStream Object
        ObjectOutputStream oss=new ObjectOutputStream(socket.getOutputStream());
        //Serializable and Send over TCP
        oss.writeObject(msg);
        System.out.println("SENT AN OBJECT");
        socket.close();
    }
}
