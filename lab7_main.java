import javax.swing.JFrame;
import javax.swing.JPanel;

public class lab7_main {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Lab 7");
    frame.setSize(2500, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    frame.add(panel);
    graphInterface.placeComponents(panel);
    frame.setVisible(true);

  }

}
