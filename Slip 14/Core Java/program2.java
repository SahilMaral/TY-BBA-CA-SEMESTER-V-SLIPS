import java.awt.*;
import java.awt.event.*;

public class program2 extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1;

    program2() {
        l1 = new Label("Eno:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(150, 50, 100, 30);
        add(t1);

        l2 = new Label("EName:");
        l2.setBounds(50, 100, 100, 30);
        add(l2);

        t2 = new TextField();
        t2.setBounds(150, 100, 100, 30);
        add(t2);

        l3 = new Label("Sal:");
        l3.setBounds(50, 150, 100, 30);
        add(l3);

        t3 = new TextField();
        t3.setBounds(150, 150, 100, 30);
        add(t3);

        b1 = new Button("Submit");
        b1.setBounds(100, 200, 80, 30);
        b1.addActionListener(this);
        add(b1);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String eno = t1.getText();
        String ename = t2.getText();
        String sal = t3.getText();

        Frame f = new Frame();
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        Label l4 = new Label("Eno: " + eno);
        l4.setBounds(50, 50, 200, 30);
        f.add(l4);

        Label l5 = new Label("EName: " + ename);
        l5.setBounds(50, 100, 200, 30);
        f.add(l5);

        Label l6 = new Label("Sal: " + sal);
        l6.setBounds(50, 150, 200, 30);
        f.add(l6);

    }

    public static void main(String args[]) {
        new program2();
    }
}
