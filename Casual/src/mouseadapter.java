import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class mouseadapter extends MouseAdapter{ 
    JFrame f;

    public mouseadapter(){

     f = new JFrame("Mouse adpater");

        f.addMouseListener(this);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);


    }

    public void mouseClicked (MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(),30 , 30);

        
    }

    public static void main(String[] args) {
        new mouseadapter();
    }
    
}
