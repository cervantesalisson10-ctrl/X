package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Act4Cuadroscombinados {

	public JFrame frmCuadros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act4Cuadroscombinados window = new Act4Cuadroscombinados();
					window.frmCuadros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Act4Cuadroscombinados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCuadros = new JFrame();
		frmCuadros.setTitle("CUADROS COMBINADOS");
		frmCuadros.setBounds(100, 100, 450, 300);
		frmCuadros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCuadros.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(8, 158, 350, 36);
		frmCuadros.getContentPane().add(lblNewLabel);
		
		JComboBox<String> cboColores = new JComboBox<String>();
		cboColores.setEditable(true);
		cboColores.setModel(new DefaultComboBoxModel<String>(new String[] {"Rojo", "Verde", "Azul"}));
		cboColores.setBounds(8, 20, 138, 28);
		frmCuadros.getContentPane().add(cboColores);

		cboColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String colorSeleccionado = cboColores.getSelectedItem().toString();
				String mensaje = "El color elegido es: " + colorSeleccionado;
				lblNewLabel.setText(mensaje);

				
				if (colorSeleccionado.equals("Rojo")) {
					
					lblNewLabel.setOpaque(true);
				} else if (colorSeleccionado.equals("Verde")) {
					
					lblNewLabel.setOpaque(true);
				} else if (colorSeleccionado.equals("Azul")) {
					
					lblNewLabel.setOpaque(true);
				}
			}
		});
	}
	
}