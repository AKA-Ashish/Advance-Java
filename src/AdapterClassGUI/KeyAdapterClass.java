package AdapterClassGUI;

import javax.swing.JFrame;

// import java.awt.*;
import java.awt.event.*;


public class KeyAdapterClass implements KeyListener{

    JFrame f;

    public KeyAdapterClass(){

        f = new JFrame("Key Adapter ");

        f.addKeyListener(this);



        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new KeyAdapterClass();
    }

    //Invoked after Press and Release.
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode() + " : Key Pressed");
    }
    //Invoke after Key is pressed.
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar() + " : Key Released");

    }
    //Invoke after key is Released/
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar() + " : Key Typed");
    }
    
}
