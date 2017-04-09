package Awt_Swing;

public class Swing4_Dialogs{
    public static void main(String args[])
    {

    }
}

/*DIALOGS:-
1.JOptionPane can be used to create Dialogs
2.void showMessageDialog(Component Parent, Object msg, String title, int msgtype);
3.String s = (String) JOptionPane.showInputDialog(f,"You name");
4.int n=JOptionPane.showConfirmDialog(f,"Confirm on Exit", "Confirmation", JOptionPane.YES_NO_OPTION);
5.int n=JOptionPane.showOptionDialog(f,"Pay Option", "Pay Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
*/

/*
ActionListener
void actionPerformed(ActionEvent e)
//Called when an action occurs

MouseListener
void mouseClicked(MouseEvent e)
//Called when the mouse button has been clicked (pressed and released) on a
component.

void mouseEntered(MouseEvent e)
//Invoked when the mouse enters a component.

void mouseExited(MouseEvent e)
//Called when the mouse exits a component.

void mousePressed(MouseEvent e)
//Invoked when a mouse button has been pressed on a component.

void mouseReleased(MouseEvent e)
//Called when a mouse button has been released on a component.

Key//Invoked Listener
void keyPressed(KeyEvent e)
//Called when a key has been pressed.

void keyReleased(KeyEvent e)
//Called when a key has been released.

void keyTyped(KeyEvent e)
//Invoked when a key has been typed.

ItemListener
void itemStateChanged(ItemEvent e)
//Invoked when an item has been selected or deselected by the user.

TextListener
void textValueChanged(TextEvent e)
//Called when the value of the text has changed.

MouseWheelListener
void mouseWheelMoved(MouseWheelEvent e)
//Invoked when the mouse wheel is rotated.

WindowListener
void windowActivated(WindowEvent e)
//Invoked when the Window is set to be the active Window.

void windowClosed(WindowEvent e)
//Called when a window has been closed as the result of calling dispose on the
window.

void windowClosing(WindowEvent e)
//Called when the user attempts to close the window from the window's system
menu.

void windowDeactivated(WindowEvent e)
//Invoked when a Window is no longer the active Window.

void windowDeiconified(WindowEvent e)
//Invoked when a window is changed from a minimized to a normal state.

void windowIconified(WindowEvent e)
//Invoked when a window is changed from a normal to a minimized state.

void windowOpened(WindowEvent e)
//Called the first time a window is made visible.

AWT AND SWING 213
void windowActivated(WindowEvent e)
//Invoked when the Window is set to be the active Window.

void windowClosed(WindowEvent e)
//Called when a window has been closed as the result of calling dispose on the
window.

void windowClosing(WindowEvent e)
//Called when the user attempts to close the window from the window's system
menu.

void windowDeactivated(WindowEvent e)
//Invoked when a Window is no longer the active Window.

void windowDeiconified(WindowEvent e)
//Invoked when a window is changed from a minimized to a normal state.

void windowIconified(WindowEvent e)
//Invoked when a window is changed from a normal to a minimized state.

void windowOpened(WindowEvent e)
//Called the first time a window is made visible.
ComponentListener

void componentHidden(ComponentEvent e)
//Invoked when the component has been made invisible.

void componentMoved(ComponentEvent e)
//Called when the component's position changes.

void componentResized(ComponentEvent e)
//Invoked when the component's size changes.

void componentShown(ComponentEvent e)
//Invoked when the component has been made visible.

ContainerListener
void componentAdded(ContainerEvent e)
//Invoked when a component has been added to the container.

void componentRemoved(ContainerEvent e)
//Called when a component has been removed from the container.

AdjustmentListener
void adjustmentValueChanged(AdjustmentEvent e)
//Invoked when the value of the adjustable has changed.

FocusListener
void focusGained(FocusEvent e)
//Invoked when a component gains the keyboard focus.

void focusLost(FocusEvent e)
//Invoked when a component loses the keyboard focus.
 */