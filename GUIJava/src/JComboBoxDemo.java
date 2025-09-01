import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setBounds(100, 100, 500, 500);

    Container content = frame.getContentPane();
    content.setLayout(null);

    String values[] = { "java", "python", "cpp" };
    Font font = new Font("arial", Font.BOLD, 25);
    final JComboBox combobox = new JComboBox<String>(values);
    combobox.setBounds(100, 100, 100, 30);
    combobox.setFont(font);

    JButton button = new JButton("click");
    button.setSize(100, 50);
    button.setLocale(null);

    JLabel label = new JLabel("hello jii");
    label.setBounds(150, 160, 100, 30);

    label.setFont(font);

    content.add(combobox);
    content.add(label);
    content.add(button);

    button.addActionListener(
      new ActionListener() {
        public void actionPermormed(ActionEvent arg0) {
          String selectItems = (String) combobox.getSelectedItem();
          label.setText(selectItems);
        }
      }
    );
    frame.setVisible(true);
  }
}
