import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class graphInterface {
  static void putComponents(JPanel panel){
    GetWeightGrade grade = new GetWeightGrade();
    panel.setLayout(null);

    //Total Assignment points
    JLabel tapLabel = new JLabel("Total Assignment points:");
    tapLabel.setBounds(10,60,200,25);
    panel.add(tapLabel);

    JTextField tapText = new JTextField(20);
    tapText.setBounds(250,60,170,25);
    panel.add(tapText);


    //Earned Points
    JLabel epLabel = new JLabel("Earned Points:");
    epLabel.setBounds(10,90,200,25);
    panel.add(epLabel);

    JTextField epText = new JTextField(20);
    epText.setBounds(250,90,170,25);
    panel.add(epText);


    //Percentage on class
    JLabel percentageLabel = new JLabel("Percentage of class:");
    percentageLabel.setBounds(10,120,220,25);
    panel.add(percentageLabel);

    JTextField percentageText = new JTextField(20);
    percentageText.setBounds(250,120,170,25);
    panel.add(percentageText);

    // button of calculation
    JButton button = new JButton("Calculate");
    button.setBounds(250,150,170,25);
    panel.add(button);


    //Get answer !!
    JLabel label = new JLabel("Weighted Score:");
    label.setBounds(15,180,220,25);
    panel.add(label);

    JLabel ansLabel = new JLabel("");
    ansLabel.setBounds(250,180,220,25);
    panel.add(ansLabel);


    //button ActionListener
    button.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        grade.setPointTotal(Integer.parseInt(tapText.getText()));
        grade.setEarnedPoints(Integer.parseInt(epText.getText()));
        grade.setPercentage(Integer.parseInt(percentageText.getText()));
        grade.calculatorWeight();
        ansLabel.setText(String.valueOf(grade.getTotalWeightedGrade()));
      }

    });






  }

}
