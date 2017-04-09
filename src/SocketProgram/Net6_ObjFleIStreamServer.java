package SocketProgram;

import java.io.*;
import java.net.*;

public class Net6_ObjFleIStreamServer
{
    public static void main(String args[]) throws Exception
    {
        //Create a Server Socket at Port 6789
        ServerSocket serverSocket=new ServerSocket(6789);
        //Wait for Incoming Signal
        System.out.println("SERVER IS LISTENING TO 6789");
        Socket socket=serverSocket.accept();
        System.out.println("REQUEST ACCEPTED");

        ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
        String classFile=(String) in.readObject();
        byte[] b=(byte[]) in.readObject();

        FileOutputStream fos=new FileOutputStream(classFile);
        fos.write(b);

        Executable ex=(Executable) in.readObject();
        System.out.println("STARTING EXECUTION");

        double startTime=System.nanoTime();
        String output=ex.execute();
        double endTime=System.nanoTime();
        double completionTime=endTime-startTime;
        System.out.println("DONE");

        ResultImpl r=new ResultImpl(output,completionTime);

        ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
        classFile="ResultImpl.class";
        out.writeObject(classFile);

        FileInputStream fis=new FileInputStream(classFile);
        byte[] bo=new byte[fis.available()];
        fis.read(bo);
        out.writeObject(bo);
        out.writeObject(r);

        System.out.println("RESULT SENT");
        socket.close();
    }
}
