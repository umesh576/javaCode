import java.awt.Container;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;

public class jButtonDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("This frame for button");
    frame.setBounds(100, 100, 600, 600);

    Container content = frame.getContentPane();
    content.setLayout(null);

    // Container

    JButton button = new JButton("clcik");
    button.setLayout(null);
    button.setSize(200, 50);

    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    button.setCursor(cursor);

    button.setVisible(true);

    content.add(button);
    frame.setVisible(true);
  }
}
