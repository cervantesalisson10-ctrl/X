package Act15;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scpDatos = new JScrollPane();
		scpDatos.setBounds(10, 25, 414, 225);
		contentPane.add(scpDatos);
		
		JPanel panelDatos = new JPanel();
		scpDatos.setColumnHeaderView(panelDatos);
		panelDatos.setBackground(new Color(255, 128, 255));
		panelDatos.setLayout(null);
		panelDatos.setPreferredSize(new java.awt.Dimension(380,400));
		
		JLabel lblNewLabel_1 = new JLabel("PANEL DE DATOS");
		lblNewLabel_1.setBounds(8, 8, 139, 17);
		panelDatos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LUNES");
		lblNewLabel_2.setBounds(8, 36, 36, 10);
		panelDatos.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(93, 32, 65, 16);
		panelDatos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MARTES");
		lblNewLabel_3.setBounds(8, 62, 36, 10);
		panelDatos.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 60, 65, 16);
		panelDatos.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("MIERCOLES");
		lblNewLabel_4.setBounds(8, 88, 46, 10);
		panelDatos.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 84, 65, 16);
		panelDatos.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("JUEVES");
		lblNewLabel_5.setBounds(8, 111, 36, 10);
		panelDatos.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 109, 65, 16);
		panelDatos.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("VIERNES");
		lblNewLabel_6.setBounds(8, 135, 54, 10);
		panelDatos.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 132, 65, 16);
		panelDatos.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("SABADO");
		lblNewLabel_7.setBounds(8, 160, 36, 10);
		panelDatos.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(95, 155, 65, 16);
		panelDatos.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("DOMINGO");
		lblNewLabel_8.setBounds(8, 187, 49, 10);
		panelDatos.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(96, 184, 65, 16);
		panelDatos.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ejemplo2");
		lblNewLabel.setBounds(23, 0, 200, 31);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));

	}
}
