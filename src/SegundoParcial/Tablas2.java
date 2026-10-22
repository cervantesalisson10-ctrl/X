package SegundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablas2 {

	private JFrame frmTablasDeMultiplicar;
	private JSlider sldNumero;
	private JLabel lblNumero;
	private JTextArea txtResultado;
	private JButton btnDel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas2 window = new Tablas2();
					window.frmTablasDeMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablas2() {
		initialize();
	}
	public void calcularTalas() {
		try {
			int n =Integer.parseInt(lblNumero.getText().toString());
			txtResultado.setText(
			n+" x 1 = "+(n*1)+"\n"+
			n+" x 2 = "+(n*2)+"\n"+
			n+" x 1 = "+(n*3)+"\n"+
			n+" x 1 = "+(n*4)+"\n"+
			n+" x 1 = "+(n*5)+"\n"+
			n+" x 1 = "+(n*6)+"\n"+
			n+" x 1 = "+(n*7)+"\n"+
			n+" x 1 = "+(n*8)+"\n"+
			n+" x 1 = "+(n*9)+"\n"+
			n+" x 1 = "+(n*10));
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setTitle("TABLAS DE MULTIPLICAR");
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		frmTablasDeMultiplicar.setBounds(100, 100, 450, 300);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero.setBounds(308, 50, 59, 15);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		txtResultado = new JTextArea();
		txtResultado.setForeground(new Color(255, 128, 192));
		txtResultado.setEditable(false);
		txtResultado.setBounds(29, 93, 224, 160);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		
		sldNumero = new JSlider();
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText(""+sldNumero.getValue());
				calcularTalas();
			}
		});
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setPaintLabels(true);
		sldNumero.setSnapToTicks(true);
		sldNumero.setPaintTicks(true);
		sldNumero.setValue(0);
		sldNumero.setBounds(19, 34, 254, 51);
		frmTablasDeMultiplicar.getContentPane().add(sldNumero);
		calcularTalas();
		
		
		btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero.setText("");
				txtResultado.setText(" ");
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDel.setBounds(291, 96, 76, 18);
		frmTablasDeMultiplicar.getContentPane().add(btnDel);
		
	}

}
