package Act1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menusito {

	private JFrame frmMenu;
 
	Ventanaprincipal e=new Ventanaprincipal();
	Cuadros e2=new Cuadros();
	Cuadrosdelista e3=new Cuadrosdelista();
	Cuadrosdelista e5=new Cuadrosdelista();
	Modelosdelista e6=new Modelosdelista();
	Toggle e7=new Toggle();
	sliders e8=new sliders();
	Scrollabars e9=new Scrollabars();
	Spinner e09=new Spinner();
	Act4Cuadroscombinados e04=new Act4Cuadroscombinados();
	Barrademenus e11=new Barrademenus();
	Barradeherramientas e12=new Barradeherramientas();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menusito window = new Menusito();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menusito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("MENU");
		frmMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Downloads\\R.png"));
		frmMenu.setBounds(100, 100, 362, 575);
		frmMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frmMenu.setLocationRelativeTo(null);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnPractica1 = new JButton("PRACTICA 1");
		btnPractica1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventanaprincipal ventana=new Ventanaprincipal();
             ventana.setVisible(true);
				
	
			}
		});
		btnPractica1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica1.setBounds(24, 67, 145, 18);
		frmMenu.getContentPane().add(btnPractica1);
		
		JButton btnPractica2 = new JButton("PRACTICA 2");
		btnPractica2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colores ventana=new Colores();
				ventana.setVisible(true);
			
			}
		});
		btnPractica2.setBounds(24, 108, 145, 18);
		frmMenu.getContentPane().add(btnPractica2);
		
		JButton btnPractica3 = new JButton("PRACTICA 3");
		btnPractica3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuadros ventana3=new Cuadros();
				ventana3.setVisible(true);
			
			
			}
	
		});
		btnPractica3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica3.setBounds(24, 149, 145, 18);
		frmMenu.getContentPane().add(btnPractica3);
		
		
		JButton btnPractica4 = new JButton("PRACTICA 4");
		btnPractica4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Act4Cuadroscombinados window =new Act4Cuadroscombinados();
				window.frmCuadros.setVisible(true);
				
			}
		});
		btnPractica4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica4.setBounds(24, 187, 145, 18);
		frmMenu.getContentPane().add(btnPractica4);
		
		
		
		JButton btnPractica5 = new JButton("PRACTICA 5");
		btnPractica5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuadrosdelista ventana5=new Cuadrosdelista();
				ventana5.setVisible(true);
			}
		});
		btnPractica5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica5.setBounds(24, 229, 145, 18);
		frmMenu.getContentPane().add(btnPractica5);
		
		JButton btnPractica6 = new JButton("PRACTICA 6");
		btnPractica6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modelosdelista ventana6=new Modelosdelista();
				ventana6.setVisible(true);
				
			}
		});
		btnPractica6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica6.setBounds(24, 273, 145, 18);
		frmMenu.getContentPane().add(btnPractica6);
		
		JButton btnPractica7 = new JButton("PRACTICA 7");
		btnPractica7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toggle ventana7=new Toggle();
				ventana7.setVisible(true);
			}
		});
		btnPractica7.setBounds(24, 313, 145, 18);
		frmMenu.getContentPane().add(btnPractica7);
		
		JButton btnPracntica8 = new JButton("PRACTICA 8");
		btnPracntica8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sliders ventana8=new sliders();
				ventana8.setVisible(true);
			}
		});
		btnPracntica8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPracntica8.setBounds(24, 355, 145, 18);
		frmMenu.getContentPane().add(btnPracntica8);
		
		JButton btnPractica9 = new JButton("PRACTICA 9");
		btnPractica9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spinner ventana09=new Spinner();
				ventana09.setVisible(true);
				
			}
		});
		btnPractica9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica9.setBounds(24, 396, 145, 18);
		frmMenu.getContentPane().add(btnPractica9);
		
		JButton btnPractica10 = new JButton("PRACTICA 10");
		btnPractica10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scrollabars ventana9=new Scrollabars();
				ventana9.setVisible(true);
			}
		});
		btnPractica10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica10.setBounds(24, 437, 145, 18);
		frmMenu.getContentPane().add(btnPractica10);
		
		JButton btnPractica11 = new JButton("PRACTICA 11");
		btnPractica11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e11.frame.setVisible(true);
			}
		});
		btnPractica11.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica11.setBounds(24, 482, 145, 18);
		frmMenu.getContentPane().add(btnPractica11);
		
		JButton btnPractica12 = new JButton("PRACTICA 12");
		btnPractica12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e12.frame.setVisible(true);
			}
		});
		btnPractica12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica12.setBounds(24, 520, 145, 18);
		frmMenu.getContentPane().add(btnPractica12);
		
		JButton btnPractica13 = new JButton("PRACTICA 13");
		btnPractica13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica13.setBounds(199, 69, 141, 18);
		frmMenu.getContentPane().add(btnPractica13);
		
		JButton btnPractica14 = new JButton("PRACTICA 14");
		btnPractica14.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica14.setBounds(199, 110, 141, 18);
		frmMenu.getContentPane().add(btnPractica14);
		
		JButton btnPractica15 = new JButton("PRACTICA 15");
		btnPractica15.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPractica15.setBounds(199, 151, 141, 18);
		frmMenu.getContentPane().add(btnPractica15);
	}
}
