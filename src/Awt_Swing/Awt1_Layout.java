package Awt_Swing;

//Java Program to add Frame elements

import javax.swing.*;
import java.awt.*;

public class Awt1_Layout
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setSize(500,400);
        f.setLayout(new FlowLayout());
        Label label=new Label("Hello Sir");
        f.add(label);
        Button button=new Button("Exit");
        f.add(button);
        f.setVisible(true);
        f.setTitle("FRAME!");
    }
}

//Grid Layout:- f.setLayout(new GridLayout(1,2));

/*BorderLayour:- f.setLayout(new BorderLayout());
f.add(new Button("North"), BorderLayout.NORTH);*/

