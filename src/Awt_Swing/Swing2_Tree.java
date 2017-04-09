package Awt_Swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Swing2_Tree {
    public static void main(String args[]) {
        final JFrame f = new JFrame("JTree Demo");
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer"),
                c1 = new DefaultMutableTreeNode("HDD"),
                c2 = new DefaultMutableTreeNode("CPU"),
                c3 = new DefaultMutableTreeNode("Mouse");
        root.add(c1);
        root.add(c2);
        root.add(c3);
        c1.add(new DefaultMutableTreeNode("Seagate"));
        c1.add(new DefaultMutableTreeNode("Samsung"));
        c2.add(new DefaultMutableTreeNode("Intel"));
        c2.add(new DefaultMutableTreeNode("IBM"));
        c3.add(new DefaultMutableTreeNode("Dell"));
        c3.add(new DefaultMutableTreeNode("HP"));
        JTree t = new JTree(root);
        c.add(t);
        f.pack();
        f.setVisible(true);
    }
}

/*
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.File;
public class FSTreeDemo {
 public static void main(String[] args) {
JFrame f = new JFrame("FSTreeDemo");
f.setSize(300,300);
FSTreeModel model = new FSTreeModel(args[0]);
JTree tree = new JTree();
tree.setModel(model);
JScrollPane jsp = new JScrollPane(tree);
f.getContentPane().add(jsp);
    f.setVisible(true);
 }
}
class FSTreeModel implements TreeModel {
 File root;
 public FSTreeModel(String path) { this.root = new File(path); }
 public Object getRoot() { return root; }
 public Object getChild(Object p, int in) {
 String[] c = ((File)p).list();
 return (c == null) || (in >= c.length)?null:new File((File) p, c[in]);
 }
 public int getIndexOfChild(Object p, Object c) {
 String[] l = ((File)p).list();
 if (l == null) return -1;
 String name = ((File)c).getName();
 for(int i = 0; i < l.length; i++)
 if (name.equals(l[i])) return i;
 return -1;
 }
 public int getChildCount(Object p) {
 String[] c = ((File)p).list();
 return c != null? c.length:0;
 }
 public boolean isLeaf(Object node) { return ((File)node).isFile(); }
 public void addTreeModelListener(TreeModelListener l) {}
 public void removeTreeModelListener(TreeModelListener l) {}
 public void valueForPathChanged(TreePath path, Object newvalue) {}
}
 */
