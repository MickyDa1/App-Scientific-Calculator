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
        
        JButton simpleSumButton = new JButton("Simple Sums");
        simpleSumButton.setBounds(140, 100, 115, 25); //place x, place y, height, width
        base.frame.add(simpleSumButton);
<<<<<<< HEAD


=======
        simpleSumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        SimpleMenu.Main();
            }
        });
  
>>>>>>> dd879edb07a14520136479a4a4c08dc69aee2ffa
        JButton MediumSumButton = new JButton("Medium Sums");
        MediumSumButton.setBounds(140, 120, 115, 25);
        base.frame.add(MediumSumButton);
        MediumSumButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        MedioumMenu.Main();
            }
        });
      
        
        
    }
}
