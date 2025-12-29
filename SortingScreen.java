import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SortingScreen {
    public static void main() {

        base.setUp("Sorting");
        base.homeButtom();
        
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

        //Submit Button
        JButton addButton = new JButton("add");
        addButton.setBounds(140, 150, 115, 25);
        base.frame.add(addButton);
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    Double numberValue = Double.parseDouble(Number.getText());
                    SortingLogic.sorting(1,numberValue);
                } catch (IllegalArgumentException b) {
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
                
            }
        });

        JButton viewButton = new JButton("Submit");
        viewButton.setBounds(140, 225, 115, 25);
        base.frame.add(viewButton);
        viewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Double numberValue = 0.0;
                SortingLogic.sorting(2, numberValue);
            }
        });
        

    }
}