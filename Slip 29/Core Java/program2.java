import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class program2 extends Applet implements Runnable {
    private int x, y, dx, dy, r;
    private Color[] colors;
    private int colorIndex;

    public void init() {
        x = 150;
        y = 150;
        dx = 5;
        dy = 5;
        r = 20;
        colors = new Color[] { Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta };
        colorIndex = 0;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;
            if (x - r < 0 || x + r > getWidth()) {
                dx = -dx;
                colorIndex = (colorIndex + 1) % colors.length;
            }
            if (y - r < 0 || y + r > getHeight()) {
                dy = -dy;
                colorIndex = (colorIndex + 1) % colors.length;
            }
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(colors[colorIndex]);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }
}
