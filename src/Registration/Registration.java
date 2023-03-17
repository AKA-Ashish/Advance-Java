/////// Crate a register form to store information of student (name, email and address ) And save button.///

package Registration;

import javax.swing.*;

public class Registration {

   

    public Registration(){
        

        JFrame f= new JFrame("Registration"); // Tittle



        JLabel luser = new JLabel("Name");
        luser.setBounds(20,20,150,25); // Name
        f.add(luser);

        JTextField tfuser = new JTextField();
        tfuser.setBounds(150,20,150,25); // Textfield of Name
        f.add(tfuser);




        JLabel lemail = new JLabel("Email");
        lemail.setBounds(20,55,150,25); // Email
        f.add(lemail);

        JTextField tfemail = new JTextField();
        tfemail.setBounds(150,55,150,25); // Textfield of Email
        f.add(tfemail);


        JLabel laddress = new JLabel("Address");
        laddress.setBounds(20,90,150,25); // Address
        f.add(laddress);

        JTextField tfaddress = new JTextField();
        tfaddress.setBounds(150,90,150,25); // Textfield of Address
        f.add(tfaddress);


        JLabel lnumber = new JLabel("Mobile No"); //Mobile no
        lnumber.setBounds(20,130,150,25); 
        f.add(lnumber);

        JTextField tfnumber = new JTextField();
        tfnumber.setBounds(150,130,150,25);  // Textfield of mobile no
        f.add(tfnumber);



        JLabel lpw = new JLabel("Password");
        lpw.setBounds(20,170,150,25); // Password
        f.add(lpw);

        JTextField tfpw = new JTextField();
        tfpw.setBounds(150,170,150,25); // Textfield of password
        f.add(tfpw);

        

        JButton Login = new JButton("Save");
        Login.setBounds(150,220,150,25); // For button
        f.add(Login);


        f.setSize(800,1000);
        f.setLayout(null);    ///// For frame
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new Registration();
    }

    
   


  
    







}


        


   
    
    

