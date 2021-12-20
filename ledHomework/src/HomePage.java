import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    JButton login;
    JButton register;
    JButton simple;

    public HomePage(){
        setTitle("HOMEPAGE");
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        login = new JButton("LOGIN");
        login.addActionListener(this);
        login.setBounds(60,60,100,20);
        add(login);

        register = new JButton("REGISTER");
        register.addActionListener(this);
        register.setBounds(60,100,100,20);
        add(register);

        simple = new JButton("SIMPLE INTEREST");
        simple.addActionListener(this);
        simple.setBounds(60,140,150,20);
        add(simple);



        setLayout(null);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(login)){
            dispose();
            new Login().setVisible(true);
        }
        if(e.getSource().equals(register)){
            dispose();
            new Register().setVisible(true);
        }
        if(e.getSource().equals(simple)){
            dispose();
            new SimpleInterest().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new HomePage();
    }
}

