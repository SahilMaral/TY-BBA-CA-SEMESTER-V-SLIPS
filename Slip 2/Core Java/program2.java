import java.awt.*;
import java.awt.event.*;

class program2 extends Frame implements MouseListener, MouseMotionListener {
	TextField textField;

	program2() {
		textField = new TextField(20);
		add(textField, BorderLayout.NORTH);
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(400, 400);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		textField.setText("Mouse clicked at: " + e.getX() + " :: " + e.getY());
	}

	public void mouseMoved(MouseEvent e) {
		textField.setText("Mouse moved at: " + e.getX() + " :: " + e.getY());
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public static void main(String args[]) {
		new program2();
	}
}
