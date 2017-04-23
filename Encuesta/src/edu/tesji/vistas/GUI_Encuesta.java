package edu.tesji.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI_Encuesta extends JFrame implements ActionListener{
	private JPanel pnlNorte;
	private JPanel pnlOeste;
	private JPanel pnlCentro;
	private JPanel pnlEste;
	private JPanel pnlSur;
	private frmgrafica frmgrf;
	private JButton btnAbrirEncuesta;
	private JButton btnsorpresa;
	
	static int por1=0,por2=0,por3=0,por4=0;
	static int val1,val2,val3,val4;
	public GUI_Encuesta() {
		// TODO Auto-generated constructor stub
		super("Validar formulario");
		
		Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/tesji/vistas/imagenes/encuestas-1.0.png"));
		setIconImage(icono);
		setVisible(true);
		//objetos creados
		
		
		btnAbrirEncuesta=new JButton("Abrir Encuesta");
		btnsorpresa=new JButton("");
		
		setLayout(new BorderLayout());
					// paneles
		
		//centro
		pnlCentro = new JPanel();
		pnlCentro.setLayout(new FlowLayout());
		pnlCentro.setBackground(Color.black);
		add(pnlCentro,BorderLayout.CENTER);
		
		pnlCentro.add(btnAbrirEncuesta);
		btnAbrirEncuesta.setForeground(Color.white);
		btnAbrirEncuesta.setBackground(Color.darkGray);
		
		
		//Norte
		pnlNorte= new JPanel();
		pnlNorte.setLayout(new FlowLayout());
		pnlNorte.setBackground(Color.black);
		add(pnlNorte,BorderLayout.NORTH);
		
	
		
		//sur
		pnlSur = new JPanel();
		pnlSur.setLayout(new FlowLayout());
		pnlSur.setBackground(Color.black);
		add(pnlSur,BorderLayout.SOUTH);
		pnlSur.add(btnsorpresa);
		ImageIcon sorpresa =new ImageIcon(getClass().getResource("/edu/tesji/vistas/imagenes/avatar414371_19.gif"));
		btnsorpresa.setIcon(sorpresa);
		btnsorpresa.setBackground(Color.black);
		
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
		
		btnAbrirEncuesta.addActionListener(this);
		btnsorpresa.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//no va ha hacer nada
		pack();
		//(posicionancho,posicion alto, ancho del gui,alto del gui)
		setBounds(550,320,300,180); //da la posicion y el tamaño 
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int cantidad;
		int cantidadm=0;
		int musica[];
		
		if(e.getSource().equals(btnAbrirEncuesta)){
			cantidad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas?"));
			musica=new int[cantidad];
		
			int op1=0,op2=0,op3=0,op4=0;
			for(int i=0;i<cantidad;i++){
				cantidadm=Integer.parseInt(JOptionPane.showInputDialog("¿Que musica te gusta?" +
						"\n1)Pop\n2)Rock\n3)Banda\n4)Electronica"));
				//musica[i]=cantidadm;
				if(cantidadm>0&&cantidadm<=4){
				switch(cantidadm){
					case 1:
						op1=op1+1;
						
					break;
					case 2:
						op2=op2+1;
						
					break;
					case 3:
						op3=op3+1;
						
					break;
					case 4:
						op4=op4+1;
						
					break;
					
				}
				System.out.println("cantidad "+op1+" "+op2+" "+op3+" "+op4);	
				}else {
					JOptionPane.showMessageDialog(null,"ingresa un numero valido ");	
				}
		}
			
			System.out.println("cantidad final"+op1+" "+op2+" "+op3+" "+op4);
			por1=((op1*100)/cantidad);
			por2=((op2*100)/cantidad);
			por3=(op3*100)/cantidad;
			por4=(op4*100)/cantidad;
			
			int y1=op2+op3+op4;
			//int y2= pop2+banda2+elec2;
			//int y3=pop2+rock2+elec2;
			//int y4=rock2+pop2+banda2;
			
			val1=(y1*22)/100+100;
			System.out.println("porsentage final "+por1+" "+por2+" "+por3+" "+por4);
			//frmgrf = new frmgrafica();
			new opciones();
	}else if(e.getSource().equals(btnsorpresa)){
		JOptionPane.showMessageDialog(null,"---Bienvenido---\n -pulsa abrir encuestas para iniciar - ");		
	}

	}
}
/*	if (cantidadm==1){
por1=(cantidadm*100)/cantidad;
System.out.println("porcentage de pop"+por1);
}else if (musica[i]==2){
por2=(cantidadm*100)/cantidad;
System.out.println("porcentage de pop"+por2);
}else if (musica[i]==3){
por3=(cantidadm*100)/cantidad;
System.out.println("porcentage de pop"+por3);
}else if (musica[i]==4){
por4=(cantidadm*100)/cantidad;
System.out.println("porcentage de pop"+por4);
}*/
