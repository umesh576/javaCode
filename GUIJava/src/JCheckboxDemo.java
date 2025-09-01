import java.awt.Color;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckboxDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 600, 500);
    frame.setTitle("New frame");

    Container content = frame.getContentPane();
    content.setBackground(Color.pink);
    content.setLayout(null);

    JCheckBox checkbox1 = new JCheckBox("java");
    JCheckBox checkbox2 = new JCheckBox("cpp");
    JCheckBox checkbox3 = new JCheckBox("python");

    checkbox1.setBounds(100, 100, 50, 20);
    checkbox2.setBounds(100, 120, 50, 20);
    checkbox3.setBounds(100, 140, 100, 20);
    checkbox1.setBackground(Color.pink);

    content.add(checkbox1);
    content.add(checkbox2);
    content.add(checkbox3);

    frame.setVisible(true);
  }
}
