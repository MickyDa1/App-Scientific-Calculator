import java.awt.Color;
import javax.swing.JFrame;
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
}
