package Loginpage;
import javax.swing.*;

public class Login {

    
    // public static void main(String[] args) {
    //     new Login();
    // }

    public Login()
    {
        JFrame f= new JFrame("Login");

        JLabel luser = new JLabel("Username");
        luser.setBounds(20,20,150,25); // Username
        f.add(luser);

        JTextField tfuser = new JTextField();
        tfuser.setBounds(180,20,150,25); // Textfield of username
        f.add(tfuser);

        JLabel lpw = new JLabel("Password");
        lpw.setBounds(20,55,150,25); // Password
        f.add(lpw);

        JTextField tfpw = new JTextField();
        tfpw.setBounds(180,55,150,25); // Textfield of Password
        f.add(tfpw);


        JButton Login = new JButton("Login");
        Login.setBounds(180,90,150,25); // For button
        f.add(Login);


        f.setSize(500,500);
        f.setLayout(null);    ///// For frame
        f.setVisible(true);

        
    }
    public static void main(String[] args) {
        new Login();
        }
    }
  

