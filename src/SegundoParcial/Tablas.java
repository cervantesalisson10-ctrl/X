package SegundoParcial;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
public class Tablas {

		private JFrame frmTablasDeMultiplicar;
		private JTextField txtNumero;
		private JTextArea txtResulado;
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Tablas window = new Tablas();
						window.frmTablasDeMultiplicar.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		public Tablas() {
			initialize();
		}
		
		public void calcularTalas() {
			try {
				String texto = txtNumero.getText().trim();
				if (texto.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingresa un número por favor.");
					return;
				}
				int n = Integer.parseInt(texto);
				txtResulado.setText(
					n + " x 1 = " + (n * 1) + "\n" +
					n + " x 2 = " + (n * 2) + "\n" +
					n + " x 3 = " + (n * 3) + "\n" +
					n + " x 4 = " + (n * 4) + "\n" +
					n + " x 5 = " + (n * 5) + "\n" +
					n + " x 6 = " + (n * 6) + "\n" +
					n + " x 7 = " + (n * 7) + "\n" +
					n + " x 8 = " + (n * 8) + "\n" +
					n + " x 9 = " + (n * 9) + "\n" +
					n + " x 10 = " + (n * 10)
				);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Algo salió mal");
			}
		}
		private void initialize() {
			frmTablasDeMultiplicar = new JFrame();
			
			
			try {
				frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cesia\\Downloads\\@Kevinkaarl _20.jpg"));
			} catch (Exception e) {
			
			}
			
			frmTablasDeMultiplicar.setTitle("TABLAS DE MULTIPLICAR");
			frmTablasDeMultiplicar.setBounds(100, 100, 450, 403);
			frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmTablasDeMultiplicar.getContentPane().setLayout(null);
			frmTablasDeMultiplicar.setLocationRelativeTo(null);
			
			JLabel lblNumero = new JLabel("Número");
			lblNumero.setFont(new Font("Segoe Print", Font.PLAIN, 12));
			lblNumero.setBounds(10, 12, 92, 32);
			frmTablasDeMultiplicar.getContentPane().add(lblNumero);
			
			JButton btnVer = new JButton("Ver");
			btnVer.setFont(new Font("Segoe Print", Font.PLAIN, 12));
			btnVer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcularTalas();
				}
			});
			btnVer.setBounds(241, 26, 84, 25);
			frmTablasDeMultiplicar.getContentPane().add(btnVer);
			
			txtResulado = new JTextArea();
			txtResulado.setFont(new Font("Segoe Print", Font.PLAIN, 13));
			txtResulado.setBackground(new Color(64, 128, 128));
			txtResulado.setBounds(34, 84, 362, 240);
			frmTablasDeMultiplicar.getContentPane().add(txtResulado);
			
			txtNumero = new JTextField();
			txtNumero.setBounds(92, 24, 119, 30);
			frmTablasDeMultiplicar.getContentPane().add(txtNumero);
			txtNumero.setColumns(10);
			
			JButton btnDel = new JButton("Del");
			btnDel.setFont(new Font("Segoe Print", Font.PLAIN, 12));
			btnDel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtNumero.setText("");
					txtResulado.setText("");
				}
			});
			btnDel.setBounds(335, 26, 84, 25);
			frmTablasDeMultiplicar.getContentPane().add(btnDel);
		}
	}