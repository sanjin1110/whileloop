import javax.swing.*;
import java.awt.*;
public class Register extends JFrame{
    JLabel fname;
    JLabel lname;
    JLabel address;
    JLabel dob;
    JLabel email;
    JLabel password;
    JButton register;

    public Register() {

        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,500,500);
        setResizable(false);
        setLayout(null);
        fname = new JLabel("First Name : ");
        fname.setBounds(60,30,90,20);
        add(fname);
        lname = new JLabel("Last Name : ");
        lname.setBounds(60,60,90,20);
        add(lname);
        address = new JLabel("Address : ");
        address.setBounds(60,90,90,20);
        add(address);
        dob = new JLabel("Date of Birth : ");
        dob.setBounds(60,120,90,20);
        add(dob);
        email = new JLabel("E-mail : ");
        email.setBounds(60,150,90,20);
        add(email);
        password = new JLabel("Password : ");
        password.setBounds(60,180,90,20);
        add(password);




    }


    public static void main(String[] args) {
        new Register().setVisible(true);

    }
}
