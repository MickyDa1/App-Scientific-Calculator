import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MediumMenu {
    public static void Main(){
        
        base.setUp("Simple Menu");

        base.frame.setVisible(true);

        JLabel mainMenuLabel = new JLabel("Which of the following would you like to use");
        mainMenuLabel.setBounds(86, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);
        

        JButton keneticEnergyButton = new JButton("A + B");
        keneticEnergyButton.setBounds(140, 100, 115, 25); //place x, place y, 115, 25  
        base.frame.add(keneticEnergyButton);
        keneticEnergyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				KeneticEnergy.main();
            }
        });

        JButton simpleSubtractButton = new JButton("A - B");
        simpleSubtractButton.setBounds(140, 150, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleSubtractButton);
        simpleSubtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				SimpleSubtract.main();
            }
        });

        JButton simpleDivideButton = new JButton("A / B");
        simpleDivideButton.setBounds(140, 200, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleDivideButton);
        simpleDivideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				SimpleDivide.main();
            }
        });

        JButton simpleMultiplyButton = new JButton("A x B");
        simpleMultiplyButton.setBounds(140, 250, 115, 25); //place x, place y, 115, 25  
        base.frame.add(simpleMultiplyButton);
        simpleMultiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				SimpleMultiply.main();
            }
        });
    }
}
