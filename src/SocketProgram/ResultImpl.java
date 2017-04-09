package SocketProgram;

import java.io.Serializable;

/**
 * Created by shubh on 03-03-2017.
 */
public class ResultImpl implements Result,Serializable
{
    String output;
    double completionTime;

    public ResultImpl(String output, double completionTime) {
        this.output = output;
        this.completionTime = completionTime;
    }

    @Override
    public String output() {
        return output;
    }

    @Override
    public double completionTime() {
        return completionTime;
    }
}
