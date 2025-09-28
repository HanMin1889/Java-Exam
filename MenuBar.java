import javax.swing.*;

public class MenuBar extends JFrame {
    
    private JMenuBar bar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu edit = new JMenu("Edit");
    private JMenu help = new JMenu("Help"); 
    private JMenuItem fnew = new JMenuItem("New");
    private JMenuItem fopen = new JMenuItem("Open");
    private JMenuItem fsave = new JMenuItem("Save");
    private JMenuItem fexit = new JMenuItem("Exit");

    public MenuBar() {
        
        setTitle("Menu Example");
        setSize(200, 200);

        bar.add(file);
        bar.add(edit);
        bar.add(help);
        file.add(fnew);
        file.add(fopen);
        file.add(fsave);
        file.addSeparator();
        file.add(fexit);

    this.setJMenuBar(bar);
    setVisible(true);
}

public static void main(String args[]) {
    new MenuBar();
}
}