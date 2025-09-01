import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFeildDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 200, 500, 500);
    frame.setTitle("New frma efor set Password feild");

    Container content = frame.getContentPane();
    content.setLayout(null);
    content.setBackground(Color.PINK);

    JPasswordField password = new JPasswordField();
    password.setBounds(100, 200, 300, 30);
    password.setText("hy");

    content.add(password);
    password.setEchoChar('#');

    frame.setVisible(true);
  }
}
