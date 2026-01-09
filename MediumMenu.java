import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MediumMenu {
    public static void Main(){
        
        base.setUp("Simple Menu");

        base.frame.setVisible(true);
        base.homeButtom();

        JLabel mainMenuLabel = new JLabel("Which of the following would you like to use");
        mainMenuLabel.setBounds(86, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);
        

        JButton keneticEnergyButton = new JButton("Kenetic Energy");
        keneticEnergyButton.setBounds(140, 100, 115, 25); //place x, place y, 115, 25  
        base.frame.add(keneticEnergyButton);
        keneticEnergyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				KeneticEnergy.main();
            }
        });

        JButton weightButton = new JButton("Weight");
        weightButton.setBounds(140, 175, 115, 25); //place x, place y, 115, 25  
        base.frame.add(weightButton);
        weightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				Weight.main();
            }
        });

        JButton HydrostaticPressureButton = new JButton("Hydrostatic Pressure");
        HydrostaticPressureButton.setBounds(140, 250, 115, 25); //place x, place y, 115, 25  
        base.frame.add(HydrostaticPressureButton);
        HydrostaticPressureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				HydrostaticPressure.main();
            }
        });

        JButton ElasticPotentialEnergyButton = new JButton("Elastic Potential Energy");
        ElasticPotentialEnergyButton.setBounds(140, 325, 115, 25); //place x, place y, 115, 25  
        base.frame.add(ElasticPotentialEnergyButton);
        ElasticPotentialEnergyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				ElasticPotentialEnergy.main();
            }
        });
    }
}