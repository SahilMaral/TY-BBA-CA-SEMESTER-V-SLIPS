import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class program2 extends Applet implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField t1, t2, t3, t4, t5;
    Button b1, b2;

    public void init() {
        l1 = new Label("Principal Amount");
        add(l1);
        t1 = new TextField(15);
        add(t1);

        l2 = new Label("Interest Rate (%)");
        add(l2);
        t2 = new TextField(15);
        add(t2);

        l3 = new Label("Time (Yrs)");
        add(l3);
        t3 = new TextField(15);
        add(t3);

        l4 = new Label("Number of times interest is compounded");
        add(l4);
        t4 = new TextField(15);
        add(t4);

        b1 = new Button("Calculate");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Clear");
        add(b2);
        b2.addActionListener(this);

        l5 = new Label("Compound Interest");
        add(l5);
        t5 = new TextField(15);
        add(t5);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());
            double n = Double.parseDouble(t4.getText());
            double ci = p * Math.pow((1 + (r / (n * 100))), (n * t)) - p;
            t5.setText(String.valueOf(ci));
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
    }
}
