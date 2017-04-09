package Awt_Swing;

//Event Handling in AWT and Swing

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

public class Awt3_Event extends Frame
{
    TextField t1=new TextField(),t2=new TextField();

    Awt3_Event()
    {
        setSize(150,80);
        setLayout(new FlowLayout());
        Button b1=new Button("COPY->");
        add(t1);
        add(b1);
        add(t2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText(t1.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String args[])
    {
        new Awt3_Event();
    }
}
