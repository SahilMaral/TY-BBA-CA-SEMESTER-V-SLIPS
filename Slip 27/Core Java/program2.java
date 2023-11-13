import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class program2 extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;
    JButton button;
    JList<String> list;

    program2() {
        super("Directory Lister");
        label = new JLabel("Enter directory name:");
        textField = new JTextField(20);
        button = new JButton("List directory");
        button.addActionListener(this);
        list = new JList<String>();
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        c.add(textField);
        c.add(button);
        c.add(new JScrollPane(list));
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String dirName = textField.getText();
        File dir = new File(dirName);
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            list.setListData(files);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid directory name", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new program2();
    }
}
