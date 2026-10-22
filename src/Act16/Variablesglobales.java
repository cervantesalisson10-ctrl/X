package Act16;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Variablesglobales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int coches; // variable global
	private JLabel etiCoches; // <-- TAMBIEN global

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variablesglobales frame = new Variablesglobales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Variablesglobales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		coches = 0;
		
		JButton btnEntro = new JButton("Entro un coche");
		btnEntro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coches = coches + 1;
				etiCoches.setText("" + coches);
			}
		});
		btnEntro.setBounds(20, 20, 120, 25);
		contentPane.add(btnEntro);
		
		JButton btnSalio = new JButton("Salio un coche");
		btnSalio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (coches > 0) {
				    coches = coches - 1;
				    etiCoches.setText("" + coches);
				}
			}
		});
		btnSalio.setBounds(20, 60, 120, 25);
		contentPane.add(btnSalio);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coches = 0;
				etiCoches.setText("0");
			}
		});
		btnReiniciar.setBounds(20, 100, 120, 25);
		contentPane.add(btnReiniciar);
		
		JLabel lblNewLabel = new JLabel("Coches en el parking");
		lblNewLabel.setBounds(20, 180, 130, 14);
		contentPane.add(lblNewLabel);
		
		etiCoches = new JLabel("0");
		etiCoches.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiCoches.setBounds(160, 178, 60, 20);
		contentPane.add(etiCoches);
	}
}