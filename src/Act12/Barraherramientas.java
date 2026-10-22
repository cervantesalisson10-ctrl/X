package Act12;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Barraherramientas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barraherramientas frame = new Barraherramientas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Barraherramientas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar barraHerramientas = new JToolBar();
		contentPane.add(barraHerramientas, BorderLayout.NORTH);
		
		JButton btnUno = new JButton("Uno");
		btnUno.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\R.png"));
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Activaste el botón uno");
			}
		});
		barraHerramientas.add(btnUno);
		
		JButton btnDos = new JButton("Dos");
		barraHerramientas.add(btnDos);
		
		JButton btnTres = new JButton("Tres");
		barraHerramientas.add(btnTres);
		
		JButton btnCuatro = new JButton("Cuatro");
		barraHerramientas.add(btnCuatro);

	}

}
