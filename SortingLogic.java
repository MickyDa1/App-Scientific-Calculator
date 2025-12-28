import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JLabel;

public class SortingLogic {

    public static ArrayList<Double> sortingList = new ArrayList<Double>();

    public static void sorting(int choice, double num){
        switch (choice) {
            case 1: // adding
                sortingAdd(num, sortingList);
                break;

            case 2: // reading

                if (sortingList.isEmpty()){
                    base.mistake("ERROR", "you have not added any information to be sorted.");
                } else {
                    sortingRead(sortingList);
                }
                
                break;
            }
        }


    public static void sortingAdd(double inNum, ArrayList<Double> sortingList){
        sortingList.add(inNum);
    }

    public static void sortingRead(ArrayList<Double> sortingList){
        int lineCount = 0;
        int labelY = 50;
        base.empty("Sorting");
        
        JLabel headingLabel = new JLabel("The order is as follows: ");
        headingLabel.setBounds(86, 25, 300, 25);
        headingLabel.setForeground(Color.black);
        base.frame.add(headingLabel);

        sortingList.sort(Comparator.naturalOrder());
        
        for (Double c : sortingList) {
           
            JLabel number = new JLabel(String.valueOf(c));
            number.setBounds(86, labelY, 300, 25);
            number.setForeground(Color.black);
            base.frame.add(number);
            labelY = labelY + 25;


            lineCount++;
            
            if (lineCount % 10 == 0) {
				System.out.println("Press Enter to continue viewing or type quit to stop");
                boolean next = base.check();
                if (next == false) {
                    break;
                } else if (next == true){
                    base.frame.setVisible(false);
                    labelY = 50;
                    base.empty("sorting");
                }
            }
        }

    }

}
