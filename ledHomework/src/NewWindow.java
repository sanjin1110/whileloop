import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame implements ActionListener {
    JLabel b;
    JButton back;
    public NewWindow(){
        setTitle("si");
        setBounds(300,200,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b= new JLabel("Simple Interest");
        b.setBounds(30,30,200,20);
        add(b);
        back = new JButton("back");
        back.addActionListener(this);
        back.setBounds(30,100,100,20);
        add(back);


        setLayout(null);
        setVisible(true);



    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(back)){
            new NewWindow().setVisible(false);
            new Login().setVisible(true);
            dispose();
        }

    }
    public static void main(String[] args) {
        new NewWindow();
    }
}
