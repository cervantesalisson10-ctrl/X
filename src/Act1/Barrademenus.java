package Act1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Barrademenus {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barrademenus window = new Barrademenus();
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
	public Barrademenus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar barraMenus = new JMenuBar();
		frame.setJMenuBar(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		
		JMenuItem menultemAbrir = new JMenuItem("Abrir");
		menuArchivo.add(menultemAbrir);
		
		JMenuItem menultemGuardar = new JMenuItem("Guardar");
		menuArchivo.add(menultemGuardar);
		
		JMenu menuEdicion = new JMenu("Edicion");
		barraMenus.add(menuEdicion);
		
		JMenu menuColores = new JMenu("Colores");
		menuEdicion.add(menuColores);
		
		JMenuItem menultemRojo = new JMenuItem("Rojo");
		menuColores.add(menultemRojo);
		
		JMenuItem menultemVerde = new JMenuItem("Verde");
		menuColores.add(menultemVerde);
		
		JMenuItem menultemAzul = new JMenuItem("Azul");
		menuColores.add(menultemAzul);
		
		JMenu menuInsertar = new JMenu("Insertar");
		barraMenus.add(menuInsertar);
		frame.getContentPane().setLayout(null);
	}

}
