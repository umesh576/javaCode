import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListDemo extends JFrame {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setBounds(100, 200, 500, 500);
    frame.setTitle("this is for list");

    Container cont = frame.getContentPane();
    cont.setLayout(null);

    String[] items = { "umesh", "joshi", "ram", "hari", "khatiwoda" };

    JList list = new JList(items);
    list.setVisibleRowCount(3);

    JPanel panel = new JPanel();
    panel.add(new JScrollPane(list));

    cont.add(panel);

    frame.setVisible(true);
  }
}
