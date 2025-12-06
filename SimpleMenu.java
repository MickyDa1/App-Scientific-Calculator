import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SimpleMenu {
    public static void Main(){
        
        base.setUp("Simple Main Menu");

        base.frame.setVisible(true);

        JLabel mainMenuLabel = new JLabel("Which of the following would you like to use");
        mainMenuLabel.setBounds(86, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);

        JButton simpleAddingButton = new JButton("A + B");
        simpleAddingButton.setBounds(140, 100, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleAddingButton);

        JButton simpleSubtractButton = new JButton("A - B");
        simpleSubtractButton.setBounds(140, 150, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleSubtractButton);

        JButton simpleDivideButton = new JButton("A / B");
        simpleDivideButton.setBounds(140, 200, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleDivideButton);

        JButton simpleMultiplyButton = new JButton("A x B");
        simpleMultiplyButton.setBounds(140, 250, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleMultiplyButton);
    }
}
