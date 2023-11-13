import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class program2 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JButton button;
    private JList<String> list;

    public program2() {
        super("Multiplication Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        add(textField);

        button = new JButton("Generate Table");
        button.addActionListener(this);
        add(button);

        list = new JList<String>();
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(200, 200));
        add(scrollPane);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(textField.getText());
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num + " x " + i + " = " + (num * i);
        }
        list.setListData(table);
    }

    public static void main(String[] args) {
        new program2();
    }
}
