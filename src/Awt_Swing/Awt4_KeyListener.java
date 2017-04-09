package Awt_Swing;

//Adapter Class is used when we don't want to implement all the Functions of a Listener Class

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Awt4_KeyListener extends Frame {

    TextField t = new TextField(15);

    Awt4_KeyListener()
    {
        setSize(180,80);
        setLayout(new FlowLayout());
        add(t);
        t.addKeyListener(new CaseChanger());
        setVisible(true);
    }

    class CaseChanger extends KeyAdapter
    {
        public void keyReleased(KeyEvent e)
        {
            if(e.getSource() instanceof TextField)
            {
                TextField t=(TextField)e.getSource();
                int cp=t.getCaretPosition();
                t.setText(t.getText().toUpperCase());
                t.setCaretPosition(cp);
            }
        }
    }

    public static void main(String args[])
    {
        new Awt4_KeyListener();
    }
}
