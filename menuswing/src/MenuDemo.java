import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuDemo extends JFrame {
    JMenuBar menubar;
    JMenu arithmeticoperation,area,si;
    JMenuItem sum,sub,mul,divide;
    JMenuItem triangle,circle,rectangle,square;


    public MenuDemo() {
        //for main window
        setTitle("Menu");
        setBounds(400, 400, 400, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.MAGENTA);


        setLayout(null);
        setVisible(true);


        //for menu bar
        menubar = new JMenuBar();
        add(menubar);
        //for menu
        arithmeticoperation = new JMenu("Arithmetic operation ");
        menubar.add(arithmeticoperation);

        area = new JMenu("Area");
        si = new JMenu("Simple interest");

        menubar.add(area);
        menubar.add(si);


        //for menu item
        sum = new JMenuItem("Addition");
        sub = new JMenuItem("Subtraction");
        mul = new JMenuItem("Multiplication");
        divide = new JMenuItem("Division");
        triangle = new JMenuItem("Triangle");
        circle = new JMenuItem("Circle");
        rectangle = new JMenuItem("Rectangle");
        square = new JMenuItem("Square");

        arithmeticoperation.add(sum);
        arithmeticoperation.add(sub);
        arithmeticoperation.add(mul);
        arithmeticoperation.add(divide);
        area.add(rectangle);
        area.add(circle);
        area.add(square);
        area.add(triangle);


        setJMenuBar(menubar);
        si.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new SimpleInterest().setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        new MenuDemo().setVisible(true);
    }
}
