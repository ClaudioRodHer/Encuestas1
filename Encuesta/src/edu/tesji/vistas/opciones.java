package edu.tesji.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class opciones extends JFrame implements ActionListener{
	private JPanel pnlNorte;
	private JPanel pnlOeste;
	private JPanel pnlCentro;
	private JPanel pnlEste;
	private JPanel pnlSur;
	
	private frmgrafica frmgrf;
	private PieFrame frmpastel;
	private frmpuntos frmpun;
	
	private JButton btnbarras;
	private JButton btnPuntos;
	private JButton btnPastel;
	private JButton btnnuevo;
	private JButton btnsalir;
	
	private JLabel lbltipos;
	
	public opciones() {
		super("tipo de grafica");
		Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/tesji/vistas/imagenes/iconoframe.jpg"));
		setIconImage(icono);
		setVisible(true);
		//objetos creados
		
		lbltipos=new JLabel("Selecciona el tipo  de grafica:");
		btnbarras=new JButton("Barras");
		btnPuntos=new JButton("Puntos");
		btnPastel=new JButton("Pastel");
		btnnuevo= new JButton("Nuevo Grafico");
		btnsalir=new JButton("Salir");
		
		
		setLayout(new BorderLayout());
					// paneles
		
		//centro
		pnlCentro = new JPanel();
		pnlCentro.setLayout(new FlowLayout());
		pnlCentro.setBackground(Color.black);
		add(pnlCentro,BorderLayout.CENTER);
		//btnbarras.setIcon(new ImageIcon(opciones.class.getResource("/edu/tesji/vistas/imagenes/images.png")));
		//iconos
		ImageIcon barras =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/barras1.png"));
		ImageIcon pastel =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/pastel.png"));
		ImageIcon puntos =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/puntos.png"));
		ImageIcon nuevo =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/nuevo1.png"));
		ImageIcon salir =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/salida.png"));
		
		
		pnlCentro.add(btnbarras);
		pnlCentro.add(btnPuntos);
		pnlCentro.add(btnPastel);
		pnlCentro.add(btnnuevo);
		pnlCentro.add(btnsalir);
		//imagenes
		btnbarras.setIcon(barras);
		btnPastel.setIcon(pastel);
		btnPuntos.setIcon(puntos);
		btnnuevo.setIcon(nuevo);
		btnsalir.setIcon(salir);
		//color de boton
		btnbarras.setForeground(Color.white);
		btnbarras.setBackground(Color.darkGray);
		
		btnPastel.setForeground(Color.white);
		btnPastel.setBackground(Color.darkGray);
		
		btnPuntos.setForeground(Color.white);
		btnPuntos.setBackground(Color.darkGray);
		
		btnnuevo.setForeground(Color.white);
		btnnuevo.setBackground(Color.darkGray);
		
		btnsalir.setForeground(Color.white);
		btnsalir.setBackground(Color.darkGray);
		
		//Norte
		pnlNorte= new JPanel();
		pnlNorte.setLayout(new FlowLayout());
		pnlNorte.setBackground(Color.black);
		add(pnlNorte,BorderLayout.NORTH);
		lbltipos.setForeground(Color.white);
		pnlNorte.add(lbltipos);
		
	
		
		//sur
		pnlSur = new JPanel();
		pnlSur.setLayout(new FlowLayout());
		pnlSur.setBackground(Color.black);
		add(pnlSur,BorderLayout.SOUTH); 
		
		//este
		pnlEste= new JPanel();
		pnlEste.setLayout(new FlowLayout());
		pnlEste.setBackground(Color.black);
		add(pnlEste,BorderLayout.EAST);
		
		//oeste
		pnlOeste= new JPanel();
		pnlOeste.setLayout(new FlowLayout());
		pnlOeste.setBackground(Color.black);
		add(pnlOeste,BorderLayout.WEST);
		
		btnbarras.addActionListener(this);
		btnPuntos.addActionListener(this);
		btnPastel.addActionListener(this);
		btnnuevo.addActionListener(this);
		btnsalir.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//no va ha hacer nada
		pack();
		//(posicionancho,posicion alto, ancho del gui,alto del gui)
		setBounds(550,300,340,250); //da la posicion y el tamaño 
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnbarras)){
			frmgrf = new frmgrafica();
		}else if(e.getSource().equals(btnPastel)){
			frmpastel=new PieFrame();
		}else if(e.getSource().equals(btnPuntos)){
			frmpun=new frmpuntos();
		}else if(e.getSource().equals(btnnuevo)){
			setVisible(false);
			new GUI_Encuesta();
		}else if(e.getSource().equals(btnsalir)){
			JOptionPane.showMessageDialog(null,"hasta la proxima");		
			System.exit(1);
		}
	}

}
