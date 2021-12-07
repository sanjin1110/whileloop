import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowOfLogin extends JFrame implements ActionListener {

    JLabel te;

    public NewWindowOfLogin(){
        setTitle("hello");
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        te = new JLabel("Hello World");
        te.setBounds(30,30,100,20);
        add(te);

        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new NewWindowOfLogin();
    }
}
