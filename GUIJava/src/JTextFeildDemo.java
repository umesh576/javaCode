import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFeildDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(200, 200, 400, 400);
    frame.setTitle("New frame for jtextfeild");

    Container content = frame.getContentPane();
    content.setLayout(null);
    content.setBackground(Color.RED);

    JTextField text = new JTextField();
    text.setBounds(100, 100, 100, 50);
    // text.setText("new text");

    content.add(text);

    frame.setVisible(true);
  }
}
