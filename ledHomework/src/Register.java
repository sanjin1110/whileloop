import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {

    JLabel firstname;
    JLabel lastname;
    JLabel email;
    JLabel password;
    JLabel phone;
    JLabel address;


    JButton register;

    public static JTextField ent1;
    JTextField ent2;
    JTextField ent3;
    JPasswordField ent4;
    JTextField ent5;
    JTextField ent6;
    JCheckBox show;

    public Register(){
        setBounds(600,600,600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Register");


        firstname = new JLabel("Firstname:");
        firstname.setBounds(30,30,100,20);
        add(firstname);

        ent1 = new JTextField();
        ent1.setBounds(30,60,100,20);
        add(ent1);

        lastname = new JLabel("Lastname:");
        lastname.setBounds(150,30,100,20);
        add(lastname);

        ent2 = new JTextField();
        ent2.setBounds(150,60,100,20);
        add(ent2);

        email = new JLabel("E-mail:");
        email.setBounds(30,90,100,20);
        add(email);

        ent3 = new JTextField();
        ent3.setBounds(30, 120,200,20);
        add(ent3);

        password = new JLabel("Password:");
        password.setBounds(30,150,100,20);
        add(password);

        show = new JCheckBox("Show Password");
        show.setBounds(170,180,150,20);
        show.addActionListener(this);
        add(show);

        ent4 = new JPasswordField();
        ent4.setEchoChar('*');
        ent4.setBounds(30,180,120,20);
        add(ent4);

        phone = new JLabel("Phone:");
        phone.setBounds(30,210,100,20);
        add(phone);

        ent5 = new JTextField();
        ent5.setBounds(30,240,120,20);
        add(ent5);

        address = new JLabel("Address:");
        address.setBounds(30,270,100,20);
        add(address);

        ent6 = new JTextField();
        ent6.setBounds(30,300,120,20);
        add(ent6);

        register = new JButton("Register");
        register.setBounds(50,330,100,20);
        register.addActionListener(this);
        add(register);


        setLayout(null);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(register)){
            String fname = ent1.getText();
            String lname = ent2.getText();
            String email = ent3.getText();
            String pass = ent4.getText();
            String phone = ent5.getText();
            String add = ent6.getText();

            JOptionPane.showMessageDialog(null, "Your details are "+"\n"
            +fname+"\n"+lname+"\n"+email+"\n"+pass+"\n"+phone+"\n"+add);
            dispose();
            new NewWindowOfRegister().setVisible(true);
        }



        if (e.getSource().equals(show))
        {
            if(show.isSelected()){
                ent4.setEchoChar((char)0);
            }
            else{
                ent4.setEchoChar('*');
            }
        }

    }

    public static void main(String[] args) {
        new Register();
    }
}
