import javax.swing.*;
import javax.swing.text.*; 
import java.awt.*;

class JMenuDemo extends JFrame {
    
    JMenuBar mb;
    JMenu m1, m2, m3, m4;
    JMenu submenu;
    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;

    public JMenuDemo() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setTitle("JMenu Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        mb = new JMenuBar();
        m1 = new JMenu();
        m2 = new JMenu(new DefaultEditorKit.BeepAction()); 
        m3 = new JMenu("Edit");
        m4 = new JMenu("Format", true);
        
        submenu.setDelay(1000);
        int x = submenu.getLocation().x;
        int y = submenu.getLocation().y;
        y=y+submenu.grtPreferredSize().height;
        submenu.setMenuLocation(x,y);
        m1.setText("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Save As");
        i5 = new JMenuItem("Exit");
        i6 = new JMenuItem("Cut");
        i7 = new JMenuItem("Copy");
        i8 = new JMenuItem("Paste");
        i9 = new JMenuItem("Wordwrap");
        i10 = new JMenuItem("Font");

        submenu.add(new JMenuItem("Item 1"));
        submenu.add(new JMenuItem("Item 2"));
        submenu.add(new JMenuItem("Item 3"));
        submenu.add(new JMenuItem("Item 4"));
        submenu.add(new JMenuItem("Item 5"));

        m1.add(new JButton("This is a button")); 
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);

        m1.add("Print");
        m1.add(i5);

        m1.addSeparator();
        m1.add(submenu); 
        m3.add(i6);
        m3.add(i7);
        m3.add(i8);
        m3.add(i9);
        m4.add(i10);
        m4.insert("Item 0", 0); 

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        setJMenuBar(mb); 

        System.out.println("Item count for m1 " + m1.getItemCount());

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        new JMenuDemo();
    }
}