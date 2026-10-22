package Act1;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Modelosdelista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox cboNumeros; // 1. Ponlos aquí arriba
	private JLabel etiResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelosdelista frame = new Modelosdelista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Modelosdelista() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboNumeros = new JComboBox();
		cboNumeros.setBounds(29, 27, 119, 19);
		// PASO 10 - Esto te faltaba
		cboNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cboNumeros.getSelectedItem() != null) {
					etiResultado.setText(cboNumeros.getSelectedItem().toString());
				}
			}
		});
		contentPane.add(cboNumeros);
		
		JButton btnPares = new JButton("Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=0;i<10;i+=2) {
				    modelo.addElement("Nº "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnPares.setBounds(195, 27, 76, 18);
		contentPane.add(btnPares);
		
		JButton btnImpares = new JButton("Impares");
		btnImpares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=1;i<10;i+=2) {
				    modelo.addElement("Nº "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnImpares.setBounds(278, 27, 76, 18);
		contentPane.add(btnImpares);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(29, 152, 200, 24);
		contentPane.add(etiResultado);
	}
}