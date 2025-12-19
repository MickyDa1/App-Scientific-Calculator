import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Factorial {
    public static void main() {

        base.setUp("Factorial");
        
        JLabel mm_headingLabel_2 = new JLabel("Please fill in the following box");
        mm_headingLabel_2.setBounds(86, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        JLabel factorialNumberLabel = new JLabel("Enter Your Number Here -->");
        factorialNumberLabel.setBounds(86, 125, 300, 25);
        factorialNumberLabel.setForeground(Color.black);
        base.frame.add(factorialNumberLabel);

        JTextField factorialNumber = new JTextField();
        factorialNumber.setBounds(170, 125, 150,25);
        base.frame.add(factorialNumber);

        //Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 150, 115, 25);
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int number = Integer.parseInt(factorialNumber.getText());

                // had to be put here so i can retrive the result
                int actualTotal = BackendHardMaths.factorial(number);

                String total = String.valueOf(actualTotal);
                base.result("Factorial", total);

            }
        });
        
    }
}