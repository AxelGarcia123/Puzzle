package pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEjemplo extends JFrame {

	private JPanel contentPane;
	private JButton BotonUno;
	private JButton BotonDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEjemplo frame = new VentanaEjemplo();
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
	public VentanaEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BotonUno = new JButton("Soy boton uno");
		BotonUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BotonDos.doClick();
			}
		});
		BotonUno.setBounds(36, 36, 122, 23);
		contentPane.add(BotonUno);
		
		BotonDos = new JButton("Soy boton dos");
		BotonDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JButton	botonPresionado=(JButton) e.getSource();
			JOptionPane.showMessageDialog(null, botonPresionado.getText()+"me hiciste click");
			}
		});
		BotonDos.setBounds(36, 109, 122, 23);
		contentPane.add(BotonDos);
	}
	private class OyenteBotonUno implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			BotonDos.doClick();
		}
		
	
	} 
}
