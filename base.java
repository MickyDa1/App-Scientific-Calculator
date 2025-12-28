import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class base {
    static JFrame frame;

    public static void setUp(String pageName){

        JPanel rectangle = new JPanel();
        rectangle.setBackground(Color.white);
        rectangle.setBounds(20, 20, 345, 435);
        rectangle.setLayout(null);
        

        frame = new JFrame(pageName);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.blue);

        //frame.add(rectangle);

        frame.setVisible(true);
    }

    public static void result(String equationName, String total){    

        frame = new JFrame(equationName);
        frame.setSize(275,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.blue);


        JLabel totalLabel = new JLabel(total);
        totalLabel.setBounds(137, 32, 300, 25);
        totalLabel.setForeground(Color.black);
        base.frame.add(totalLabel);

        frame.setVisible(true);
    }
}
