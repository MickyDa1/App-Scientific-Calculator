import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        
        
        base.setUp("home");
        
        JLabel mm_headingLabel_2 = new JLabel("Please Select One Of The Following");
        mm_headingLabel_2.setBounds(86, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        JButton simpleSumButton = new JButton("Simple Sums");
        simpleSumButton.setBounds(140, 100, 115, 25);
        base.frame.add(simpleSumButton);

        JButton MediumSumButton = new JButton("Medium Sums");
        MediumSumButton.setBounds(140, 120, 115, 25);
        base.frame.add(MediumSumButton);

        JButton hardSumButton = new JButton("Hard Sums");
        hardSumButton.setBounds(140, 140, 115, 25);
        base.frame.add(hardSumButton);
        
        
    }
}
