package pruebas;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaCajas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCajas frame = new VentanaCajas();
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
	public VentanaCajas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyReleased(KeyEvent arg0) {
				String contenido=textField.getText();
				if(!contenido.isEmpty()) {
				
					char dato=contenido.charAt(contenido.length()-1);
					if (!Character.isDigit(dato)) {
						JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS");
						contenido.substring(contenido.length()-1);
						
					}
				}
			}
		});
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		textField.setText("");
		textField.setBounds(194, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIngresaUnTexto = new JLabel("INGRESA LA CADENA");
		lblIngresaUnTexto.setBounds(10, 35, 192, 14);
		contentPane.add(lblIngresaUnTexto);
		
		JLabel label = new JLabel("");
		label.setBounds(160, 86, 204, 140);
		contentPane.add(label);
	}
	public static boolean esNombre (String cadena) {
		for (int i = 0; i < cadena.length(); i++)
		{
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				return false; //uno no es letra
		}
 
		//todos los caracteres son letras
		return true;
		

	}

}
