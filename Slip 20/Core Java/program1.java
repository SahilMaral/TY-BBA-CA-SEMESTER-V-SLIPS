import java.awt.*;
import java.awt.event.*;

class program1 extends Frame {
    public program1(String title) {
        super(title);
        setBackground(Color.RED);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        program1 frame = new program1("TYBBACA");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
