package GUI;

// import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class JavaForm {


    public static void main(String[] args) {
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("This is frame.");

        // Container cont = frame.getContentPane();
        // cont.setLayout(null);

        
        JLabel label = new JLabel("This is label");

        Font font = new Font("arial",Font.BOLD,25);
        label.setFont(font);

        label.setBounds(100,100,300,300);
        // label.setText("This is label");

        // cont.add(label);
        frame.add(label);


        frame.setVisible(true);
    }
    
}
