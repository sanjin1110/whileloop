import javax.swing.*;
import java.awt.*;

public class AnotherOne extends JFrame {
    JLabel labelEmail;
    JLabel labelName;
    JButton buttonLogin;
    public AnotherOne(){
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,300,300);
        setForeground(Color.RED);
        setResizable(false);


        //for welcome
        labelEmail = new JLabel("Email : ");
        labelEmail.setForeground(Color.green);
//        labelEmail.setBackground(Color.BLACK);
        labelEmail.setFont(new Font("Arial",Font.BOLD,20));
        labelEmail.setBounds(10,50,100,25);
        add(labelEmail);
        labelName = new JLabel("Password : ");
        labelName.setForeground(Color.green);
//        labelName.setBackground(Color.BLACK);
        labelName.setFont(new Font("Arial",Font.BOLD,20));
        labelName.setBounds(50,100,100,20);
        add(labelName);
        buttonLogin = new JButton("Login");
        buttonLogin.setBackground(Color.BLUE);
        buttonLogin.setForeground(Color.yellow);
        buttonLogin.setBounds(50,150,100,20);
//
//        add(buttonLogin);







    }

    public static void main(String[] args) {
        new AnotherOne().setVisible(true);
    }
}
