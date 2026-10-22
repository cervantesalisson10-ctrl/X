package Act4.copy;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Cuadros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadros frame = new Cuadros();
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
	public Cuadros() {
		setTitle("CUADROS COMBINADOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(20, 229, 275, 26);
		contentPane.add(etiResultado);
		
		JList list = new JList();
		list.setBounds(36, 72, 77, 0);
		contentPane.add(list);
		
		JList lstColores = new JList();
		lstColores.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rojo", "Verde", "Azul"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstColores.setBounds(8, 8, 134, 116);
		contentPane.add(lstColores);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				if (lstColores.getSelectedIndex()==-1) {
				    mensaje="No hay un color seleccionado.";
				} else {
				    mensaje="El color seleccionado es: "+lstColores.getSelectedValue().toString();
				}
				etiResultado.setText(mensaje);
				
			}
		});
		btnNewButton.setBounds(8, 143, 76, 18);
		contentPane.add(btnNewButton);
	}

	}


