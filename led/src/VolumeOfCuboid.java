import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCuboid extends JFrame implements ActionListener {
    JLabel length,width,height,result;
    JTextField ent1,ent2,ent3;
    JButton si;

    public VolumeOfCuboid(){
        setTitle("VOLUME OF CUBOID");
        setBounds(400,400,400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        length = new JLabel("Length :");
        length.setBounds(30,30,120,20);
        add(length);

        ent1 = new JTextField();
        ent1.setBounds(105,30,100,20);
        add(ent1);

        width = new JLabel("Width :");
        width.setBounds(30,60,120,20);
        add(width);

        ent2 = new JTextField();
        ent2.setBounds(105,60,100,20);
        add(ent2);

        height = new JLabel("Height :");
        height.setBounds(30,90,120,20);
        add(height);

        ent3 = new JTextField();
        ent3.setBounds(105,90,100,20);
        add(ent3);

        si = new JButton("Volume");
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
        float l = Float.parseFloat(ent1.getText());
        float b = Float.parseFloat(ent2.getText());
        float h = Float.parseFloat(ent3.getText());
        float re = 0;

        if (e.getSource().equals(si)){
            re = l*b*h;
            result.setText(String.valueOf(re));
        }



    }

    public static void main(String[] args) {
        VolumeOfCuboid VolumeOfCuboid = new VolumeOfCuboid();
    }
}

