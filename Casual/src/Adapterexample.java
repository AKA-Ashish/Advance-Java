import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Adapterexample {
    JFrame f;

    public Adapterexample(){

        f = new JFrame("Windowing Adapter");

        f.addWindowListener(new WindowAdapter() {

            public void windowClosing (WindowEvent e){
                f.dispose();
            }
            


        });
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);


    }

    public static void main(String[] args) {
        
        new Adapterexample();
    }
    
}
