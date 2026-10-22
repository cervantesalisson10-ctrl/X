package SegundoParcial;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Scrollbar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla3 {

	private JFrame frmTabla;
	private Scrollbar scrollbar;
	private JLabel lblNumero;
	private JButton btnBorrar;
	private JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla3 window = new Tabla3();
					window.frmTabla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tabla3() {
		initialize();
	}

	public void CalcularTabla3() {
		try {
			int n = scrollbar.getValue();
			lblNumero.setText("" + n);
			txtResultado.setText(
			n+" x 1 = "+(n*1)+"\n"+
			n+" x 2 = "+(n*2)+"\n"+
			n+" x 3 = "+(n*3)+"\n"+
			n+" x 4 = "+(n*4)+"\n"+
			n+" x 5 = "+(n*5)+"\n"+
			n+" x 6 = "+(n*6)+"\n"+
			n+" x 7 = "+(n*7)+"\n"+
			n+" x 8 = "+(n*8)+"\n"+
			n+" x 9 = "+(n*9)+"\n"+
			n+" x 10 = "+(n*10));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal CECYTO: " + e.getMessage());
		}
	}

	private void initialize() {
		frmTabla = new JFrame();
		frmTabla.setTitle("TABLA 3");
		frmTabla.setBounds(100, 100, 450, 300);
		frmTabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTabla.setLocationRelativeTo(null);
		frmTabla.getContentPane().setLayout(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNumero.setBounds(277, 21, 37, 38);
		frmTabla.getContentPane().add(lblNumero);
		
		txtResultado = new JTextArea();
		txtResultado.setForeground(new Color(255, 128, 192));
		txtResultado.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtResultado.setBounds(21, 79, 218, 154);
		frmTabla.getContentPane().add(txtResultado);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollbar.setValue(0);
				lblNumero.setText("0");
				txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(287, 82, 76, 18);
		frmTabla.getContentPane().add(btnBorrar);
		
		scrollbar = new Scrollbar();
		scrollbar.setMinimum(0);
		scrollbar.setMaximum(111);
		scrollbar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				CalcularTabla3(); 
			}
		});
		scrollbar.setOrientation(Scrollbar.HORIZONTAL);
		scrollbar.setBounds(21, 10, 242, 49);
		frmTabla.getContentPane().add(scrollbar);
	}
}