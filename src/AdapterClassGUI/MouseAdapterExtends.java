package AdapterClassGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseAdapterExtends implements MouseListener{

    JFrame f;

    public MouseAdapterExtends()
    {

        f = new JFrame("Mouse Adapter Class");

        f.addMouseListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new MouseAdapterClass();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //Create a Graphics Object.
        Graphics graphics = f.getGraphics();
        //Adding color inside object.
        graphics.setColor(Color.orange);
        graphics.fillOval(e.getX(),e.getY(), 30, 30);

    }
    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
     
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    

}
