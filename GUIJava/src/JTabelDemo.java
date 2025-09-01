import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTabelDemo {

  public static void main(String[] args) {
    String record[][] = {
      { "100", "Abiraj", "20" },
      { "200", "Umesh", "30" },
      { "300", "ram", "40" },
      { "400", "shyam", "50" },
    };
    String columnName[] = { "ID", "Name", "Age" };
    JFrame frame = new JFrame();
    frame.setTitle("this is for table");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 500, 600);

    // Container cont = new Container();
    // cont.setLayout(null);

    JTable table = new JTable(record, columnName);

    frame.add(new JScrollPane(table));

    frame.setVisible(true);
  }
}
