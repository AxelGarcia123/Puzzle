package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import java.awt.Frame;


public class CalculadoraBasica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private double primerNum;
	private double segundoNum;
	private String operacion;
	private double resultado;
	private String respuesta="";
	private Color color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public CalculadoraBasica() {
		setBackground(new Color(255, 255, 204));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/recursos/imagenes/images.png")));
		setType(Type.POPUP);
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 294, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField.setBorder(null);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 258, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
	

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_1.setBorder(null);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(10, 37, 258, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		

		JButton botonCambioSigno = new JButton("+/-");
		botonCambioSigno.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		//botonCambioSigno.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/WhatsApp Image 2019-02-23 at 11.50.47 PM.jpeg")));
		botonCambioSigno.setSelected(true);
		botonCambioSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField_1.getText()));
				ops=ops*(-1);
				textField_1.setText(String.valueOf(ops));
			}
		});
		botonCambioSigno.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCambioSigno.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCambioSigno.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCambioSigno.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonCambioSigno.setBounds(10, 347, 64, 50);
		contentPane.add(botonCambioSigno);

		JButton botonCero = new JButton("0");
		botonCero.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCero.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonCero.setSelected(true);
		botonCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonCero.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonCero.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCero.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCero.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCero.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCero.setBounds(75, 347, 64, 50);
		contentPane.add(botonCero);

		JButton botonPunto = new JButton(".");
		botonPunto.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/WhatsApp Image 2019-02-23 at 11.50.47 PM.jpeg")));
		botonPunto.setSelected(true);
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonPunto.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonPunto.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonPunto.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonPunto.setHorizontalTextPosition(SwingConstants.CENTER);
		botonPunto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonPunto.setBounds(140, 347, 64, 50);
		contentPane.add(botonPunto);

		JButton botonIgual = new JButton("=");
		botonIgual.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonIgual.setSelected(true);
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(operacion);
				if (operacion=="+") {
					System.out.println(textField_1.getText());
					if (!(textField_1.getText().length()==0)) {
						segundoNum=Double.parseDouble(textField_1.getText());
						System.out.println(segundoNum);
						resultado=primerNum + segundoNum;
						System.out.println(primerNum);
						String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
						textField.setText(ventana);
						textField_1.setText(Double.toString(resultado));
					}else {
						JOptionPane.showMessageDialog(null, "operacion invalida noob");
					}
				
					
				}else 
					if (operacion=="-") {
						if (!(textField_1.getText().length()==0)) {
							segundoNum=Double.parseDouble(textField_1.getText());
							resultado=primerNum - segundoNum;
							String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
					}
					else if (operacion=="*") {
						if (!(textField_1.getText().length()==0)) {
							segundoNum=Double.parseDouble(textField_1.getText());
							resultado=primerNum * segundoNum;
							String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
				
					}
					else if (operacion=="/") {
						if (!(textField_1.getText().length()==0)) {
							segundoNum=Double.parseDouble(textField_1.getText());
							resultado=primerNum / segundoNum;
							String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
						
					}
					else if (operacion=="%") {
						if (!(textField_1.getText().length()==0)) {
							segundoNum=Double.parseDouble(textField_1.getText());
							resultado=primerNum % segundoNum;
							String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
						
					}
					else if (operacion=="\u221A") {//raiz
						if (!(primerNum==0)) {
							resultado=Math.sqrt(primerNum);
							String ventana=operacion+Double.toString(primerNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
					}
					else if (operacion=="x\u00B2") {//potencia
						if (!(primerNum==0)) {
							resultado=Math.pow(primerNum, 2);
							String ventana=Double.toString(primerNum)+operacion;
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
					}
					else if (operacion=="1/x") {//inversa
						
						if (!(primerNum==0)) {
							resultado=1/primerNum;
							String ventana="1/"+Double.toString(primerNum);
							textField.setText(ventana);
						textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
						
					        
					}else if(operacion=="^") {
						if (!(textField_1.getText().length()==0)) {
							segundoNum=Integer.parseInt(textField_1.getText());
							double resultado=1.0;
							for (int i = 1; i <=segundoNum; i++) {
								resultado=resultado*primerNum;
							}
							String ventana=Double.toString(primerNum)+operacion+Double.toString(segundoNum);
							textField.setText(ventana);
							textField_1.setText(Double.toString(resultado));
						}else {
							JOptionPane.showMessageDialog(null, "operacion invalida noob");
						}
						
						
					}
			}
		});
		botonIgual.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonIgual.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonIgual.setHorizontalTextPosition(SwingConstants.CENTER);
		botonIgual.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonIgual.setBounds(204, 347, 64, 50);
		contentPane.add(botonIgual);

		JButton botonUno = new JButton("1");
		botonUno.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonUno.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonUno.setSelected(true);
		botonUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonUno.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonUno.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonUno.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonUno.setHorizontalTextPosition(SwingConstants.CENTER);
		botonUno.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonUno.setBounds(10, 296, 64, 50);
		contentPane.add(botonUno);

		JButton botonDos = new JButton("2");
		botonDos.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonDos.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonDos.setSelected(true);
		botonDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonDos.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonDos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonDos.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonDos.setHorizontalTextPosition(SwingConstants.CENTER);
		botonDos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonDos.setBounds(75, 296, 64, 50);
		contentPane.add(botonDos);

		JButton botonTres = new JButton("3");
		botonTres.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonTres.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonTres.setSelected(true);
		botonTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonTres.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonTres.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonTres.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonTres.setHorizontalTextPosition(SwingConstants.CENTER);
		botonTres.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonTres.setBounds(140, 296, 64, 50);
		contentPane.add(botonTres);

		JButton botonSuma = new JButton("+");
		botonSuma.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonSuma.setSelected(true);
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="+";
			}
		});
		botonSuma.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonSuma.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonSuma.setHorizontalTextPosition(SwingConstants.CENTER);
		botonSuma.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonSuma.setBounds(204, 296, 64, 50);
		contentPane.add(botonSuma);

		JButton botonCuatro = new JButton("4");
		botonCuatro.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCuatro.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonCuatro.setSelected(true);
		botonCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonCuatro.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonCuatro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCuatro.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCuatro.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCuatro.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCuatro.setBounds(10, 245, 64, 50);
		contentPane.add(botonCuatro);

		JButton botonCinco = new JButton("5");
		botonCinco.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCinco.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonCinco.setSelected(true);
		botonCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonCinco.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonCinco.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCinco.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCinco.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCinco.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonCinco.setBounds(75, 245, 64, 50);
		contentPane.add(botonCinco);

		JButton botonSeis = new JButton("6");
		botonSeis.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonSeis.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonSeis.setSelected(true);
		botonSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonSeis.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonSeis.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonSeis.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonSeis.setHorizontalTextPosition(SwingConstants.CENTER);
		botonSeis.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonSeis.setBounds(140, 245, 64, 50);
		contentPane.add(botonSeis);

		JButton botonResta = new JButton("-");
		botonResta.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonResta.setSelected(true);
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="-";
			}
		});
		botonResta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonResta.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonResta.setHorizontalTextPosition(SwingConstants.CENTER);
		botonResta.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonResta.setBounds(204, 245, 64, 50);
		contentPane.add(botonResta);

		JButton botonSiete = new JButton("7");
		botonSiete.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonSiete.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonSiete.setSelected(true);
		botonSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonSiete.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonSiete.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonSiete.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonSiete.setHorizontalTextPosition(SwingConstants.CENTER);
		botonSiete.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonSiete.setBounds(10, 194, 64, 50);
		contentPane.add(botonSiete);

		JButton botonOcho = new JButton("8");
		botonOcho.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonOcho.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonOcho.setSelected(true);
		botonOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonOcho.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonOcho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonOcho.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonOcho.setHorizontalTextPosition(SwingConstants.CENTER);
		botonOcho.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonOcho.setBounds(75, 194, 64, 50);
		contentPane.add(botonOcho);

		JButton botonNueve = new JButton("9");
		botonNueve.setSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonNueve.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonNueve.setSelected(true);
		botonNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteroNumero= textField_1.getText() +  botonNueve.getText();
				textField_1.setText(enteroNumero);
			}
		});
		botonNueve.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonNueve.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonNueve.setHorizontalTextPosition(SwingConstants.CENTER);
		botonNueve.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/White-geometric-shapes-backgrounds-vector-set-04.jpg")));
		botonNueve.setBounds(140, 194, 64, 50);
		contentPane.add(botonNueve);

		JButton botonMultiplicacion = new JButton("*");
		botonMultiplicacion.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonMultiplicacion.setSelected(true);
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="*";
			}
		});
		botonMultiplicacion.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonMultiplicacion.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonMultiplicacion.setHorizontalTextPosition(SwingConstants.CENTER);
		botonMultiplicacion.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonMultiplicacion.setBounds(204, 194, 64, 50);
		contentPane.add(botonMultiplicacion);

		JButton botonCorregir = new JButton("CE");
		botonCorregir.setBackground(new Color(255, 255, 255));
		botonCorregir.setForeground(Color.WHITE);
		botonCorregir.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/WhatsApp Image 2019-02-23 at 11.50.47 PM.jpeg")));
		botonCorregir.setSelected(true);
		botonCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String espacio=null;
				if (textField_1.getText().length()>0) {
					StringBuilder strb=new StringBuilder(textField_1.getText());
					strb.deleteCharAt(textField_1.getText().length()-1);
					espacio=strb.toString();
					textField_1.setText(espacio);
				} else {

				}
			}
		});
		botonCorregir.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCorregir.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCorregir.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCorregir.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/18.png")));
		botonCorregir.setBounds(10, 143, 64, 50);
		contentPane.add(botonCorregir);

		JButton botonBorrar = new JButton("C");
		botonBorrar.setForeground(Color.WHITE);
		botonBorrar.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/WhatsApp Image 2019-02-23 at 11.50.47 PM.jpeg")));
		botonBorrar.setSelected(true);
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText("0");
				
			}
		});
		botonBorrar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonBorrar.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
		botonBorrar.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/18.png")));
		botonBorrar.setBounds(75, 143, 64, 50);
		contentPane.add(botonBorrar);

		JButton botonCubo = new JButton("^");
		botonCubo.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonCubo.setSelected(true);
		botonCubo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="^";
			}
		});
		botonCubo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonCubo.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonCubo.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCubo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonCubo.setBounds(140, 143, 64, 50);
		contentPane.add(botonCubo);

		JButton botonDivision = new JButton("/");
		botonDivision.setRolloverSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonDivision.setSelected(true);
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="/";
			}
		});
		botonDivision.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonDivision.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonDivision.setHorizontalTextPosition(SwingConstants.CENTER);
		botonDivision.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonDivision.setBounds(204, 143, 64, 50);
		contentPane.add(botonDivision);

		JButton botonPorcentaje = new JButton("%");
		botonPorcentaje.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonPorcentaje.setSelected(true);
		botonPorcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="%";
			}
		});
		botonPorcentaje.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonPorcentaje.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonPorcentaje.setHorizontalTextPosition(SwingConstants.CENTER);
		botonPorcentaje.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonPorcentaje.setBounds(10, 91, 64, 50);
		contentPane.add(botonPorcentaje);

		JButton botonRaiz = new JButton("\u221A");
		botonRaiz.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonRaiz.setSelected(true);
		botonRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Integer.parseInt(textField_1.getText());
				textField_1.setText("");
				operacion="\u221A";
				
			}
		});
		botonRaiz.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonRaiz.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonRaiz.setHorizontalTextPosition(SwingConstants.CENTER);
		botonRaiz.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonRaiz.setBounds(75, 91, 64, 50);
		contentPane.add(botonRaiz);

		JButton botonPotencia = new JButton("x\u00B2");
		botonPotencia.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonPotencia.setSelected(true);
		botonPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="x\u00B2";
			}
		});
		botonPotencia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonPotencia.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonPotencia.setHorizontalTextPosition(SwingConstants.CENTER);
		botonPotencia.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonPotencia.setBounds(140, 91, 64, 50);
		contentPane.add(botonPotencia);

		JButton botonInversa = new JButton("1/x");
		botonInversa.setRolloverSelectedIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/fondo-azul-degradado-oscuro_1258-1348.jpg")));
		botonInversa.setSelected(true);
		botonInversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operacion="1/x";
			}
		});
		botonInversa.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		botonInversa.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		botonInversa.setHorizontalTextPosition(SwingConstants.CENTER);
		botonInversa.setIcon(new ImageIcon(CalculadoraBasica.class.getResource("/recursos/imagenes/80445666-resumen-textura-de-m\u00E1rmol-de-fantas\u00EDa-fondo-fractal-rom\u00E1ntico-en-colores-pastel-rosa-y-azul-arte-digital-r.jpg")));
		botonInversa.setBounds(204, 91, 64, 50);
		contentPane.add(botonInversa);
	}
}

