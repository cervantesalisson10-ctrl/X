	package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;

public class Spinner extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spiValor;
	private JLabel etiValor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spinner frame = new Spinner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Spinner() {
		setTitle("SLIDER EJEMPLO 2");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiValor = new JLabel("El valor es: 0");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(37, 108, 180, 29);
		contentPane.add(etiValor);
		
		spiValor = new JSpinner();
		spiValor.setBounds(39, 38, 113, 29);
		
		SpinnerNumberModel nm=new SpinnerNumberModel();
		nm.setMaximum(10);
		nm.setMinimum(0);
		nm.setStepSize(2);
		spiValor.setModel(nm);
		
		contentPane.add(spiValor);
		
		spiValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: " + spiValor.getValue().toString());
			}
		});
	}
}