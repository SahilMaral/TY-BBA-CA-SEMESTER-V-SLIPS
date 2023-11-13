import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.lang.Thread;


public class program2 extends Applet implements Runnable {
    private static final long serialVersionUID = 1L;
    private Thread thread;
    private boolean running = false;
    private Color color;

    public void init() {
        setSize(400, 400);
        setBackground(Color.WHITE);
        color = Color.YELLOW;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
            running = true;
        }
    }

    public void stop() {
        if (thread != null) {
            // thread.stop();
            thread = null;
            running = false;
        }
    }

    public void run() {
        while (running) {
            Random rand = new Random();
            int r = rand.nextInt(256);
            int g = rand.nextInt(256);
            int b = rand.nextInt(256);
            color = new Color(r, g, b);
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(150, 150, 100, 100);
        g.setColor(Color.BLACK);
        g.fillRect(190, 250, 20, 100);
        g.setColor(Color.BLACK);
        g.fillRect(150, 350, 100, 5);
      
    }
}
