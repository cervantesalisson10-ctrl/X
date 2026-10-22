package Act13;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

public class Menusemergentes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPopupMenu menuEmergente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menusemergentes frame = new Menusemergentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menusemergentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuEmergente = new JPopupMenu();

		JMenuItem menuRojo = new JMenuItem("Rojo");
		menuRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		menuEmergente.add(menuRojo);

		JMenuItem menuVerde = new JMenuItem("Verde");
		menuVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		menuEmergente.add(menuVerde);

		JMenuItem menuAzul = new JMenuItem("Azul");
		menuAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		menuEmergente.add(menuAzul);

		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 3) {
					menuEmergente.show(contentPane, e.getX(), e.getY());
				}
			}
		});
	}
}