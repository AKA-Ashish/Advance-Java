package Loginpage;

import javax.swing.*;


import java.awt.event.*;

public class Login implements ActionListener{

    JTextField tfpw;
    JTextField tfuser;  //// textfield declaration which is global variable.
    JButton Login;       
    JFrame f;

    
    

    public Login()
    {
        f= new JFrame("Login");

        JLabel luser = new JLabel("Username");
        luser.setBounds(20,20,150,25); // Username
        f.add(luser);

        tfuser = new JTextField();
        tfuser.setBounds(180,20,150,25); // Textfield of username
        f.add(tfuser);

        JLabel lpw = new JLabel("Password");
        lpw.setBounds(20,55,150,25); // Password
        f.add(lpw);

        tfpw = new JTextField();
        tfpw.setBounds(180,55,150,25); // Textfield of Password
        f.add(tfpw);


        Login = new JButton("Login");
       
        Login.addActionListener(this);
        Login.setBounds(180,90,150,25); // For button
        f.add(Login);

        


        f.setSize(500,500);
        f.setLayout(null);    ///// For frame
        f.setVisible(true);
        

       
        
    }
    public static void main(String[] args) {
        new Login();
        }
 

        @Override
        public void actionPerformed(ActionEvent e) {  //factoryMethod(actionPerdormed)
            
            String luser = tfuser.getText();
            String lpw = tfpw.getText();
        
            if(luser.equals("admin")&& lpw.equals("admin")){
           
                JDialog d = new JDialog(f,"Login_succecssfull",true); //added New popup Frame.
                JLabel l = new JLabel("Login_Successfull");  //  added Label Text inside frame.
                l.setBounds(300,100,200,100);
                d.add(l);

                d.setLocationRelativeTo(d);
                d.setSize(600,400);
                d.setLayout(null);
                d.setVisible(true);
                
                System.out.println("Loged In");
    
            }
            else{
                System.out.println("Error");
            }
        }



    }




    
   
  

