package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class VentanaPruebas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPruebas frame = new VentanaPruebas();
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
	public VentanaPruebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);





		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(255, 165, 0));
		btnAceptar.setMnemonic(KeyEvent.VK_A);
		OyenteBotonAceptar oyenteBotonAceptar= new OyenteBotonAceptar();
		btnAceptar.addActionListener(oyenteBotonAceptar);
		//btnAceptar.setBounds(38, 79, 89, 23);
		btnAceptar.setLocation(new Point(33, 106));
		btnAceptar.setSize(new Dimension(150,50));
		contentPane.add(btnAceptar);





		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(124, 252, 0));
		btnCancelar.setMnemonic(KeyEvent.VK_C);
		OyenteBotonCancelar oyenteBotonCancelar= new OyenteBotonCancelar();
		btnCancelar.addActionListener(oyenteBotonCancelar);
		btnCancelar.setBounds(239, 106, 150, 50);
		contentPane.add(btnCancelar);

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

	
	
	private class OyenteBotonAceptar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			intercambiarBotones(e);
		}
		
	}
	
	
	
	
	
	private class OyenteBotonCancelar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			intercambiarBotones(e);
		}
		
	}

	
	
	private void intercambiarBotones(ActionEvent e) {
		JButton botonPresionado=(JButton) e.getSource();
		JButton otroBoton=null;
		String texto=botonPresionado.getText();				
		
	Point posicionPresionada=botonPresionado.getLocation();
		
		switch (texto) {
		case "Aceptar":
			otroBoton=btnCancelar;
			break;

		case "Cancelar":
			otroBoton=btnAceptar;
			break;
		default:
			break;
		}
		
		Point otraPosicion=otroBoton.getLocation();
		botonPresionado.setLocation(otraPosicion);
		otroBoton.setLocation(posicionPresionada);
		repaint();
		

	}

}
