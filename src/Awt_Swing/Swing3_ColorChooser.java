package Awt_Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Swing3_ColorChooser
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("JColorChooser Demo");
        Container c = f.getContentPane();
        f.setSize(650,400);
        f.setLayout(new FlowLayout());
        final JLabel banner = new JLabel("Sample Text",JLabel.CENTER);
        final JColorChooser cc = new JColorChooser(Color.black);
        cc.getSelectionModel().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Color newColor = cc.getColor();
                banner.setForeground(newColor);
            }
        });
        c.add(banner);
        c.add(cc, BorderLayout.PAGE_END);
        f.setVisible(true);
    }
}
