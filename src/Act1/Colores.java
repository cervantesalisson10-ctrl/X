package Act1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPanel;
public class Colores {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores window = new Colores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Colores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
ButtonGroup grupoColores=new ButtonGroup();
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(8, 156, 76, 18);
		frame.getContentPane().add(btnAceptar);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(21, 220, 308, 23);
		frame.getContentPane().add(etiResultado);
	
	
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Colores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 255)));
		panel.setBounds(8, 18, 171, 133);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		panel.add(rdbtnVerde);
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		panel.add(rdbtnRojo);
	    
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		panel.add(rdbtnAzul);
		String mensaje="Color elegido: ";
		if(rdbtnRojo.isSelected()) {
			mensaje=mensaje + "Rojo";
		}else if(rdbtnAzul.isSelected()){
			mensaje= mensaje + "Azul";
		}else if(rdbtnVerde.isSelected()) {
			mensaje= mensaje + "Verde";
			
		
	}
}
	public void setVisible(boolean Visible) {
	frame.setVisible(true);
	}
	
	}

