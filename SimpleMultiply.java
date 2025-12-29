import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleMultiply {
    public static void main(){
        base.setUp("Simple Multiply");
        base.homeButtom();

        JLabel headingLabel = new JLabel("Please Fill In The Following Boxes:");
        headingLabel.setBounds(86, 65, 300, 25);
        headingLabel.setForeground(Color.black);
        base.frame.add(headingLabel);

		JLabel inputALabel = new JLabel("Number for 'A' ");
		inputALabel.setBounds(50, 125, 200, 25);
		inputALabel.setForeground(Color.black);
		base.frame.add(inputALabel);
		
		JTextField inputA = new JTextField();
		inputA.setBounds(170, 125, 150, 25);
	    base.frame.add(inputA);

        JLabel inputBLabel = new JLabel("Number for 'B' ");
		inputBLabel.setBounds(50, 200, 200, 25);
		inputBLabel.setForeground(Color.black);
		base.frame.add(inputBLabel);
		
		JTextField inputB = new JTextField(); 
		inputB.setBounds(170, 200, 150, 25);
	    base.frame.add(inputB);
        //Calls Image

        //Calls Appropriate Maths Function!!
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 300, 115, 25); //place x, place y, 115, 25  
        base.frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int inputAValue = Integer.parseInt(inputA.getText());
                    int inputBValue = Integer.parseInt(inputB.getText());

                    BackendSimpleMaths.Multiply(inputAValue, inputBValue);
                } catch (IllegalArgumentException b) {
                    base.mistake("ERROR", "SOMETHING WENT WRONG, PLEASE TRY AGAIN IF THE PROBLEM CONTINUES, PLEASE CHECK THE BOXES");
                }
            }
        });
    }
}