import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        
        if (total.length() > 178){
            JOptionPane.showMessageDialog(frame, "Thats too long", equationName, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, total, equationName, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void empty(String pageName){
        JPanel rectangle = new JPanel();
        rectangle.setBackground(Color.white);
        rectangle.setBounds(20, 20, 345, 435);
        rectangle.setLayout(null);
        

        frame = new JFrame(pageName);
        frame.setSize(400, 500);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.blue);

        frame.setVisible(true);
    }

    public static boolean check() {
        int result = JOptionPane.showConfirmDialog(
            null,
            "Are you sure?",
            "Confirm",
            JOptionPane.OK_OPTION
        );
        return result == JOptionPane.YES_OPTION;
    }

    public static void mistake(String title, String message){
        JOptionPane.showMessageDialog(frame, message, title, JOptionPane.ERROR_MESSAGE);
    }    

    public static void homeButton(){
        JButton homeButton = new JButton("home");
        homeButton.setBounds(10, 10, 115, 25);
        base.frame.add(homeButton);
        homeButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				Main.realone();
            }
        });
    }
    
    public static void rectangle(){
        JPanel rectangle = new JPanel();
        rectangle.setBackground(Color.white);
        rectangle.setBounds(20, 20, 345, 435);
        rectangle.setLayout(null);

        base.frame.add(rectangle);
    }

}