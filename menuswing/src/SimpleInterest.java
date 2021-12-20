import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleInterest extends JFrame implements ActionListener {
    JLabel p,t,r;
    JButton si;
    JTextField e1,e2,e3;
    JMenuBar menubaer;
    JMenu back;

    public SimpleInterest(){
        setTitle("Simple Interest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,400,400,400);
        setLayout(null);
        p = new JLabel("Principle");
        p.setBounds(30,30,100,20);
        t = new JLabel("Time");
        t.setBounds(30,60,100,20);
        r = new JLabel("Rate");
        r.setBounds(30,90,100,20);

        e1 = new JTextField();
        e2 = new JTextField();
        e3 = new JTextField();
        e1.setBounds(100,30,100,20);
        e2.setBounds(100,60,100,20);
        e3.setBounds(100,90,100,20);

        si = new JButton("Simple Interest");
        si.setBounds(50,120,120,20);
        si.addActionListener(this);


        menubaer = new JMenuBar();
        add(menubaer);
        back = new JMenu("Back");
//        back.addActionListener(this);   no use in menu
        menubaer.add(back);


        add(si);
        add(p);
        add(t);
        add(r);
        add(e1);
        add(e2);
        add(e3);


        setJMenuBar(menubaer);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new MenuDemo().setVisible(true);
            }
        });
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float p = Float.parseFloat(e1.getText());
        float t = Float.parseFloat(e2.getText());
        float r = Float.parseFloat(e3.getText());
        if (e.getSource().equals(si)){
            r = (p*t*r)/100;
            JOptionPane.showMessageDialog(null,"SimpleInterest = "+r);
        }

    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
