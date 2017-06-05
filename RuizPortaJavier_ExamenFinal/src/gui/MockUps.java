package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;

import org.eclipse.swt.events.DisposeEvent;

import Controlador.Control;
import models.Coche;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

public class MockUps {

	private JFrame frame;
	private JTextField txtMatricula;
	private JTextField HoraEntrada;
	private JTextField Matricula2;
	private JTextField HoraSalida;
	private JTextField ImporteEntregado;
	private JPanel Panel_Botones;
	private JPanel PanelPago;
	private JToggleButton BotonEntrada;
	private JToggleButton BotonSalida;
	private JToggleButton BotonCajaTotal;
	private JPanel PanelEntrada;
	private JLabel lblInserteLaMatricula;
	private JButton BotonRegistrar;
	private JLabel TotalAPagar;
	private JLabel CantidadTotal;
	private JLabel Cambio;
	private JLabel CantidadCambio;
	private JButton BotonPagarSalir;
	private float Minuto2;
	private float Minuto1;
	private JLabel LabelSalida;
	private JLabel LabelEntrada;
	private JButton BotonCalcular;
	private float total;
	private float Vuelta;
	private float importe;
	private JButton BotonCalcularCambio;
	
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MockUps window = new MockUps();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MockUps() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Paneles
		
		PanelPago = new JPanel();
		PanelPago.setBounds(10, 148, 756, 480);
		frame.getContentPane().add(PanelPago);
		PanelPago.setLayout(null);
		PanelPago.setVisible(false);
		
		PanelEntrada = new JPanel();
		PanelEntrada.setBounds(10, 148, 756, 312);
		PanelEntrada.setToolTipText("");
		frame.getContentPane().add(PanelEntrada);
		PanelEntrada.setLayout(null);
		
		
		Panel_Botones = new JPanel();
		Panel_Botones.setBounds(10, 11, 756, 126);
		frame.getContentPane().add(Panel_Botones);
		Panel_Botones.setLayout(null);
		
		
	
		
		//Botones
		
		
		BotonEntrada = new JToggleButton("ENTRADA \n " + "VEHICULO ");
		BotonEntrada.setSelected(true);
		BotonEntrada.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		BotonEntrada.setBounds(10, 11, 233, 104);
		Panel_Botones.add(BotonEntrada);
		
		BotonSalida = new JToggleButton("PAGO Y SALIDA " + "\nDE VEHICULOS");
		BotonSalida.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		BotonSalida.setBounds(266, 11, 233, 104);
		Panel_Botones.add(BotonSalida);
		
		BotonCajaTotal = new JToggleButton("CAJA TOTAL");
		BotonCajaTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		BotonCajaTotal.setBounds(523, 11, 233, 104);
		Panel_Botones.add(BotonCajaTotal);
		
		BotonRegistrar = new JButton("REGISTRAR");
		BotonRegistrar.setBounds(395, 192, 304, 109);
		BotonRegistrar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		PanelEntrada.add(BotonRegistrar);
		
		BotonPagarSalir = new JButton("PAGAR Y SALIR PARKING");
		BotonPagarSalir.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		BotonPagarSalir.setBounds(96, 342, 248, 127);
		PanelPago.add(BotonPagarSalir);
		
		BotonCalcular = new JButton("Calcular");
		BotonCalcular.setBounds(602, 155, 89, 23);
		PanelPago.add(BotonCalcular);
		
		BotonCalcularCambio = new JButton("Calcular");
		BotonCalcularCambio.setBounds(577, 446, 89, 23);
		PanelPago.add(BotonCalcularCambio);
		
		//Cajas de Texto
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(128, 56, 428, 103);
		txtMatricula.setToolTipText("");
		txtMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatricula.setFont(new Font("Comic Sans MS", Font.BOLD, 41));
		PanelEntrada.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		ImporteEntregado = new JTextField();
		ImporteEntregado.setHorizontalAlignment(SwingConstants.CENTER);
		ImporteEntregado.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		ImporteEntregado.setBounds(415, 254, 304, 71);
		PanelPago.add(ImporteEntregado);
		ImporteEntregado.setColumns(10);
		
		Matricula2 = new JTextField();
		Matricula2.setBounds(96, 11, 248, 62);
		PanelPago.add(Matricula2);
		Matricula2.setColumns(10);
		
		HoraEntrada = new JTextField();
		HoraEntrada.setColumns(10);
		HoraEntrada.setBounds(96, 135, 248, 62);
		PanelPago.add(HoraEntrada);
		
		HoraSalida = new JTextField();
		HoraSalida.setBounds(96, 260, 248, 62);
		PanelPago.add(HoraSalida);
		HoraSalida.setColumns(10);
		
		
		//Label
		
		lblInserteLaMatricula = new JLabel("*Inserte la matricula");
		lblInserteLaMatricula.setBounds(128, 39, 410, 17);
		lblInserteLaMatricula.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		PanelEntrada.add(lblInserteLaMatricula);
		
		TotalAPagar = new JLabel("Total a pagar");
		TotalAPagar.setHorizontalAlignment(SwingConstants.CENTER);
		TotalAPagar.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		TotalAPagar.setBounds(566, 56, 180, 42);
		PanelPago.add(TotalAPagar);
		
		CantidadTotal = new JLabel("0");
		CantidadTotal.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		CantidadTotal.setBounds(632, 109, 46, 31);
		PanelPago.add(CantidadTotal);
		
		Cambio = new JLabel("Cambio");
		Cambio.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		Cambio.setBounds(426, 342, 182, 45);
		PanelPago.add(Cambio);
		
		CantidadCambio = new JLabel("0");
		CantidadCambio.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadCambio.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		CantidadCambio.setBounds(436, 398, 182, 45);
		PanelPago.add(CantidadCambio);
		
		LabelSalida = new JLabel("*Hora Salida Minutos");
		LabelSalida.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
		LabelSalida.setBounds(96, 235, 168, 14);
		PanelPago.add(LabelSalida);
		
		LabelEntrada = new JLabel("*Hora Entrada Minutos");
		LabelEntrada.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
		LabelEntrada.setBounds(96, 120, 168, 14);
		PanelPago.add(LabelEntrada);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Acciones de Botones
		
		
		
		BotonEntrada.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				PanelPago.setVisible(false);
				PanelEntrada.setVisible(true);
				JOptionPane.showMessageDialog(null, "No me dio tiempo a hacer esta parte", "MAL", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		
		BotonCajaTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				PanelPago.setVisible(false);
				PanelEntrada.setVisible(false);
				BotonEntrada.setSelected(false);
			}
		});
		
		BotonRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try{
					Control.Aniadir( txtMatricula.getText());
					
							
					
					JOptionPane.showMessageDialog(null, "Se añadio con exito el vehiculo", "AÑADIR VEHICULO", JOptionPane.INFORMATION_MESSAGE);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR AL AÑADIR VEHICULO", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		BotonSalida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				RellenarFormulario();
				PanelEntrada.setVisible(false);
				PanelPago.setVisible(true);
				BotonEntrada.setSelected(false);
				
				
			}
		});
		
		BotonCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				float tiempo = 0;
				
				Minuto1 = (float) Long.parseLong(HoraEntrada.getText());
				Minuto2 = (float) Long.parseLong(HoraSalida.getText());
				
				tiempo = Minuto1 + Minuto2;
				
				
				
				if(tiempo <= 30){
					total = (float) (tiempo * 0.6);
				}else if(tiempo <= 60){
					total = (float) (tiempo * 0.1);
				}else if(tiempo <= 720){
					total = (float) (tiempo * 0.3);
					
				}
				
				
				
			
				
				CantidadTotal.setText(total + "€");
				
			}
		});
		
		BotonCalcularCambio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				importe = (float) Long.parseLong(ImporteEntregado.getText());
				
				
				Vuelta = importe - total;
				CantidadCambio.setText(Vuelta + "€");
				
			}
		});
		
		
		//Cambiamos Hora de entrada y salida y  importe entregado para asignarle numeros a la hora de calucalr el total
		
		HoraEntrada.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
		                if (((caracter < '0') || (caracter > '9'))
		                        && (caracter != '\b')) {
		                	e.consume();
		                }
			}
		});
		HoraSalida.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
		                if (((caracter < '0') || (caracter > '9'))
		                        && (caracter != '\b')) {
		                	e.consume();
		                }
			}
		});
		ImporteEntregado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
		                if (((caracter < '0') || (caracter > '9'))
		                        && (caracter != '\b')) {
		                	e.consume();
		                }
			}
		});
		
	}
	
	
	
	
	

	
	public void RellenarFormulario(){
		//Rellenar 
		
				Matricula2.setEnabled(false);
				Matricula2.setText(txtMatricula.getText());
				
		
	}
	
}
