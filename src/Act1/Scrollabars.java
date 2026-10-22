package Act1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;

public class Scrollabars extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollBar desValor; 
	private JLabel etiValor;     

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrollabars frame = new Scrollabars();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Scrollabars() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		setTitle("SPINNER");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiValor = new JLabel("El valor es: 70"); 
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(49, 127, 134, 24);
		contentPane.add(etiValor);

		desValor = new JScrollBar(); 
		desValor.setOrientation(JScrollBar.HORIZONTAL);
		desValor.setMinimum(50);
		desValor.setMaximum(150);
		desValor.setUnitIncrement(2);
		desValor.setBlockIncrement(20);
		desValor.setVisibleAmount(5);
		desValor.setBounds(22, 32, 325, 24);
		contentPane.add(desValor);
		
		desValor.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				etiValor.setText("El valor es:" + desValor.getValue()); // con ()
			}
		});

		desValor.setValue(70); 
	}
}