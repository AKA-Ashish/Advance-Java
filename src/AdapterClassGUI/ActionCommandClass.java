package AdapterClassGUI;

import javax.swing.*;

import java.awt.event.*;



public class ActionCommandClass implements ActionListener {
    JFrame f;
    JButton jb1;
    JButton jb2;

    public ActionCommandClass(){

        f = new JFrame("Action Command Class");

        jb1 = new JButton("First");
        jb1.setBounds(140,150,100,30);

        jb1.setActionCommand("1");
        jb1.addActionListener(this);


        jb2 = new JButton("Second");
        jb2.setBounds(140,200,100,30);
        
        jb2.setActionCommand("2");
        jb2.addActionListener(this);



        f.add(jb1);
        f.add(jb2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);




    }

    public static void main(String[] args) {
        new ActionCommandClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getActionCommand().equals("1")){
            System.out.println("Button 1 just Clicked");

        }else if (e.getActionCommand().equals("2")){
            System.out.println("Button 2 just Clicked");
        }
    }
}
