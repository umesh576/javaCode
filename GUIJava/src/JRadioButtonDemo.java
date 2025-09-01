import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 600, 600);
    frame.setTitle("This is frame");

    JRadioButton jbutton = new JRadioButton("Male");
    jbutton.setBounds(100, 100, 30, 30);

    frame.add(jbutton);

    frame.setVisible(true);
  }
}
