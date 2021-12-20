import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowOfLogin extends JFrame implements ActionListener {

    JLabel te;
    JButton back;

    public NewWindowOfLogin(){
        setTitle("hello");
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        te = new JLabel("Hello World");
        te.setBounds(30,30,100,20);
        add(te);

        back = new JButton("Back");
        back.setBounds(30,300,80,20);
        back.addActionListener(this);
        add(back);

        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(back)){
            new NewWindowOfLogin().setVisible(false);
            new Login().setVisible(true);
            dispose();
        }

    }

    public static void main(String[] args) {
        new NewWindowOfLogin();
    }
}

