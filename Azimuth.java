import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Azimuth {
    public static void main() {

        base.setUp("Azimuth");
        
        JLabel mm_headingLabel_2 = new JLabel("Please fill in the following boxes");
        mm_headingLabel_2.setBounds(86, 65, 300, 25);
        mm_headingLabel_2.setForeground(Color.black);
        base.frame.add(mm_headingLabel_2);

        // INPUT FOR X1
        JLabel startingX1Label = new JLabel("Starting X");
        startingX1Label.setBounds(86, 125, 300, 25);
        startingX1Label.setForeground(Color.black);
        base.frame.add(startingX1Label);

        JTextField startingX1 = new JTextField();
        startingX1.setBounds(170, 125, 150,25);
        base.frame.add(startingX1);

        //INPUT FOR Y1
        JLabel startingY1Label = new JLabel("Starting Y");
        startingY1Label.setBounds(86, 200, 300, 25);
        startingY1Label.setForeground(Color.black);
        base.frame.add(startingY1Label);
        
        JTextField startingY1 = new JTextField();
        startingY1.setBounds(170, 200, 150,25);
        base.frame.add(startingY1);

        //INPUT FOR X2
        JLabel TargetX2Label = new JLabel("Target X");
        TargetX2Label.setBounds(86, 275, 300, 25);
        TargetX2Label.setForeground(Color.black);
        base.frame.add(TargetX2Label);

        JTextField targetX2 = new JTextField();
        targetX2.setBounds(170, 275, 150,25);
        base.frame.add(targetX2);

        //INPUT FOR Y2
        JLabel TargetY2Label = new JLabel("Target Y");
        TargetY2Label.setBounds(86, 350, 300, 25);
        TargetY2Label.setForeground(Color.black);
        base.frame.add(TargetY2Label);

        JTextField targetY2 = new JTextField();
        targetY2.setBounds(170, 350, 150,25);
        base.frame.add(targetY2);

        //Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 140, 115, 25);
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                

                
                try{
                    //base.frame.setVisible(false);

                    double X1Value = Double.parseDouble(startingX1.getText());
                    double X2Value = Double.parseDouble(targetX2.getText());
                    double Y1Value = Double.parseDouble(startingY1.getText());
                    double Y2Value = Double.parseDouble(targetY2.getText());

                    BackendHardMaths.azimuth(X1Value, X2Value, Y1Value, Y2Value);
                } catch (IllegalArgumentException b){ // e was already in used by the actionPerformed
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
                
            }
        });
        
    }
}

// user enteres start as x1 and y1
// user enteres target as x2 and y2