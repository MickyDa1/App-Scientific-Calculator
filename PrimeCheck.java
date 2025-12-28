import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeCheck {
    public static void main() {

        base.setUp("Prime Check");
        
        JLabel mm_headingLabel_2 = new JLabel("Please fill in the following box");
        mm_headingLabel_2.setBounds(86, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        JLabel sortingNumberLabel = new JLabel("Enter Your Number Here -->");
        sortingNumberLabel.setBounds(86, 125, 300, 25);
        sortingNumberLabel.setForeground(Color.black);
        base.frame.add(sortingNumberLabel);

        JTextField Number = new JTextField();
        Number.setBounds(170, 125, 150,25);
        base.frame.add(Number);

        JButton viewButton = new JButton("Submit");
        viewButton.setBounds(140, 225, 115, 25);
        base.frame.add(viewButton);
        viewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numberValue = Integer.parseInt(Number.getText());
                BackendHardMaths.primeChecker(numberValue);
            }
        });
        

    }
}