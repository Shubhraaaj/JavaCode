package JavaMail;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MailClient
{
    public static void main(String args[]) throws Exception
    {
        int port = Integer.parseInt(args[1]);
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket(args[0], port);
        if(clientSocket == null)
            System.out.println("Error");
        else
        {
            System.out.println("Connected to Server "+args[0]+" at Port "+port);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String[] out = { "HELLO: thinkpad\n",
                                "mail from: <u_roy@it.jusl.ac.in>\n",
                                "rcpt to: <u_roy@it.jusl.ac.in>\n",
                                "data\n",
                                "This is a sample mail\n.\n",
                                "quit\n"};
            try
            {
                System.out.println("From Server: "+inFromServer.readLine());
                for(int i=0;i<out.length;i++)
                {
                    outToServer.writeBytes(out[i]);
                    System.out.println("To Server: "+out[i]);
                    System.out.println("From Server:"+inFromServer.readLine());
                }
            }
            catch (Exception e)
            {
                clientSocket.close();
            }
        }
    }
}
