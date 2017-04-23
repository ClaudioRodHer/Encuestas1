package edu.tesji.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.*;


public class PieFrame extends JFrame implements ActionListener{
	private JLabel  lblpop;
	private JLabel  lblRock;
	private JLabel  lblBanda;
	private JLabel  lblElectronica;
	private piePanel pnlpie;
	private JButton btnverotragrafica;
	

	Color rojoduro = new Color(119,6,3);
	
	public PieFrame() {
		// TODO Auto-generated constructor stub
		/*super("grafica de pastel");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(frmgrafica.class.getResource("/imagenes/graficasarticulo.png")));
		image
		pnlpie= new piePanel();
		add(pnlpie);*/
	
		 super("Pastel");
		 Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/tesji/vistas/imagenes/pastel.png"));
			setIconImage(icono);
			setVisible(true);
		 setLookAndFeel();
		 setBounds(500, 200, 500, 500);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 	lblpop=new JLabel("1) Pop---"+GUI_Encuesta.por1+"% ");
			lblRock=new JLabel("\n2) Rock---"+GUI_Encuesta.por2+"% ");
			lblBanda=new JLabel("\n3) Banda---"+GUI_Encuesta.por3+"% ");
			lblElectronica=new JLabel("\n4)Electronica---"+GUI_Encuesta.por4+"%" );
			btnverotragrafica=new JButton("ver otra grafica");
			
		 piePanel pie = new piePanel(4);
		 pie.addSlice(Color.green,GUI_Encuesta.por1);
		 pie.addSlice(rojoduro,GUI_Encuesta.por2);
		 pie.addSlice(Color.blue,GUI_Encuesta.por3);
		 pie.addSlice(Color.yellow,GUI_Encuesta.por4) ;
		 
		 lblpop.setForeground(Color.green);
			pie.add(lblpop).setBounds(10, 400, 155, 155);
			
			lblRock.setForeground(Color.red);
			pie.add(lblRock).setBounds(10, 450, 155, 55);

			lblBanda.setForeground(Color.blue);
			pie.add(lblBanda).setBounds(10, 500, 155, 55);
			
			lblElectronica.setForeground(Color.yellow);
			pie.add(lblElectronica).setBounds(10, 550, 155, 55);
			
			pie.add(btnverotragrafica);
			btnverotragrafica.setForeground(Color.white);
			btnverotragrafica.setBackground(Color.darkGray);
			
			btnverotragrafica.addActionListener(this);
		 /*pie.addSlice(shrinkingViolet,203);
		 pie.addSlice(miamiNice,187);

		 pie .addSlice(inBetweenGreen,166);
		 pie.addSlice(norwegianBlue,159);
		 pie.addSlice(purpleRain,139);
		 pie.addSlice(freckle,127);*/
		 add(pie);
		 
	}
	private void setLookAndFeel(){
		

}
	//public static void main (String[] argu){
		//PieFrame pf = new PieFrame();
		//}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnverotragrafica)){
			setVisible(false);
		}
	}
}