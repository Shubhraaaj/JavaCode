package SocketProgram;

import java.io.Serializable;

public class Job implements Executable,Serializable
{
    @Override
    public String execute() {
        int prod=1;
        for(int i=2;i<=5;i++)
            prod*=i;
        return (new Integer(prod)).toString();
    }
}