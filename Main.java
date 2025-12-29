import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args){ //Used this to allow me to call "realone" using the home button
        realone();
    }
    public static void realone() {
        
        base.setUp("Main Menu");
        
        JLabel mainMenuLabel = new JLabel("Please Select One Of The Following:");
        mainMenuLabel.setBounds(86, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);

        JButton simpleSumButton = new JButton("Simple Sums");
        simpleSumButton.setBounds(140, 100, 115, 25);
        base.frame.add(simpleSumButton);
        simpleSumButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        SimpleMenu.Main();
            }
        });

        JButton MediumSumButton = new JButton("Medium Sums");
        MediumSumButton.setBounds(140, 175, 115, 25);
        base.frame.add(MediumSumButton);
        MediumSumButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        MediumMenu.Main();
            }
        });
      
        JButton HardSumButton = new JButton("Hard Sums");
        HardSumButton.setBounds(140, 250, 115, 25);
        base.frame.add(HardSumButton);
        HardSumButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				        HardMenu.main();
            }
        });
      
        
        
    }
}