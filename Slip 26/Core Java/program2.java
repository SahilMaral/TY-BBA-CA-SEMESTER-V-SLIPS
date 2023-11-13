import java.awt.*;
import java.applet.*;

public class program2 extends Applet {
    public void paint(Graphics g) {
        Polygon t = new Polygon();
        setBackground(new Color(173, 216, 230));
        g.setColor(Color.gray);
        g.fillRect(100, 200, 200, 200);

        g.setColor(Color.ORANGE);
        t.addPoint(100, 200);
        t.addPoint(200, 100);
        t.addPoint(300, 200);
        g.fillPolygon(t);
        g.setColor(Color.black);
        g.fillRect(170, 300, 60, 100);
    }
}
