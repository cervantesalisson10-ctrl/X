package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Toggle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecioBase;
	private JToggleButton tbtnInstalacion;
	private JToggleButton tbtnFormacion;
	private JToggleButton tbtnAlimentacionBD;
	private JLabel etiPrecioInstalacion;
	private JLabel etiPrecioFormacion;
	private JLabel etiPrecioAlimentacionBD;
	private JLabel etiTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toggle frame = new Toggle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Toggle() {
		setTitle("TOGGLEBUTTONS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio base");
		lblNewLabel.setBounds(29, 28, 146, 24);
		contentPane.add(lblNewLabel);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setBounds(29, 51, 65, 16);
		contentPane.add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		tbtnInstalacion = new JToggleButton("Instalacion");
		tbtnInstalacion.setBounds(29, 92, 102, 18);
		contentPane.add(tbtnInstalacion);
		
		tbtnFormacion = new JToggleButton("Formacion");
		tbtnFormacion.setBounds(29, 118, 102, 18);
		contentPane.add(tbtnFormacion);
		
		tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
		tbtnAlimentacionBD.setBounds(29, 144, 110, 18);
		contentPane.add(tbtnAlimentacionBD);
		
		etiPrecioInstalacion = new JLabel("40");
		etiPrecioInstalacion.setBounds(160, 93, 65, 16);
		contentPane.add(etiPrecioInstalacion);
		
		etiPrecioFormacion = new JLabel("200");
		etiPrecioFormacion.setBounds(160, 122, 37, 10);
		contentPane.add(etiPrecioFormacion);
		
		etiPrecioAlimentacionBD = new JLabel("200");
		etiPrecioAlimentacionBD.setBounds(160, 148, 50, 10);
		contentPane.add(etiPrecioAlimentacionBD);
		
		etiTotal = new JLabel("");
		etiTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiTotal.setBounds(36, 226, 109, 29);
		contentPane.add(etiTotal);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio_base;
				double precio_instal;
				double precio_for;
				double precio_ali;

				precio_base = Double.parseDouble(txtPrecioBase.getText());
				precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
				precio_for = Double.parseDouble(etiPrecioFormacion.getText());
				precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());

				double precio_total;
				precio_total = precio_base;

				if (tbtnInstalacion.isSelected()) {
				    precio_total = precio_total + precio_instal;
				}
				if (tbtnFormacion.isSelected()) {
				    precio_total = precio_total + precio_for;
				}
				if (tbtnAlimentacionBD.isSelected()) {
				    precio_total = precio_total + precio_ali;
				}

				etiTotal.setText(precio_total+" €");
			}
		});
		btnCalcular.setBounds(29, 190, 76, 18);
		contentPane.add(btnCalcular);
		
		// PUNTO 8 - Va aquí, en el constructor, no dentro del botón Calcular
		tbtnInstalacion.setSelected(true);
	}
}