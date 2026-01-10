import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MediumMenu {
    public static void Main(){
        
        base.setUp("Medium Menu");

        base.frame.setVisible(true);
        base.homeButton();

        JLabel mainMenuLabel = new JLabel("Which of the following would you like to use");
        mainMenuLabel.setBounds(65, 65, 300, 25);
        mainMenuLabel.setForeground(Color.black);
        base.frame.add(mainMenuLabel);
        

        JButton keneticEnergyButton = new JButton("Kenetic Energy");
        keneticEnergyButton.setBounds(110, 100, 175, 25); //place x, place y, 115, 25  
        base.frame.add(keneticEnergyButton);
        keneticEnergyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				KeneticEnergy.main();
            }
        });

        JButton weightButton = new JButton("Weight");
        weightButton.setBounds(110, 175, 175, 25); //place x, place y, 115, 25  
        base.frame.add(weightButton);
        weightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				Weight.main();
            }
        });

        JButton HydrostaticPressureButton = new JButton("Hydrostatic Pressure");
        HydrostaticPressureButton.setBounds(110, 250, 175, 25); //place x, place y, 115, 25  
        base.frame.add(HydrostaticPressureButton);
        HydrostaticPressureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				HydrostaticPressure.main();
            }
        });

        JButton ElasticPotentialEnergyButton = new JButton("Elastic Potential Energy");
        ElasticPotentialEnergyButton.setBounds(110, 325, 175, 25); //place x, place y, 115, 25  
        base.frame.add(ElasticPotentialEnergyButton);
        ElasticPotentialEnergyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.frame.setVisible(false);
				ElasticPotentialEnergy.main();
            }
        });

        base.rectangle();
    }
}