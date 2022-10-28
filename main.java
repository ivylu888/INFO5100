import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {

  public static void main(String[] args) {
    // create JFrame entity
    JFrame frame = new JFrame("Lab6");
    // Setting the width and height of frame
    frame.setSize(600, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JPanel panel = new JPanel();
    frame.add(panel);
    graphInterface.putComponents(panel);
    frame.setVisible(true);
  }


}

