package Act1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;

public class Menusemergentes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menusemergentes window = new Menusemergentes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menusemergentes() {
		initialize();
	}

	
	 private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JPopupMenu menuEmergente = new JPopupMenu();
    
    
    JMenuItem menuRojo = new JMenuItem("Rojo");
    menuRojo.addActionListener(e -> {
        
    });
    menuEmergente.add(menuRojo);
    
    JMenuItem menuVerde = new JMenuItem("Verde");
    menuVerde.addActionListener(e -> {
        
    });
    menuEmergente.add(menuVerde);
    
    JMenuItem menuAzul = new JMenuItem("Azul");
    menuAzul.addActionListener(e -> {
        
    });
    menuEmergente.add(menuAzul);
    
    
    frame.getContentPane().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) { 
            if(e.getButton()==3) { 
                menuEmergente.show(e.getComponent(), e.getX(), e.getY()); 
            }
        }
    });
}
	
}
