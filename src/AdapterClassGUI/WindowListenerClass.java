package AdapterClassGUI;
// import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
// WindowAdapter is an abstract class for receiving window events.
public class WindowListenerClass implements WindowListener{

    JFrame f;

  public WindowListenerClass(){

     f = new JFrame("Window Adapter Class");

     f.addWindowListener(this);


    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);
    

  }




  public static void main(String[] args) {
    new WindowListenerClass();
  }





@Override
public void windowOpened(WindowEvent e) {
  System.out.println("Activate");
}


@Override
public void windowClosing(WindowEvent e) {
  
}


@Override
public void windowClosed(WindowEvent e) {
  
}



@Override
public void windowIconified(WindowEvent e) {
   
}



@Override
public void windowDeiconified(WindowEvent e) {
   
}



@Override
public void windowActivated(WindowEvent e) {
   
}


@Override
public void windowDeactivated(WindowEvent e) {
   
}




    
}
