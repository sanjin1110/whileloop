import javax.swing.*;
import java.awt.*;
//import java.io.IOException;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HelloWorld {
    public static void main(String[] args){

        JFrame frame;
        JLabel label;
        JLabel labelpw;
        JButton logBut;

        frame = new JFrame();
        label = new JLabel("Email : ");
        label.setBounds(60,40,200,40);
        label.setForeground(Color.green);
        label.setFont(new Font("Arial",Font.BOLD,20));
        labelpw = new JLabel("Password : ");
        labelpw.setBounds(60,70,200,40);
        labelpw.setFont(new Font("Arial",Font.BOLD,20));
        labelpw.setForeground(Color.green);
        logBut = new JButton("Login");
        logBut.setForeground(Color.white);
        logBut.setBackground(Color.BLUE);
        logBut.setBounds(70,120,90,20);
        logBut.setFont(new Font("Arial",Font.BOLD,10));
//        email = new JarEntry("");
//        email.setSize(20);


        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Login");
        frame.add(label);
        frame.add(labelpw);
        frame.add(logBut);
//        frame.add(email);
//        frame.setSize(300,300);
        frame.setBounds(300,300,300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
