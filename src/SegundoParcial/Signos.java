package SegundoParcial;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class Signos {

	private JFrame frmSignosZodiazales;
	private JLabel lblValorDia, lblSigno, lblFecha, lblMensaje;
	private JComboBox<String> cmbMes;
	private JSlider sldDia;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Signos window = new Signos();
				window.frmSignosZodiazales.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Signos() {
		initialize();
	}
	
	public void ponerPortada() {
		try {
			java.net.URL portada = getClass().getResource("/signos/portada.jpeg");
			if(portada != null) {
				ImageIcon icono = new ImageIcon(portada);
				java.awt.Image img = icono.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
				lblSigno.setIcon(new ImageIcon(img));
			}
		} catch(Exception ex) {}
	}

	public void calcularsigno() {
		int dia = sldDia.getValue();
		lblValorDia.setText("" + dia);
		String mes = cmbMes.getSelectedItem().toString();
		lblFecha.setText(dia + " de " + mes);
		
		String signo = "";
		switch(mes) {
			case "Enero": signo=(dia>=20)?"acuario":"capricornio"; break;
			case "Febrero": signo=(dia>=19)?"piscis":"acuario"; break;
			case "Marzo": signo=(dia>=21)?"aries":"piscis"; break;
			case "Abril": signo=(dia>=20)?"tauro":"aries"; break;
			case "Mayo": signo=(dia>=21)?"geminis":"tauro"; break;
			case "Junio": signo=(dia>=21)?"cancer":"geminis"; break;
			case "Julio": signo=(dia>=23)?"leo":"cancer"; break;
			case "Agosto": signo=(dia>=23)?"virgo":"leo"; break;
			case "Septiembre": signo=(dia>=23)?"libra":"virgo"; break;
			case "Octubre": signo=(dia>=23)?"escorpio":"libra"; break;
			case "Noviembre": signo=(dia>=22)?"sagitario":"escorpio"; break;
			case "Diciembre": signo=(dia>=22)?"capricornio":"sagitario"; break;
		}
		
		
		try {
			String ruta = "/signos/" + signo + ".jpeg";
			java.net.URL imgURL = getClass().getResource(ruta);
			if(imgURL != null) {
				ImageIcon icono = new ImageIcon(imgURL);
				java.awt.Image img = icono.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
				lblSigno.setIcon(new ImageIcon(img));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		frmSignosZodiazales = new JFrame();
		frmSignosZodiazales.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		frmSignosZodiazales.setTitle("SIGNOS ZODIACALES");
		frmSignosZodiazales.setBounds(100, 100, 700, 500);
		frmSignosZodiazales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignosZodiazales.setLocationRelativeTo(null);
		frmSignosZodiazales.getContentPane().setLayout(null);
		frmSignosZodiazales.getContentPane().setBackground(new Color(240, 240, 255));
		
		JLabel lblDia = new JLabel("DIA:");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDia.setBounds(20, 15, 50, 20);
		frmSignosZodiazales.getContentPane().add(lblDia);
		
		lblValorDia = new JLabel("1");
		lblValorDia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorDia.setForeground(Color.BLUE);
		lblValorDia.setBounds(280, 15, 40, 20);
		frmSignosZodiazales.getContentPane().add(lblValorDia);
		
		sldDia = new JSlider(1, 31, 1);
		sldDia.addChangeListener(e -> calcularsigno());
		sldDia.setPaintTicks(true);
		sldDia.setPaintLabels(true);
		sldDia.setMajorTickSpacing(5);
		sldDia.setMinorTickSpacing(1);
		sldDia.setBounds(20, 40, 280, 50);
		frmSignosZodiazales.getContentPane().add(sldDia);
		
		JLabel lblMesTxt = new JLabel("MES:");
		lblMesTxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMesTxt.setBounds(20, 95, 50, 20);
		frmSignosZodiazales.getContentPane().add(lblMesTxt);
		
		cmbMes = new JComboBox<>();
		cmbMes.addActionListener(e -> calcularsigno());
		cmbMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmbMes.setModel(new DefaultComboBoxModel<>(new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}));
		cmbMes.setBounds(20, 120, 150, 30);
		frmSignosZodiazales.getContentPane().add(cmbMes);
		
		lblFecha = new JLabel("1 de Enero");
		lblFecha.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblFecha.setBounds(20, 160, 200, 25);
		frmSignosZodiazales.getContentPane().add(lblFecha);
		
		lblMensaje = new JLabel("", SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMensaje.setForeground(new Color(120, 0, 150));
		lblMensaje.setBounds(20, 200, 280, 30);
		frmSignosZodiazales.getContentPane().add(lblMensaje);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(e -> {
			sldDia.setValue(1);
			cmbMes.setSelectedIndex(0);
			lblMensaje.setText("");
			lblFecha.setText("1 de Enero");
			lblValorDia.setText("1");
			ponerPortada(); 
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(200, 120, 80, 30);
		frmSignosZodiazales.getContentPane().add(btnReset);
		
		lblSigno = new JLabel("", SwingConstants.CENTER);
		lblSigno.setBounds(350, 20, 320, 400);
		frmSignosZodiazales.getContentPane().add(lblSigno);
		
		
		ponerPortada();
	}
}