import javax.swing.*;
import java.awt.*;

class program2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Frame Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenu searchMenu = new JMenu("Search");
        menuBar.add(searchMenu);
        JToolBar toolBar = new JToolBar();
        frame.add(toolBar, BorderLayout.NORTH);
        JButton undoButton = new JButton("Undo");
        toolBar.add(undoButton);
        JButton redoButton = new JButton("Redo");
        toolBar.add(redoButton);
        JButton cutButton = new JButton("Cut");
        toolBar.add(cutButton);
        JButton copyButton = new JButton("Copy");
        toolBar.add(copyButton);
        JButton pasteButton = new JButton("Paste");
        toolBar.add(pasteButton);
        frame.setVisible(true);
    }
}
