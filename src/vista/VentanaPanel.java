package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPanel extends JFrame {

	private JPanel contentPane;
	private JPanel panelEncabezado;
	private JPanel panelCentral;
	private Point pocisionNueva;
	private JButton Boton2;
	private JButton Boton3;
	private JButton Boton4;
	private JButton Boton5;
	private JButton Boton6;
	private JButton Boton7;
	private JButton Boton8;
	private JButton Boton9;
	private JButton Boton1;
	private int cont;
	private JButton Boton3_3;
	private JButton Boton4_4;
	private JButton Boton5_5;
	private JButton Boton6_6;
	private JButton Boton7_7;
	private JButton Boton8_8;
	private JButton Boton9_9;
	private JButton Boton1_1;
	private JButton Boton2_2;
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	Point p5;
	Point p6;
	Point p7;
	Point p8;
	Point p9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPanel frame = new VentanaPanel();
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
	public VentanaPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 190, 231));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setBounds(1000, 1000, 2500, 600);
		panelEncabezado = new JPanel();
		panelEncabezado.setBackground(new Color(158, 38, 182));
		contentPane.add(panelEncabezado, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Puzzle");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		panelEncabezado.add(lblNewLabel);

		panelCentral = new JPanel();
		panelCentral.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		panelCentral.setDoubleBuffered(false);
		panelCentral.setBackground(new Color(225, 190, 231));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);

		Boton1 = new JButton("");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Boton1.setHorizontalTextPosition(SwingConstants.CENTER);
		Boton1.setBorder(null);
		Boton1.setBorderPainted(false);
		Boton1.setFocusPainted(false);
		Boton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton1.setSelected(true);
		Boton1.setContentAreaFilled(false);
		Boton1.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/0.jpg")));
		Boton1.setBounds(238, 261, 100, 100);
		panelCentral.add(Boton1);
		p1 = Boton1.getLocation();
		Boton1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton1.setLocation(pocisionNueva);
			}
		});

		Boton1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1, x2, y1, y2;
				x1 = (int) Boton1_1.getLocation().getX();
				y1 = (int) Boton1_1.getLocation().getY();
				x2 = (int) Boton1.getLocation().getX();
				y2 = (int) Boton1.getLocation().getY();
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton1.setLocation(Boton1_1.getLocation());
				} else {
					Boton1.setLocation(p1);
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		Boton2 = new JButton("");
		Boton2.setBorderPainted(false);
		Boton2.setFocusPainted(false);
		Boton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton2.setSelected(true);
		Boton2.setContentAreaFilled(false);
		Boton2.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/1.jpg")));
		Boton2.setBounds(138, 162, 100, 100);
		panelCentral.add(Boton2);
		p2 = Boton2.getLocation();
		Boton2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton2.setLocation(pocisionNueva);
			}
		});

		Boton2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1, x2, y1, y2;
				x1 = (int) Boton2_2.getLocation().getX();
				y1 = (int) Boton2_2.getLocation().getY();
				x2 = (int) Boton2.getLocation().getX();
				y2 = (int) Boton2.getLocation().getY();

				//				for (int i = x2 - 5; i < x2 + 5; i++) {
				//					for (int j = y2 - 5; j < y2 + 5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton2.setLocation(Boton2_2.getLocation());
				} else {
					Boton2.setLocation(p2);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		Boton3 = new JButton("");
		Boton3.setBorderPainted(false);
		Boton3.setFocusPainted(false);
		Boton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton3.setSelected(true);
		Boton3.setContentAreaFilled(false);
		Boton3.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/2.jpg")));
		Boton3.setBounds(338, 361, 100, 100);
		panelCentral.add(Boton3);
		p3 = Boton3.getLocation();
		Boton3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton3.setLocation(pocisionNueva);
			}
		});

		Boton3.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1, x2, y1, y2;
				x1 = (int) Boton3_3.getLocation().getX();
				y1 = (int) Boton3_3.getLocation().getY();
				x2 = (int) Boton3.getLocation().getX();
				y2 = (int) Boton3.getLocation().getY();

				//				for (int i = x2 - 5; i < x2 + 5; i++) {
				//					for (int j = y2 - 5; j < y2 + 5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton3.setLocation(Boton3_3.getLocation());
					//							break;

				} else {
					Boton3.setLocation(p3);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		Boton4 = new JButton("");
		Boton4.setBorderPainted(false);
		Boton4.setFocusPainted(false);
		Boton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton4.setSelected(true);
		Boton4.setContentAreaFilled(false);
		Boton4.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/3.jpg")));
		Boton4.setBounds(238, 361, 100, 100);
		panelCentral.add(Boton4);
		p4 = Boton4.getLocation();
		Boton4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton4.setLocation(pocisionNueva);
			}
		});
		Boton4.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1, x2, y1, y2;
				x1 = (int) Boton4_4.getLocation().getX();
				y1 = (int) Boton4_4.getLocation().getY();
				x2 = (int) Boton4.getLocation().getX();
				y2 = (int) Boton4.getLocation().getY();

				//				for (int i = x2 - 5; i < x2 + 5; i++) {
				//					for (int j = y2 - 5; j < y2 + 5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton4.setLocation(Boton4_4.getLocation());
					//							break;

				} else {
					Boton4.setLocation(p4);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		Boton5 = new JButton("");
		Boton5.setBorderPainted(false);
		Boton5.setFocusPainted(false);
		Boton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton5.setSelected(true);
		Boton5.setContentAreaFilled(false);
		Boton5.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/4.jpg")));
		Boton5.setBounds(238, 162, 100, 100);
		panelCentral.add(Boton5);
		p5 = Boton5.getLocation();
		Boton5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton5.setLocation(pocisionNueva);
			}
		});

		Boton5.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1, x2, y1, y2;
				x1 = (int) Boton5_5.getLocation().getX();
				y1 = (int) Boton5_5.getLocation().getY();
				x2 = (int) Boton5.getLocation().getX();
				y2 = (int) Boton5.getLocation().getY();

				//				for (int i = x2 - 5; i < x2 + 5; i++) {
				//					for (int j = y2 - 5; j < y2 + 5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton5.setLocation(Boton5_5.getLocation());
					//							break;

				} else {
					Boton5.setLocation(p5);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		Boton6 = new JButton("");
		Boton6.setHorizontalTextPosition(SwingConstants.CENTER);
		Boton6.setBorder(null);
		Boton6.setBorderPainted(false);
		Boton6.setFocusPainted(false);
		Boton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton6.setSelected(true);
		Boton6.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/5.jpg")));
		Boton6.setContentAreaFilled(false);
		Boton6.setBounds(338, 261, 100, 100);
		panelCentral.add(Boton6);
		p6=Boton6.getLocation();
		Boton6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton6.setLocation(pocisionNueva);
			}
		});
		Boton6.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1,x2,y1,y2;
				x1 =(int)Boton6_6.getLocation().getX(); 
				y1 =(int)Boton6_6.getLocation().getY(); 
				x2 =(int)Boton6.getLocation().getX(); 
				y2 =(int)Boton6.getLocation().getY(); 


				//				for (int i = x2-5; i < x2+5; i++) {
				//					for (int j= y2-5; j < y2+5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton6.setLocation(Boton6_6.getLocation());
					//							break;

				}else {
					Boton6.setLocation(p6);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});


		Boton7 = new JButton("");
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Boton7.setBorderPainted(false);
		Boton7.setFocusPainted(false);
		Boton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton7.setSelected(true);
		Boton7.setContentAreaFilled(false);
		Boton7.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/7.jpg")));
		Boton7.setBounds(138, 261, 100, 100);
		panelCentral.add(Boton7);
		p7=Boton7.getLocation();
		System.out.println(p7);
		Boton7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton7.setLocation(pocisionNueva);
			}
		});
		Boton7.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1,x2,y1,y2;
				x1 =(int)Boton8_8.getLocation().getX(); 
				y1 =(int)Boton8_8.getLocation().getY(); 
				x2 =(int)Boton7.getLocation().getX(); 
				y2 =(int)Boton7.getLocation().getY(); 


				//				for (int i = x2-5; i < x2+5; i++) {
				//					for (int j= y2-5; j < y2+5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton7.setLocation(Boton8_8.getLocation());
					p7=Boton7.getLocation();
					//							break;


				}else {
					Boton7.setLocation(p7);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});


		Boton8 = new JButton("");
		Boton8.setBorderPainted(false);
		Boton8.setFocusPainted(false);
		Boton8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton8.setSelected(true);
		Boton8.setContentAreaFilled(false);
		Boton8.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/8.jpg")));
		Boton8.setBounds(338, 162, 100, 100);
		panelCentral.add(Boton8);
		p8=Boton8.getLocation();
		Boton8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton8.setLocation(pocisionNueva);
			}
		});
		Boton8.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1,x2,y1,y2;
				x1 =(int)Boton9_9.getLocation().getX(); 
				y1 =(int)Boton9_9.getLocation().getY(); 
				x2 =(int)Boton8.getLocation().getX(); 
				y2 =(int)Boton8.getLocation().getY(); 


				//				for (int i = x2-5; i < x2+5; i++) {
				//					for (int j= y2-5; j < y2+5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton8.setLocation(Boton9_9.getLocation());
					//							break;

				}else {
					Boton8.setLocation(p8);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});


		Boton9 = new JButton("");
		Boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Boton9.setBorderPainted(false);
		Boton9.setFocusPainted(false);
		Boton9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Boton9.setSelected(true);
		Boton9.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/6.jpg")));
		Boton9.setBounds(138, 361, 100, 100);
		panelCentral.add(Boton9);
		p9=Boton9.getLocation();
		Boton9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				pocisionNueva = MouseInfo.getPointerInfo().getLocation();
				Boton9.setLocation(pocisionNueva);
			}
		});
		Boton9.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				int x1,x2,y1,y2;
				x1 =(int)Boton7_7.getLocation().getX(); 
				y1 =(int)Boton7_7.getLocation().getY(); 
				x2 =(int)Boton9.getLocation().getX(); 
				y2 =(int)Boton9.getLocation().getY(); 


				//				for (int i = x2-5; i < x2+5; i++) {
				//					for (int j= y2-5; j < y2+5; j++) {
				if ((x2 > x1 - 10 && x2 < x1 + 10) && (y2 > y1 - 10 && y2 < y1 + 10)) {
					Boton9.setLocation(Boton7_7.getLocation());
					//							break;	
				}else {
					Boton9.setLocation(p9);
				}
				//					}
				//				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});


		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPanel.class.getResource("/recursos/imagenes/Music.jpg")));
		lblNewLabel_1.setBounds(528, 137, 350, 437);
		panelCentral.add(lblNewLabel_1);

		Boton1_1 = new JButton("");
		Boton1_1.setBackground(Color.WHITE);
		Boton1_1.setEnabled(false);
		Boton1_1.setBounds(955, 162, 100, 100);
		panelCentral.add(Boton1_1);

		Boton2_2 = new JButton("");
		Boton2_2.setBackground(Color.WHITE);
		Boton2_2.setEnabled(false);
		Boton2_2.setBounds(1055, 162, 100, 100);
		panelCentral.add(Boton2_2);

		Boton3_3 = new JButton("");
		Boton3_3.setBackground(Color.WHITE);
		Boton3_3.setEnabled(false);
		Boton3_3.setBounds(1155, 162, 100, 100);
		panelCentral.add(Boton3_3);

		Boton4_4 = new JButton("");
		Boton4_4.setBackground(Color.WHITE);
		Boton4_4.setEnabled(false);
		Boton4_4.setBounds(955, 261, 100, 100);
		panelCentral.add(Boton4_4);

		Boton5_5 = new JButton("");
		Boton5_5.setBackground(Color.WHITE);
		Boton5_5.setEnabled(false);
		Boton5_5.setBounds(1055, 261, 100, 100);
		panelCentral.add(Boton5_5);

		Boton6_6 = new JButton("");
		Boton6_6.setBackground(Color.WHITE);
		Boton6_6.setEnabled(false);
		Boton6_6.setBounds(1155, 261, 100, 100);
		panelCentral.add(Boton6_6);

		Boton7_7 = new JButton("");
		Boton7_7.setBackground(Color.WHITE);
		Boton7_7.setEnabled(false);
		Boton7_7.setBounds(955, 361, 100, 100);
		panelCentral.add(Boton7_7);

		Boton8_8 = new JButton("");
		Boton8_8.setBackground(Color.WHITE);
		Boton8_8.setEnabled(false);
		Boton8_8.setBounds(1055, 361, 100, 100);
		panelCentral.add(Boton8_8);

		Boton9_9 = new JButton("");
		Boton9_9.setBackground(Color.WHITE);
		Boton9_9.setEnabled(false);
		Boton9_9.setBounds(1155, 361, 100, 100);
		panelCentral.add(Boton9_9);

	}
}
