package Act14;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileChooserEj extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFileChooser elegirFichero;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooserEj frame = new FileChooserEj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FileChooserEj() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		elegirFichero = new JFileChooser();

		JMenuBar barraMenus = new JMenuBar();
		setJMenuBar(barraMenus);

		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);

		JMenuItem menuAbrir = new JMenuItem("Abrir");
		menuAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp;
				resp = elegirFichero.showOpenDialog(null);
				if (resp == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, elegirFichero.getSelectedFile().toString());
				} else if (resp == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Se pulso la opcion Cancelar");
				}
			}
		});
		menuArchivo.add(menuAbrir);

		JSeparator separator = new JSeparator();
		menuArchivo.add(separator);

		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArchivo.add(menuSalir);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}