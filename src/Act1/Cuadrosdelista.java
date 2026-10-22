package Act1;

import java.awt.EventQueue;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Cuadrosdelista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList lstNombres; 
	private JLabel etiResultado; 
	private JButton btnVaciar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrosdelista frame = new Cuadrosdelista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cuadrosdelista() {
		setTitle("MODELOS DE CUADROS DE LISTA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0))); 
		etiResultado.setBounds(196, 22, 232, 27);
		contentPane.add(etiResultado);
		
		
		lstNombres = new JList();
		lstNombres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(lstNombres.getSelectedValue() != null) {
					etiResultado.setText(lstNombres.getSelectedValue().toString());
				}
			}
		});
		lstNombres.setBounds(8, 8, 98, 117);
		contentPane.add(lstNombres);
		
		JButton btnCurso1 = new JButton("Curso1");
		btnCurso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("Maria");
				modelo.addElement("Luis");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso1.setBounds(8, 173, 76, 18);
		contentPane.add(btnCurso1);
		
		JButton btnCurso2 = new JButton("Curso2");
		btnCurso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso2.setBounds(8, 202, 76, 18);
		contentPane.add(btnCurso2);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				lstNombres.setModel(modelo);
				
				
			}
		});
		btnVaciar.setBounds(112, 173, 76, 18);
		contentPane.add(btnVaciar);
	}
	

	}
