import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class HardMenu {
    public static void main() {

        base.setUp("Hard Main Menu");
        
        JLabel mm_headingLabel_2 = new JLabel("Please Select One Of The Following");
        mm_headingLabel_2.setBounds(86, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        JButton azimuthButton = new JButton("Azimuth");
        azimuthButton.setBounds(140, 100, 115, 25);
        base.frame.add(azimuthButton);
        azimuthButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                base.frame.setVisible(false);
                Azimuth.main();
            }
        });

        JButton FactorialButton = new JButton("Factorial");
        FactorialButton.setBounds(140, 175, 115, 25);
        base.frame.add(FactorialButton);
        FactorialButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                base.frame.setVisible(false);
                Factorial.main();
            }
        });

        JButton SortingButton = new JButton("Sorting");
        SortingButton.setBounds(140, 250, 115, 25);
        base.frame.add(SortingButton);
        SortingButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                base.frame.setVisible(false);
                SortingScreen.main();
            }
        });
        
        
    }
}
