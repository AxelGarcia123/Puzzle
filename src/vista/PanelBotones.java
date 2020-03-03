package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class PanelBotones extends JPanel {

	
	
	
	public PanelBotones() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Botones es Swing");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JTextArea contenidoBotones = new JTextArea();
		add(contenidoBotones, BorderLayout.CENTER);

		
		
		
		
		
	}
	
	
	
	
	

}
