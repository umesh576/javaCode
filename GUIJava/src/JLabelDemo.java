import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(200, 200, 500, 500);

    frame.setTitle("This is frame");

    Container contner = new Container();
    contner.setLayout(null);
    contner.setBackground(Color.pink);

    JLabel label = new JLabel("A basic level");

    Font f = new Font("arial", Font.BOLD, 25);

    label.setFont(f);

    label.setBounds(100, 100, 300, 200);
    contner.add(label);
    frame.add(label);
    frame.setVisible(true);
  }
}
