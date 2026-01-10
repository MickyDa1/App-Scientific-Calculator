import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeCheck {
    public static void main() {

        base.setUp("Prime Check");
        base.homeButton();
        
        JLabel mm_headingLabel_2 = new JLabel("Please fill in the following box");
        mm_headingLabel_2.setBounds(106, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        JLabel sortingNumberLabel = new JLabel("Enter Your Number Here");
        sortingNumberLabel.setBounds(120, 125, 200, 25);
        sortingNumberLabel.setForeground(Color.black);
        base.frame.add(sortingNumberLabel);

        JTextField Number = new JTextField();
        Number.setBounds(120, 145, 150, 25);
        base.frame.add(Number);

        JButton viewButton = new JButton("Submit");
        viewButton.setBounds(140, 225, 115, 25);
        base.frame.add(viewButton);
        viewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int numberValue = Integer.parseInt(Number.getText());
                    BackendHardMaths.primeChecker(numberValue);
                } catch (IllegalArgumentException b) {
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
            }
        });
        
        base.rectangle();
    }
}