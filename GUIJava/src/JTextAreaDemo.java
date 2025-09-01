import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(100, 200, 400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("new frame");

    Container content = frame.getContentPane();
    content.setLayout(null);
    content.setBackground(Color.yellow);

    JTextArea area = new JTextArea();
    area.setBounds(50, 200, 300, 100);
    area.setEditable(true);

    content.add(area);

    frame.setVisible(true);
  }
}
