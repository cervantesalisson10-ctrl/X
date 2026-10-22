package Act17;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Centralizarcodigo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel etiResultado; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Centralizarcodigo frame = new Centralizarcodigo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Centralizarcodigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		
		// MENU ARRIBA - ASI VA
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menCalcular = new JMenu("Calcular");
		menuBar.add(menCalcular);
		
		JMenuItem menSumar = new JMenuItem("Sumar");
		menSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		menCalcular.add(menSumar);
		
		JMenuItem sumRestar = new JMenuItem("Restar");
		sumRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		menCalcular.add(sumRestar);
		
		JMenuItem menBorrar = new JMenuItem("Borrar");
		menBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		menCalcular.add(menBorrar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setBounds(19, 20, 81, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar(); 
			}
		});
		textField.setBounds(110, 17, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setBounds(19, 50, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar(); 
			}
		});
		textField_1.setBounds(110, 47, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(19, 80, 177, 21);
		contentPane.add(etiResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		btnSumar.setBounds(19, 120, 177, 23);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		btnRestar.setBounds(19, 150, 177, 23);
		contentPane.add(btnRestar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		btnBorrar.setBounds(19, 180, 177, 23);
		contentPane.add(btnBorrar);
	}
	
	
	void Sumar() {
		String cad1, cad2;
		int a,b,s;
		cad1 = textField.getText();
		cad2 = textField_1.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		s = a + b;
		etiResultado.setText("" + s);
	}
	
	void Restar() {
		String cad1, cad2;
		int a,b,r;
		cad1 = textField.getText();
		cad2 = textField_1.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		r = a - b;
		etiResultado.setText("" + r);
	}
	
	void Borrar() {
		textField.setText("");
		textField_1.setText("");
		etiResultado.setText("");
	}
}