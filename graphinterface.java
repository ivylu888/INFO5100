import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
//import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class graphinterface extends JFrame {
  public static void placeComponents(JPanel panel){
    panel.setLayout(null);
    JLabel readLabel1 = new JLabel("Read the file name: ");
    JTextField tf1 = new JTextField("/Users/ivylu/AD&E/lab7/annual.csv");
    JButton readButton = new JButton("Click to read from file!!");
    JLabel readLabel12 = new JLabel("First five lines of file: ");
    JTextArea ta1 = new JTextArea();

    readButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String filename = tf1.getText();
        fileIO fileIO = new fileIO();
        String s_output;

        try{
          s_output = fileIO.read_file(filename);
        }catch(IOException e1){
          throw new RuntimeException(e1);
        }
        ta1.setText(s_output);
      }
    });

    readLabel1.setBounds(15, 25, 180, 30);
    panel.add(readLabel1);

    tf1.setBounds(180, 25, 450, 30);
    panel.add(tf1);

    readButton.setBounds(15, 70, 180, 30);
    panel.add(readButton);

    readLabel12.setBounds(15, 120, 180, 30);
    panel.add(readLabel12);

    ta1.setBounds(15, 140, 550, 100);
    panel.add(ta1);

    JLabel writeLabel1 = new JLabel("File name to write");
    //JTextField tf2 = new JTextField("/Users/ivylu/AD&E/lab7/annual.csv");
    JTextField tf2 = new JTextField("user input");
    JLabel writeLabel2 = new JLabel("First five lines of file: ");
    JTextArea ta2 = new JTextArea();
    JButton writeButton = new JButton("Click to write to file ");
    writeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String filename = tf2.getText();
        fileIO fileIO = new fileIO();

        File file = new File("/Users/ivylu/AD&E/lab7/annual.csv");
        String str_output;
        try{
          fileIO.write_file(filename,file);
          str_output = fileIO.read_file(filename);

        } catch (IOException e2) {
          throw new RuntimeException(e2);
        }
        ta2.setText(str_output);
      }
    });


    writeLabel1.setBounds(680, 25, 180, 30);
    panel.add(writeLabel1);

    tf2.setBounds(800, 25, 450, 30);
    panel.add(tf2);

    writeButton.setBounds(680, 70, 180, 30);
    panel.add(writeButton);

    writeLabel2.setBounds(680, 120, 180, 30);
    panel.add(writeLabel2);

    ta2.setBounds(680,140, 500, 100);
    panel.add(ta2);


  }

}
