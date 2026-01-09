import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HydrostaticPressure {
    public static void main(){
        base.setUp("Hydrostatic Pressure");
        base.homeButtom();

        JLabel headingLabel = new JLabel("Please Fill In The Following Boxes:");
        headingLabel.setBounds(86, 65, 300, 25);
        headingLabel.setForeground(Color.black);
        base.frame.add(headingLabel);

		JLabel inputALabel = new JLabel("Number for Height(m): ");
		inputALabel.setBounds(125, 125, 200, 25);
		inputALabel.setForeground(Color.black);
		base.frame.add(inputALabel);
		
		JTextField height = new JTextField();
		height.setBounds(120, 145, 150, 25);
	    base.frame.add(height);
        
        JLabel inputBLabel = new JLabel("Number for Density(kg/m^3): ");
		inputBLabel.setBounds(115, 200, 200, 25);
		inputBLabel.setForeground(Color.black);
		base.frame.add(inputBLabel);
		
		JTextField density = new JTextField(); 
		density.setBounds(120, 220, 150, 25);
	    base.frame.add(density);
        
        JLabel inputCLabel = new JLabel("Gravitational Field Strength(N/kg)"); //gfs = Gravitational Field Strength
        inputCLabel.setBounds(100, 275, 200, 25);
        inputCLabel.setForeground(Color.black);
        base.frame.add(inputCLabel);

        JTextField gfs = new JTextField(); 
		gfs.setBounds(120, 295, 150, 25);
	    base.frame.add(gfs);

        //Calls Appropriate Maths Function!!
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 350, 115, 25); //place x, place y, 115, 25  
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double heightValue = Double.parseDouble(height.getText());
                    double densityValue = Double.parseDouble(density.getText());
                    double gfsValue = Double.parseDouble(gfs.getText());
                    
                    BackendMediumMaths.hydrostaticPressure(heightValue, densityValue, gfsValue);
                } catch (IllegalArgumentException b) {
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
            }
        });

        base.rectangle();
    }
}