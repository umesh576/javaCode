import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;


public class JPannelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,500,500);
        frame.setTitle("This is frame.");

        Container conter = frame.getContentPane();
        conter.setBackground(Color.red);
        conter.setLayout(null);

        JPanel pannel = new JPanel();
        pannel.setBounds(100,100,100,100);
        pannel.setBackground(Color.white);
        conter.add(pannel);

        JPanel pannel1 = new JPanel();
        pannel1.setBounds(200,200,100,100);
        pannel1.setBackground(Color.white);
        conter.add(pannel1);

    }
}
