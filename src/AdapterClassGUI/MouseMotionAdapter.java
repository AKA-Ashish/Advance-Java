package AdapterClassGUI;
import java.awt.*;
import java.awt.event.*;


import javax.swing.JFrame;

public class MouseMotionAdapter implements MouseMotionListener {

    JFrame f;
    
    public MouseMotionAdapter(){

        f = new JFrame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);

        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500,500);

    }

    public static void main(String[] args) {
        new MouseMotionAdapter();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics graphics = f.getGraphics();
        
        graphics.setColor(Color.red);
        graphics.fillOval(e.getX(), e.getY(), 10,10);




    }

    @Override
    public void mouseMoved(MouseEvent e) {
     System.out.println("MOved");
        
      
    }
}

 

