import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleInterest extends JFrame implements ActionListener {
    JLabel principle,rate,time,result;
    JTextField ent1,ent2,ent3;
    JButton si;

    public SimpleInterest(){
        setTitle("SIMPLE INTEREST");
        setBounds(400,400,400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        principle = new JLabel("Principle :");
        principle.setBounds(30,30,120,20);
        add(principle);

        ent1 = new JTextField();
        ent1.setBounds(105,30,100,20);
        add(ent1);

        rate = new JLabel("Rate :");
        rate.setBounds(30,60,120,20);
        add(rate);

        ent2 = new JTextField();
        ent2.setBounds(105,60,100,20);
        add(ent2);

        time = new JLabel("Time :");
        time.setBounds(30,90,120,20);
        add(time);

        ent3 = new JTextField();
        ent3.setBounds(105,90,100,20);
        add(ent3);

        si = new JButton("SI");
        si.addActionListener(this);
        si.setBounds(30,120,80,20);
        add(si);

        result = new JLabel("result:");
        result.setBounds(30,150,60,20);
        add(result);






        setLayout(null);
        setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        float p = Float.parseFloat(ent1.getText());
        float t = Float.parseFloat(ent2.getText());
        float r = Float.parseFloat(ent3.getText());
        float re = 0;

        if (e.getSource().equals(si)){
            re = (p*t*r)/100;
            result.setText(String.valueOf(re));
        }

    }

    public static void main(String[] args) {

        SimpleInterest SimpleInterest = new SimpleInterest();
    }
}
