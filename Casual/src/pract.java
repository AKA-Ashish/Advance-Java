import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class pract extends MouseAdapter {

    JFrame f;

    public pract(){

        f = new JFrame("Mouse ");

        f.addMouseListener(this);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);




    }

    public void mouseClicked (MouseEvent e){

        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
        
    }

    public static void main(String[] args) {
        new pract();
    }
    
}
