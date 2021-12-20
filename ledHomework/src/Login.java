import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel email;
    JLabel password;
    JButton login;
    JTextField ent1;
    JPasswordField ent2;
    JCheckBox show;



    public Login(){
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Login");

        email = new JLabel("Username:");
        email.setBounds(30,30,100,20);
        add(email);

        ent1 = new JTextField();
        ent1.setBounds(100,30,100,20);
        add(ent1);

        password = new JLabel("Password:");
        password.setBounds(30,60,100,20);
        add(password);

        ent2 = new JPasswordField();
//        ent2.setEchoChar('*');
        ent2.setBounds(100,60,100,20);
        add(ent2);

        show = new JCheckBox("Show Password");
        show.setBounds(30,90,120,20);
        show.addActionListener(this);
        add(show);

        login = new JButton("LOGIN");
        login.addActionListener(this);
        login.setBounds(50,120,100,20);
        add(login);


        setLayout(null);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(login)){
            String username = ent1.getText();
            JOptionPane.showMessageDialog(null,"hello "+username);
            dispose();
            new NewWindowOfLogin().setVisible(true);




        }
        if (e.getSource().equals(show))
        {
            if(show.isSelected()){
                ent2.setEchoChar((char)0);
            }
            else{
                ent2.setEchoChar('*');
            }
        }
    }


    public static void main(String[] args) {

        Login login = new Login();
    }
}
