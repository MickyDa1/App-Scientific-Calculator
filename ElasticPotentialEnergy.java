import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ElasticPotentialEnergy {
    public static void main() {
        base.setUp("Elastic Potential Energy");
        base.homeButtom();
        JLabel headingLabel = new JLabel("Please Fill In The Following Boxes:");
        headingLabel.setBounds(86, 65, 300, 25);
        headingLabel.setForeground(Color.black);
        base.frame.add(headingLabel);

		JLabel inputALabel = new JLabel("Number for Spring Constant(N/m):");
		inputALabel.setBounds(89, 125, 205, 25);
		inputALabel.setForeground(Color.black);
		base.frame.add(inputALabel);
		
		JTextField springConstant = new JTextField();
		springConstant.setBounds(115, 155, 150, 25);
	    base.frame.add(springConstant);

        JLabel inputBLabel = new JLabel("Number for Extension(m): ");
		inputBLabel.setBounds(115, 200, 200, 25);
		inputBLabel.setForeground(Color.black);
		base.frame.add(inputBLabel);
		
		JTextField Extenstion = new JTextField(); 
		Extenstion.setBounds(115, 230, 150, 25);
	    base.frame.add(Extenstion);
        //Calls Image

        //Calls Appropriate Maths Function!!
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 300, 115, 25); //place x, place y, 115, 25  
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double springConstantValue = Double.parseDouble(springConstant.getText());
                    double ExtenstionValue = Double.parseDouble(Extenstion.getText());

                    BackendMediumMaths.elasticPotentialEnergy(springConstantValue, ExtenstionValue);
                } catch (IllegalArgumentException b) {
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
            }
        });

        base.rectangle();
    }
}