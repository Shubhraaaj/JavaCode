package Awt_Swing;

//Addition of Java Panels

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Awt2_Panels  implements AdjustmentListener
{
    JLabel jLabel=new JLabel();
    static Scrollbar scrollbarHorizontal=new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300);
    static Scrollbar scrollbarVertical=new Scrollbar(Scrollbar.VERTICAL, 0, 30, 0, 300);
    public static void main(String args[])
    {
        JFrame jFrame=new JFrame("Calculator");
        jFrame.setSize(200,300);

        //JPanel Set ups
        JPanel jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(5,3));
        String s[]={"0","+","-","/","*","="};
        for(int i=1;i<=9;i++)
            jPanel.add(new Button(i+""));
        for(int i=0;i<s.length;i++)
            jPanel.add(new Button(s[i]+""));
        jFrame.add(new TextField(15),BorderLayout.NORTH);
        jFrame.add(jPanel,BorderLayout.CENTER);
        jFrame.add(scrollbarHorizontal, BorderLayout.SOUTH);
        jFrame.add(scrollbarVertical, BorderLayout.EAST);
        jFrame.setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        jLabel.setText("HORIZONTAL:"+scrollbarHorizontal+"  VERTICAL:"+scrollbarVertical);
    }
}

//TextArea:- frame.add(new TextArea("Enter Text Here,3,20);
//List:- List lst=new List(4,false); lst.add(elements);
//CheckBox:- frame.add(new CheckBox("Yes",null,true);
//CheckBox Group:- frame.add(new CheckBox("one",cbg,false));
//Choice:- Choice colors=new Choice(); colors.add("Red");

