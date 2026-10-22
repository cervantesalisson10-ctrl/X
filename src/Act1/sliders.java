package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class sliders extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSlider slDeslizador;
	private JLabel etiValor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sliders frame = new sliders();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public sliders() {
		setTitle("SLIDERS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(112, 157, 224, 35);
		contentPane.add(etiValor);
		
		slDeslizador = new JSlider();
		slDeslizador.setMinimum(100);
		slDeslizador.setMaximum(500);
		slDeslizador.setValue(400);
		slDeslizador.setMajorTickSpacing(50);
		slDeslizador.setPaintTicks(true);
		slDeslizador.setPaintLabels(true);
		slDeslizador.setBounds(54, 62, 339, 35);
		contentPane.add(slDeslizador);
		
		
		slDeslizador.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+slDeslizador.getValue());
			}
		});
		
		
		etiValor.setText("El valor es: "+slDeslizador.getValue());
	}
}