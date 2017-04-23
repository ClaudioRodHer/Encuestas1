package edu.tesji.vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class pnlgrafica extends JPanel{
	//private JLabel  lblpop;
	int dat1=330,dat2,dat3,dat4;
	public pnlgrafica(int por1,int por2,int por3,int por4 )  {
		// TODO Auto-generated constructor stub
		setSize(500,500);
		
		dat1=(por1*330)/100;
	}
	
	public void paintComponent(Graphics g){
		//Graphics2D g2D=(Graphics2D) g;
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.white);
		g.fillRect(100,50 , 3, 350);
		g.setColor(Color.green);
		g.fillRect(80,370 , 350, 3);
		//lineas chicas 10
		g.setColor(Color.green);
		g.fillRect(85,50 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,88 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,116, 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,149 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,182 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,215 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,248 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,281 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,314 , 30, 3);
		g.setColor(Color.green);
		g.fillRect(85,347 , 30, 3);
		//labelslineas
		
		
		g.setColor(Color.white);
		g.fillRect(156,370 , 3, 30);
		
		g.setColor(Color.white);
		g.fillRect(222,370 , 3, 30);
		
		g.setColor(Color.white);
		g.fillRect(288,370 , 3, 30);
		
		g.setColor(Color.white);
		g.fillRect(354,370 , 3, 30);
		
		g.setColor(Color.white);
		g.fillRect(414,370 , 3, 30);
		
		//incertar algo sorpresa 
		//barras
		g.setColor(Color.GREEN);
		//RoundRectangle2D.Float box = new RoundRectangle2D.Float(136F, 370F, 40F, 33F, 12, 10);
		//g2D.draw(box);
		g.fillRect(136, 370-(GUI_Encuesta.por1*3), 40, GUI_Encuesta.por1*3);
		
		g.setColor(Color.red);
		g.fillRect(202, 370-(GUI_Encuesta.por2*3), 40, GUI_Encuesta.por2*3);
		
		g.setColor(Color.blue);
		g.fillRect(268, 370-(GUI_Encuesta.por3*3), 40, GUI_Encuesta.por3*3);
		
		g.setColor(Color.yellow);
		g.fillRect(334, 370-(GUI_Encuesta.por4*3), 40, GUI_Encuesta.por4*3);
		//etiquetas
		
		
	}
}
