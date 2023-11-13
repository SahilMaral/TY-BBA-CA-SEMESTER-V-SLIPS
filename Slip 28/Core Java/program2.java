import javax.swing.*;

class program2 extends JFrame {
    public program2() {
        Object[][] data = {
                { 1, "Sahil Maral", 50000 },
                { 2, "Tejas Pisal", 60000 },
                { 3, "Aniket Varkhade", 70000 },
                { 4, "Sunil Vishwakarma", 80000 },
                { 5, "Ashish Ingulkar", 90000 }
        };

        String columnNames[] = { "Eno", "Ename", "Salary" };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new program2();
    }
}
