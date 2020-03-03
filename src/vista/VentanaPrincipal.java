package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import dao.IOTool;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton botonCasillas;
	private JButton botonEtiquetas;
	private JButton botonCajas;
	private JButton botonBotones;
	private JButton botonRadio;
	private JPanel panelNorte;
	private JPanel panelSur;
	private JPanel panelMenu;
	private JPanel panelCentro;
	private JButton botonAreas;
	private CalculadoraBasica calculadora;
	private PanelBotones panelBotones;
	private JPanel panelEjemplo;
	private JButton botonEjemplo;

	
	
	
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

	
	
	
	public VentanaPrincipal() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Topicos Avanzados de Programacion");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/recursos/imagenes/balon5.jpg")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelNorte = new JPanel();
		panelNorte.setBackground(new Color(245, 245, 220));
		contentPane.add(panelNorte, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("App Visual Unidad 1");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panelNorte.add(lblNewLabel);
		
		panelSur = new JPanel();
		panelSur.setBackground(new Color(224, 255, 255));
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		panelMenu = new JPanel();
		panelMenu.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Menu Principal", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		panelMenu.setBackground(new Color(245, 245, 220));
		contentPane.add(panelMenu, BorderLayout.WEST);
		panelMenu.setLayout(new GridLayout(6, 1, 0, 20));
		
		
		
		
		
		
		
		botonEtiquetas = new JButton("Etiquetas");
		botonEtiquetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					JFrame v = new JFrame("JEditorPane con HTML");
					     JEditorPane editor = new JEditorPane();
				            JScrollPane scroll = new JScrollPane(editor);
				            v.getContentPane().add(scroll);
				            v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
				            editor.setContentType("text/html");
				            editor.setText("<html>\r\n" + 
				            		"<head>\r\n" + 
				            		"<title>JLabel</title>\r\n" + 
				            		"</head>\r\n" + 
				            		"<body>\r\n" + 
				            		"<center>\r\n" + 
				            		"\r\n" + 
				            		"<h1>JLabel de Java y sus funciones</h1>\r\n" + 
				            		"\r\n" + 
				            		"<p>JLabel es uno de los elementos más simples en modo diseño, se utiliza en múltiples formas<br>\r\n" + 
				            		" como etiqueta, para mostrar imágenes, iconos, texto simple, etc.<br>\r\n" + 
				            		"Los JLabel son textos que podemos colocar en un Frame, pero además de textos podemos colocar<br>\r\n" + 
				            		" imágenes (animadas o no) para darle una buena presentación a nuestra ventana, los JLabel a mi<br>\r\n" + 
				            		" parecer son esenciales al momento de crear una interfaz de usuario<br></p>\r\n" + 
				            		"\r\n" + 
				            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Escritorio\\etiquetas\\usoJLabel03fin.png\" width=\"350\" height=\"250\"><br>\r\n" + 
				            		"\r\n" + 
				            		"<p>¿Como se crea un JLabel?<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel();<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta vacia, sin texto y sin imagen.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(Icon imagen);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con una imagen especificada.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(String texto);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con un texto especificado.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(String texto, Icon imagen, int alineacion);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con imagen y texto especificado con una alineacion horizontal.</p>\r\n" + 
				            		"</center>\r\n" + 
				            		"</body>\r\n" + 
				            		"</html>");
				       //     editor.setPage("file:///C:/Users/gio11/OneDrive/Escritorio/informacion%20Botones.html");
							contentPane.add(editor,BorderLayout.CENTER);
							setVisible(true);
				        }
				        catch (Exception e1)
				        {
				            e1.printStackTrace();
				        }
						
					}});
		botonEtiquetas.setMnemonic(KeyEvent.VK_E);
		botonEtiquetas.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonEtiquetas.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonEtiquetas.setFocusPainted(false);
		botonEtiquetas.setContentAreaFilled(false);
		botonEtiquetas.setBorderPainted(false);
		botonEtiquetas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonEtiquetas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonEtiquetas.setForeground(Color.YELLOW);
		botonEtiquetas.setBackground(new Color(255, 255, 255));
	
		
		botonBotones = new JButton("Botones");
		botonBotones.setContentAreaFilled(false);
		botonBotones.setToolTipText("JButtons ejemplo\r\n");
		botonBotones.setMnemonic(KeyEvent.VK_B);
		botonBotones.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonBotones.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonBotones.setFocusPainted(false);
		botonBotones.setBorderPainted(false);
		botonBotones.setHorizontalTextPosition(SwingConstants.CENTER);
		botonBotones.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonBotones.setForeground(Color.YELLOW);
		botonBotones.setBackground(new Color(255, 255, 255));
		botonBotones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				panelBotones= new PanelBotones(); 
//				contentPane.add(panelBotones,BorderLayout.CENTER);
//				setVisible(true);
				JFileChooser selector=new JFileChooser("C:\\Users\\gio11\\Downloads");
				int seleccion=selector.showOpenDialog(null);
				if (seleccion==JFileChooser.APPROVE_OPTION) {
					File archivo=selector.getSelectedFile();
					List<String> datos=IOTool.getDatos(archivo);
					JOptionPane.showMessageDialog(null, "DATOS");
					JTextArea area=new JTextArea();
					area.setColumns(80);
					area.setRows(40);
					for (String cadena : datos) {
						area.append(cadena);
						
					}
					contentPane.add(area,BorderLayout.CENTER);
					panelEjemplo.setVisible(true);
					setVisible(true);
					
				} else {

				}
				
				
			}
		});
		panelMenu.add(botonBotones);
		
		
		
		
		
		
		
		botonRadio = new JButton("Radios");
		botonRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
				JFrame v = new JFrame("JEditorPane con HTML");
				     JEditorPane editor = new JEditorPane();
			            JScrollPane scroll = new JScrollPane(editor);
			            v.getContentPane().add(scroll);
			            v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
			            editor.setContentType("text/html");
			            editor.setText("<html>\r\n" + 
			            		"<head>\r\n" + 
			            		"<title>JRadioButton</title>\r\n" + 
			            		"</head>\r\n" + 
			            		"<body>\r\n" + 
			            		"<center>\r\n" + 
			            		"<h1>Utilización de RadioButton</h1>\r\n" + 
			            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Documentos\\App Unidad 1\\src\\recursos\\imagenes\\RadioButtonDemo.PNG\" width=\"350\" height=\"250\">\r\n" + 
			            		"<p>Conocido también como botón de opción o botón de radio es un tipo de widget utilizado en interfaces gráficas<br> de usuario que permite elegir una sola opción de un conjunto predeterminado de estas.<br>\r\n" + 
			            		"Los botones de opción (botones de radio) se llaman así en referencia a los botones físicos que se usan en los<br> radios para seleccionar estaciones preajustadas - cuando se presionaba uno de los botones, otro de los botones saltaba.<br></p>\r\n" + 
			            		"\r\n" + 
			            		"<p>Un aspecto interesante de los botones de opción, cuando se utilizan en un formulario HTML, es que si no se<br> marca ningún botón en un grupo, entonces no se pasa ningún par nombre-valor cuando se<br>\r\n" + 
			            		" envía el formulario. Por ejemplo, para un grupo de botones de opción llamado Sexo, con las opciones de<br> Masculino y Femenino, la variable Sexo no pasaría, ni siquiera con un valor en blanco.<br></p>\r\n" + 
			            		"\r\n" + 
			            		"<p>Este es un ejemplo común de un RadioButton en donde sólo se permitirá seleccionar un elemento de la lista definida<br> previamente por el Programador:</p>\r\n" + 
			            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Documentos\\App Unidad 1\\src\\recursos\\imagenes\\Radio_button.png\" width=\"50\" height=\"100\">\r\n" + 
			            		"</center>\r\n" + 
			            		"\r\n" + 
			            		"</body>\r\n" + 
			            		"</html>");
			       //     editor.setPage("file:///C:/Users/gio11/OneDrive/Escritorio/informacion%20Botones.html");
						contentPane.add(editor,BorderLayout.CENTER);
						setVisible(true);
			        }
			        catch (Exception e1)
			        {
			            e1.printStackTrace();
			        }
					
				}});

		botonRadio.setMnemonic(KeyEvent.VK_R);
		botonRadio.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonRadio.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonRadio.setFocusPainted(false);
		botonRadio.setContentAreaFilled(false);
		botonRadio.setBorderPainted(false);
		botonRadio.setHorizontalTextPosition(SwingConstants.CENTER);
		botonRadio.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonRadio.setForeground(Color.YELLOW);
		botonRadio.setBackground(new Color(255, 255, 255));
		panelMenu.add(botonRadio);
		panelMenu.add(botonEtiquetas);
		
		botonCasillas = new JButton("CheckBox");
		botonCasillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try { 
				JFrame v = new JFrame("JEditorPane con HTML");
			     JEditorPane editor = new JEditorPane();
		            JScrollPane scroll = new JScrollPane(editor);
		            v.getContentPane().add(scroll);
		            v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		            editor.setContentType("text/html");
		            editor.setText("<html>\r\n" + 
		            		"<head>\r\n" + 
		            		"<title>JCheck Box de java</title>\r\n" + 
		            		"</head>\r\n" + 
		            		"<body>\r\n" + 
		            		"<center>\r\n" + 
		            		"\r\n" + 
		            		"<h1>JCheck Box de Java y sus funciones</h1><br>\r\n" + 
		            		"<h3>¿Qué es un CheckBox?</h3><br>\r\n" + 
		            		"\r\n" + 
		            		"<p>que son Casillas de verificación que permiten al usuario seleccionar una o mas <br>\r\n" + 
		            		"de las opciones propuestas, ideales en aplicaciones con preguntas de selección múltiple<br>\r\n" + 
		            		" con múltiples respuestas (Api de Java).</p><br>\r\n" + 
		            		"\r\n" + 
		            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Escritorio\\check box\\check Box im.jpeg\" width=\"350\" height=\"250\"><br>\r\n" + 
		            		"\r\n" + 
		            		"<p>Los CheckBox (botones de comprobación) se utilizan generalmente como botones de estado.<br>\r\n" + 
		            		" Es decir proporcionan información del tipo Sí o No. El estado del botón se devuelve en el argumento<br>\r\n" + 
		            		" Object de los eventos Checkbox; el argumento es de tipo booleano: verdadero (true) si la caja se ha<br>\r\n" + 
		            		" seleccionado y falso (false) en otro caso.<br>\r\n" + 
		            		"Tanto el nombre como el estado se devuelven en el argumento del evento, aunque se <br>\r\n" + 
		            		"pueden obtener a través de los métodos getLabel() y getState() del objeto Checkbox.<br></p>\r\n" + 
		            		"</center>\r\n" + 
		            		"</body>\r\n" + 
		            		"</html>");
		       //     editor.setPage("file:///C:/Users/gio11/OneDrive/Escritorio/informacion%20Botones.html");
					contentPane.add(editor,BorderLayout.CENTER);
					setVisible(true);
		        }
		        catch (Exception e1)
		        {
		            e1.printStackTrace();
		        }
				
			}});		botonCasillas.setMnemonic(KeyEvent.VK_C);
		botonCasillas.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonCasillas.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonCasillas.setFocusPainted(false);
		botonCasillas.setContentAreaFilled(false);
		botonCasillas.setBorderPainted(false);
		botonCasillas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCasillas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonCasillas.setForeground(Color.YELLOW);
		botonCasillas.setBackground(new Color(255, 255, 255));
		panelMenu.add(botonCasillas);
		
		
		
		
		
		botonCajas = new JButton("Cajas");
		botonCajas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					JFrame v = new JFrame("JEditorPane con HTML");
					     JEditorPane editor = new JEditorPane();
				            JScrollPane scroll = new JScrollPane(editor);
				            v.getContentPane().add(scroll);
				            v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
				            editor.setContentType("text/html");
				            editor.setText("<html>\r\n" + 
				            		"<head>\r\n" + 
				            		"<title>JTextField de java</title>\r\n" + 
				            		"</head>\r\n" + 
				            		"<body>\r\n" + 
				            		"<center>\r\n" + 
				            		"\r\n" + 
				            		"<h1>JTextField de Java y sus funciones</h1><br>\r\n" + 
				            		"\r\n" + 
				            		"<p>Los campos de texto (JTextField) son componentes gráficos muy importantes<br>\r\n" + 
				            		" en la construcción de interfaces para cualquier tipo de aplicación en Java, nos permite<br>\r\n" + 
				            		" suministrarle al usuario un espacio donde colocar datos, para luego realizar diversas<br>\r\n" + 
				            		" actividades con dichos datos ingresados</p><br>\r\n" + 
				            		"<h3>Como usar JTextField en Java</h3>\r\n" + 
				            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Escritorio\\cajas\\mwkey.png\" width=\"200\" height=\"250\"><br>\r\n" + 
				            		"\r\n" + 
				            		"<p>Primero que todo debemos definir las funcionalidades principales de un JTextField en Java y estas son:<br>\r\n" + 
				            		"Obtener datos: Posibilidad para que el usuario escriba un valor solicitado.<br>\r\n" + 
				            		"Mostrar datos: Posibilidad de mostrar al usuario un valor.<br>\r\n" + 
				            		"Estas son las dos funciones principales para lo cual hacemos uso de los JTextfield, cuando hablamos<br>\r\n" + 
				            		" de obtener datos, hacemos referencia a usar los datos que el usuario ingresa en el campo de texto para<br>\r\n" + 
				            		" realizar algún procesamiento, cálculos, etc. Cuando hablamos de mostrar datos hacemos referencia<br>\r\n" + 
				            		" a asignarle un valor al campo de texto para informar al usuario, ejemplo cuando tenemos el valor de<br>\r\n" + 
				            		" una factura, este puede ser mostrado en un campo de texto para que el usuario sepa su valor.</p><br>\r\n" + 
				            		"</center>\r\n" + 
				            		"</body>\r\n" + 
				            		"</html>");
				       //     editor.setPage("file:///C:/Users/gio11/OneDrive/Escritorio/informacion%20Botones.html");
							contentPane.add(editor,BorderLayout.CENTER);
							setVisible(true);
				        }
				        catch (Exception e1)
				        {
				            e1.printStackTrace();
				        }
						
					}});
		botonCajas.setMnemonic(KeyEvent.VK_J);
		botonCajas.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonCajas.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonCajas.setFocusPainted(false);
		botonCajas.setContentAreaFilled(false);
		botonCajas.setBorderPainted(false);
		botonCajas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonCajas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonCajas.setForeground(Color.YELLOW);
		botonCajas.setBackground(new Color(255, 255, 255));
		panelMenu.add(botonCajas);
		
		botonAreas = new JButton("Areas");
		botonAreas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					JFrame v = new JFrame("JEditorPane con HTML");
					     JEditorPane editor = new JEditorPane();
				            JScrollPane scroll = new JScrollPane(editor);
				            v.getContentPane().add(scroll);
				            v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
				            editor.setContentType("text/html");
				            editor.setText("<html>\r\n" + 
				            		"<head>\r\n" + 
				            		"<title>JButton</title>\r\n" + 
				            		"</head>\r\n" + 
				            		"<body>\r\n" + 
				            		"<center>\r\n" + 
				            		"\r\n" + 
				            		"<h1>JLabel de Java y sus funciones</h1>\r\n" + 
				            		"\r\n" + 
				            		"<p>JLabel es uno de los elementos más simples en modo diseño, se utiliza en múltiples formas<br>\r\n" + 
				            		" como etiqueta, para mostrar imágenes, iconos, texto simple, etc.<br>\r\n" + 
				            		"Los JLabel son textos que podemos colocar en un Frame, pero además de textos podemos colocar<br>\r\n" + 
				            		" imágenes (animadas o no) para darle una buena presentación a nuestra ventana, los JLabel a mi<br>\r\n" + 
				            		" parecer son esenciales al momento de crear una interfaz de usuario<br></p>\r\n" + 
				            		"\r\n" + 
				            		"<img src=\"file:C:\\Users\\gio11\\OneDrive\\Escritorio\\etiquetas\\usoJLabel03fin.png\" width=\"350\" height=\"250\"><br>\r\n" + 
				            		"\r\n" + 
				            		"<p>¿Como se crea un JLabel?<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel();<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta vacia, sin texto y sin imagen.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(Icon imagen);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con una imagen especificada.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(String texto);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con un texto especificado.<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"JLabel etiqueta=new JLabel(String texto, Icon imagen, int alineacion);<br>\r\n" + 
				            		"\r\n" + 
				            		"\r\n" + 
				            		"Esto crea una etiqueta con imagen y texto especificado con una alineacion horizontal.</p>\r\n" + 
				            		"</center>\r\n" + 
				            		"</body>\r\n" + 
				            		"</html>");
				       //     editor.setPage("file:///C:/Users/gio11/OneDrive/Escritorio/informacion%20Botones.html");
							contentPane.add(editor,BorderLayout.CENTER);
							setVisible(true);
				        }
				        catch (Exception e1)
				        {
				            e1.printStackTrace();
				        }
						
					}});
		botonAreas.setMnemonic(KeyEvent.VK_A);
		botonAreas.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonAreas.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonAreas.setFocusPainted(false);
		botonAreas.setContentAreaFilled(false);
		botonAreas.setBorderPainted(false);
		botonAreas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonAreas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		botonAreas.setForeground(Color.YELLOW);
		botonAreas.setBackground(new Color(255, 255, 255));
		panelMenu.add(botonAreas);
		
		
		
		
		
		
		
		panelCentro = new JPanel();
		panelCentro.setBackground(new Color(224, 255, 255));
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BorderLayout(0, 0));
		
		panelEjemplo = new JPanel();
		panelEjemplo.setVisible(false);
		panelEjemplo.setBackground(new Color(253, 245, 230));
		panelCentro.add(panelEjemplo, BorderLayout.SOUTH);
		
		botonEjemplo = new JButton("Ir a Ejemplo");
		botonEjemplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora=new CalculadoraBasica();
				 calculadora.setVisible(true);
			}
		});
		botonEjemplo.setFocusable(false);
		botonEjemplo.setPressedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAmarillo.gif")));
		botonEjemplo.setRolloverIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonRojo.gif")));
		botonEjemplo.setForeground(new Color(255, 255, 0));
		botonEjemplo.setHorizontalTextPosition(SwingConstants.CENTER);
		botonEjemplo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/recursos/imagenes/botonAzul.gif")));
		panelEjemplo.add(botonEjemplo);
	}
	
	
	
	private class OyenteBotones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Scanner entrada;
			File archivo=new File("src/recursos/archivos/Botones");
			try {
				entrada=new Scanner(archivo);
				String contenido="";
				while (entrada.hasNextLine()) {
					contenido+=entrada.nextLine();
					contenido+="\n";
					//visualisar en un jtextarea
				}
				System.out.println(contenido);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} 
	}
	
	
	
	
	
	
}
