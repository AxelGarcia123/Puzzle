package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class VentanaPruevas1 extends JFrame {

	private JPanel contentPane;
	private Point pocisionNueva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPruevas1 frame = new VentanaPruevas1();
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
	public VentanaPruevas1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Me hiciste click");
				
			}
		});
		panel.add(btnAceptar);
		btnAceptar.setMnemonic(KeyEvent.VK_A);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(e->JOptionPane.showMessageDialog(null, "Me hiciste click cancelar"));
		
		JButton btnArrastrar = new JButton("Arrastrar");
		btnArrastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnArrastrar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva=MouseInfo.getPointerInfo().getLocation();
				btnArrastrar.setLocation(pocisionNueva);
			}
		});
		btnArrastrar.setMnemonic(KeyEvent.VK_R);
		panel.add(btnArrastrar);
		btnCancelar.setMnemonic(KeyEvent.VK_C);
		panel.add(btnCancelar);
	}

}
