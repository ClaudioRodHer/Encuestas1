package edu.tesji.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frmgrafica extends JFrame implements ActionListener{
	private JLabel  lblpop;
	private JLabel  lblRock;
	private JLabel  lblBanda;
	private JLabel  lblElectronica;
	private JButton btnverotragrafica;
	private pnlgrafica pnlgraf;
	int por1,por2,por3,por4;
	public frmgrafica()  {
		// TODO Auto-generated constructor stub
		super("Barras");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(frmgrafica.class.getResource("/imagenes/graficasarticulo.png")));
		Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/tesji/vistas/imagenes/barras1.png"));
		setIconImage(icono);
		setVisible(true);
		pnlgraf= new pnlgrafica(por1,por2,por3,por4);
		add(pnlgraf);	
		
		lblpop=new JLabel("1) Pop---"+GUI_Encuesta.por1+"% ");
		lblRock=new JLabel("\n2) Rock---"+GUI_Encuesta.por2+"% ");
		lblBanda=new JLabel("\n3) Banda---"+GUI_Encuesta.por3+"% ");
		lblElectronica=new JLabel("\n4)Electronica---"+GUI_Encuesta.por4+"%" );
		btnverotragrafica=new JButton("ver otra grafica");
		
		lblpop.setForeground(Color.green);
		pnlgraf.add(lblpop).setBounds(10, 400, 155, 155);
		
		lblRock.setForeground(Color.red);
		pnlgraf.add(lblRock).setBounds(10, 450, 155, 55);

		lblBanda.setForeground(Color.blue);
		pnlgraf.add(lblBanda).setBounds(10, 500, 155, 55);
		
		lblElectronica.setForeground(Color.yellow);
		pnlgraf.add(lblElectronica).setBounds(10, 550, 155, 55);
		
		pnlgraf.add(btnverotragrafica);
		btnverotragrafica.setForeground(Color.white);
		btnverotragrafica.setBackground(Color.darkGray);
		btnverotragrafica.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430,150,500,500);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnverotragrafica)){
			setVisible(false);
		}
	}

}
