package edu.tesji.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class piePanel extends JPanel{
	private PieSlice[] slice;
	 private int current= 0;
	 private float totalSize =0;
	 private Color background;
	int por1,por2,por3,por4;
	public piePanel(int sliceCount) {
		// TODO Auto-generated constructor stub
		//setSize(500,500);
		//setBackground(Color.black);
		slice = new PieSlice[sliceCount] ;
		// background = getBackground();
		setBackground(Color.black);
	}

	public void addSlice(Color sColor, float sSize){
		if(current <= slice.length){
			slice[current] = new PieSlice(sColor,sSize);
			totalSize += sSize;
			current++;
		}
	}
	 public void paintComponent(Graphics comp){
		 super.paintComponent(comp);
		 Graphics2D comp2D =(Graphics2D) comp;
		 int width = getSize().width -10;
		 int height = getSize().height - 15;
		 int xInset = 5;
		 int yInset = 5;
		 if(width < 5){
			 xInset = width;
		 }
		 if(height < 5){
			 yInset = height;
		 }
		 comp2D.setColor(background);
		 comp2D.fillRect(0,0,getSize().width,getSize().height);
		 comp2D.setColor(Color.lightGray);
		 Ellipse2D.Float pie = new Ellipse2D.Float(xInset, yInset, width, height);
		comp2D.fill (pie);
		float start=0;
			for(int i = 0;i<slice.length;i++){
				float extent = slice[i].size* 360F / totalSize;
				comp2D.setColor(slice[i].color);
				Arc2D.Float drawSlice = new Arc2D.Float(xInset, yInset,width,height,start,extent,Arc2D.Float.PIE);
				start += extent;
				comp2D.fill(drawSlice);
			}
		}
	 }
	 class PieSlice{
	Color color = Color.lightGray ;
	float size =0;
	PieSlice(Color pColor, float pSize){
		color=pColor;
		size= pSize;
	}
	}
	
	

