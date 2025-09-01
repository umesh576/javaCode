package Appletlearn;
import javax.swing.*;
import java.awt.*;

public class HelloAppletSwing extends JFrame {
    public HelloAppletSwing() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, Swing version of Applet!", 50, 100);
    }

    public static void main(String[] args) {
        HelloAppletSwing app = new HelloAppletSwing();
        app.setVisible(true);
    }
}
