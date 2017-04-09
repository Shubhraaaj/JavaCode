package SocketProgram;

import java.io.*;
import java.net.*;

public class Net6_ObjFleIStreamClient
{
    public static void main(String args[]) throws Exception
    {
        //create a socket to the server
        Socket socket = new Socket("localhost", 6789);
        System.out.println("CONNECTED TO LOCALHOST 6789");

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        String classFile = "Job.class";
        out.writeObject(classFile);

        FileInputStream fis = new FileInputStream(classFile);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        out.writeObject(b);

        Job aJob = new Job();
        out.writeObject(aJob);
        System.out.println("SUBMITTED A JOB FOR EXECUTION");

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        classFile = (String)in.readObject();
        b = (byte[])in.readObject();

        FileOutputStream fos = new FileOutputStream(classFile);
        fos.write(b);

        Result r = (Result)in.readObject();

        System.out.println("RESULT = "+r.output()+"\nTIME TAKEN = "+r.completionTime());
        socket.close();
    }
}