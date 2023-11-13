import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class program2 extends Applet implements MouseMotionListener, KeyListener {
    private int x, y;

    public void init() {
        addMouseMotionListener(this);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Mouse position: " + x + ", " + y, 10, 20);
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 10;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}
