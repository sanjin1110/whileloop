package View;

import LogicOfArithemetic.Arithmetic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        int num1 = sc.nextInt();
        System.out.println("enter num2:");
        int num2 = sc.nextInt();

        Arithmetic arithmetic = new Arithmetic(num1,num2);
        System.out.println(arithmetic.add());
    }

    public static class UI extends JFrame implements ActionListener {
        JLabel label1,label2;
        JTextField entry1,entry2;
        JButton sum,close;

        public UI(){
            setBounds(100,300,400,300);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            label1 = new JLabel("Enter first num:");
            label1.setBounds(20,20,150,30);
            add(label1);
            label2 = new JLabel("Enter second num:");
            label2.setBounds(20,50,150,30);
            add(label2);
            entry1 = new JTextField();
            entry1.setBounds(180,20,150,30);
            add(entry1);
            entry2 = new JTextField();
            entry2.setBounds(180,50,150,30);
            add(entry2);
            sum = new JButton("Add");
            sum.setBounds(20,90,150,30);
            sum.addActionListener(this);
            add(sum);
            close = new JButton("Close");
            close.setBounds(180,90,150,30);
            close.addActionListener(this);
            add(close);

            setVisible(true);


        }





        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(sum)){
                int n1 = Integer.parseInt(entry1.getText());
                int n2 = Integer.parseInt(entry2.getText());
                Arithmetic arithmetic = new Arithmetic(n1,n2);
                JOptionPane.showMessageDialog(null,"Sum ="+arithmetic.add());

            }
            if (e.getSource().equals(close)){
                dispose();
            }


        }

        public static void main(String[] args) {
            Arithmetic arithmetic = new Arithmetic(2,3);
            new UI();
        }
    }
}
