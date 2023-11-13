import java.awt.*;
import javax.swing.*;

class program1 {
  public static void main(String args[]) {
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    p.setBackground(Color.RED);
    JLabel l = new JLabel("Dr. D Y Patil College");
    l.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    p.add(l);
    f.add(p);
    f.setSize(400, 400);
    f.setVisible(true);
  }
}
