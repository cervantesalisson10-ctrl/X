package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
public class Ventanaprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanaprincipal frame = new Ventanaprincipal();
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
	public Ventanaprincipal() {
		setTitle("CUADROS DE VERIFICACION");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chkPerro = new JCheckBox("Perro");
		chkPerro.setBounds(47, 63, 114, 27);
		contentPane.add(chkPerro);
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setBounds(47, 89, 71, 27);
		contentPane.add(chkGato);
		
		JCheckBox chkRaton = new JCheckBox("Raton");
		chkRaton.setBounds(46, 116, 83, 20);
		contentPane.add(chkRaton);
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(42, 217, 324, 27);
		contentPane.add(etiResultado);

		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				if (chkPerro.isSelected()) {
				    mensaje=mensaje+"Perro ";
				}
				if (chkGato.isSelected()) {
				    mensaje=mensaje+"Gato ";
				}
				if (chkRaton.isSelected()) {
				    mensaje=mensaje+"Raton ";
				}
				etiResultado.setText(mensaje);
			}
		});
		btnAceptar.setBounds(42, 159, 83, 20);
		contentPane.add(btnAceptar);
		
		
	}
}
