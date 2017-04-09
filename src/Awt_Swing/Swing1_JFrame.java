package Awt_Swing;

import javax.swing.*;
import java.awt.*;

public class Swing1_JFrame
{
    public static void main(String args[])
    {
        JFrame jFrame=new JFrame("Java Swing");
        Container container=jFrame.getContentPane();
        jFrame.setSize(200,80);
        container.setLayout(new FlowLayout());
        container.add(new JLabel("NAME:"));
        container.add(new JTextField(10));
        jFrame.setVisible(true);
    }
}

/*
The Content Pane of a JFrame is obtained using its getContentPane() method
Container container=frame.getContentPane();
 */

/*JPasswordField
final JPasswordField pf=new JPasswordField(10);
container.add(pf);
pf.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        String pw=nw String(pf.getPassword());
        JOptionPane.showMessageDialog(f,"Password is:"+pw);
    }
});
jFrame.setVisible(true);
 */

/*JTable
JTable table=new JTable(row,column);
table.setValue(value, row_no,col_no);
 */

/* JComboBox
final JComboBox comboBox=new JComboBox(list);
 */

/*JProgressBar
JProgressBar pb=new JProgressBar(0,100);
pb.setStringPainted(true);
for(int i=1;i<=100;i++)
{
    pb.setValue(i);
    Thread.sleep(100);
}

//To set an Ongoing task ProgressBar:- setIndeterminate(true);
 */

