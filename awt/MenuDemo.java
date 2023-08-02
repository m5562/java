import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MenuDemo extends JFrame {
 JMenuItem m_copyItem;
    JMenuItem m_pasteItem;

   JPopupMenu m_popup = new JPopupMenu();
public MenuDemo() {
        // (1) Create menu items and set their mnemonic, accelerator, enabled.
        m_copyItem = new JMenuItem("Copy");
            m_copyItem.setEnabled(false);
            m_copyItem.setAccelerator(KeyStroke.getKeyStroke("control C"));
        m_pasteItem = new JMenuItem("Paste");
            m_pasteItem.setEnabled(false);
            m_pasteItem.setAccelerator(KeyStroke.getKeyStroke("control V"));
        JMenuItem openItem = new JMenuItem("Open...");
            openItem.setMnemonic('O');
            openItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        JMenuItem quitItem = new JMenuItem("Quit");
            quitItem.setMnemonic('Q');
            quitItem.setAccelerator(KeyStroke.getKeyStroke("control Q"));

        // (2) Build  menubar, menus, and add menuitems.
        JMenuBar menubar = new JMenuBar();  // Create new menu bar
            JMenu fileMenu = new JMenu("File"); // Create new menu
                fileMenu.setMnemonic('F');
                menubar.add(fileMenu);      // Add menu to the menubar
                fileMenu.add(openItem);     // Add menu item to the menu
                fileMenu.addSeparator();    // Add separator line to menu
                fileMenu.add(quitItem);
            JMenu editMenu = new JMenu("Edit");
                fileMenu.setMnemonic('E');
                menubar.add(editMenu);
                editMenu.add(m_copyItem);
                editMenu.add(m_pasteItem);

        // (3) Add listeners to menu items
        openItem.addActionListener(new OpenAction());
        quitItem.addActionListener(new QuitAction());


        //... Add the (unused) text area to the content pane.
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        //content.add(m_editArea, BorderLayout.CENTER);

        //... Add menu items to popup menu, add popup menu to text area.
        m_popup.add(new JMenuItem("Testing"));
        //m_editArea.setComponentPopupMenu(m_popup);

        //... Set the JFrame's content pane and menu bar.
        setContentPane(content);
        setJMenuBar(menubar);

        setTitle("Menu Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);  // Center window.
    }
// OpenAction
    class OpenAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(MenuDemo.this, "Can't Open.");
        }
    }

   
    class QuitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);  // Terminate the program.
        }
    }

    
    public static void main(String[] args) {
        JFrame win = new MenuDemo();
        win.setVisible(true);
    }
}
