import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Weight {
    public static void main() {
        base.setUp("Weight");

        JLabel headingLabel = new JLabel("Please Fill In The Following Boxes:");
        headingLabel.setBounds(86, 65, 300, 25);
        headingLabel.setForeground(Color.black);
        base.frame.add(headingLabel);

		JLabel inputALabel = new JLabel("Number for Mass(kg): ");
		inputALabel.setBounds(50, 125, 200, 25);
		inputALabel.setForeground(Color.black);
		base.frame.add(inputALabel);
		
		JTextField mass = new JTextField();
		mass.setBounds(170, 125, 150, 25);
	    base.frame.add(mass);

        JLabel inputBLabel = new JLabel("Number for Gravitational Field Strength(N/kg): ");
		inputBLabel.setBounds(50, 200, 200, 25);
		inputBLabel.setForeground(Color.black);
		base.frame.add(inputBLabel);
		
		JTextField GFS = new JTextField(); 
		GFS.setBounds(170, 200, 150, 25);
	    base.frame.add(GFS);
        //Calls Image

        //Calls Appropriate Maths Function!!
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 300, 115, 25); //place x, place y, 115, 25  
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double massValue = Double.parseDouble(mass.getText());
                    double GFSValue = Double.parseDouble(GFS.getText());
                    BackendMediumMaths.weight(massValue, GFSValue);
                } catch (IllegalArgumentException b) {
                    //base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
            }
        });
    }
}