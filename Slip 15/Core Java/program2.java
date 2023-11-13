import java.applet.*;
import java.awt.*;

public class program2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        g.drawArc(50, 110, 100, 50, 0, -180);
    }
}