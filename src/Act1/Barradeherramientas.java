package Act1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Barradeherramientas {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barradeherramientas window = new Barradeherramientas();
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
	public Barradeherramientas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\Dos.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar barradeherramientas = new JToolBar();
		frame.getContentPane().add(barradeherramientas, BorderLayout.NORTH);
		
		JButton btnUno = new JButton("");
		btnUno.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\a.png"));
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		barradeherramientas.add(btnUno);
		
		JButton btnDos = new JButton("");
		btnDos.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\B.png"));
		barradeherramientas.add(btnDos);
		
		JButton btnTres = new JButton("");
		btnTres.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\iconotres.png"));
		barradeherramientas.add(btnTres);
		
		JButton btnCuatro = new JButton("");
		btnCuatro.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\Pop.png"));
		barradeherramientas.add(btnCuatro);
	}
}
