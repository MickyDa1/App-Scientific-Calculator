import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        
        base.setUp("Main Menu");
        
        JLabel mainMenuLabel = new JLabel("Please Select One Of The Following:");
        mainMenuLabel.setBounds(86, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);

        JButton MediumSumButton = new JButton("Medium Sums");
        MediumSumButton.setBounds(140, 120, 115, 25);
        base.frame.add(MediumSumButton);
        MediumSumButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        MediumMenu.Main();
            }
        });
      
        
        
    }
}