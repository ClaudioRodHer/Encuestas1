package edu.tesji.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frmpuntos extends JFrame implements ActionListener{
	private JLabel  lblpop;
	private JLabel  lblRock;
	private JLabel  lblBanda;
	private JLabel  lblElectronica;
	private JButton btnverotragrafica;
	private pnlpuntos pnlpun;
	int por1,por2,por3,por4;
	public frmpuntos() {
		// TODO Auto-generated constructor stub
		super("Puntos");
		Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/tesji/vistas/imagenes/puntos.png"));
		setIconImage(icono);
		setVisible(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(frmgrafica.class.getResource("/imagenes/graficasarticulo.png")));
		pnlpun= new pnlpuntos();
		add(pnlpun);	
		
		lblpop=new JLabel("1) Pop---"+GUI_Encuesta.por1+"% ");
		lblRock=new JLabel("\n2) Rock---"+GUI_Encuesta.por2+"% ");
		lblBanda=new JLabel("\n3) Banda---"+GUI_Encuesta.por3+"% ");
		lblElectronica=new JLabel("\n4)Electronica---"+GUI_Encuesta.por4+"%" );
		btnverotragrafica=new JButton("ver otra grafica");
		
		lblpop.setForeground(Color.green);
		pnlpun.add(lblpop).setBounds(10, 400, 155, 155);
		
		lblRock.setForeground(Color.red);
		pnlpun.add(lblRock).setBounds(10, 450, 155, 55);

		lblBanda.setForeground(Color.blue);
		pnlpun.add(lblBanda).setBounds(10, 500, 155, 55);
		
		lblElectronica.setForeground(Color.yellow);
		pnlpun.add(lblElectronica).setBounds(10, 550, 155, 55);
		
		pnlpun.add(btnverotragrafica);
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
