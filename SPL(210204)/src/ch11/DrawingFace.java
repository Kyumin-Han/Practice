package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingFace extends JFrame {
	
	public DrawingFace() {
		this.setSize(280, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("¾ó±¼ ±×¸®±â");
		this.add(new MyDrawingFacePanel());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new DrawingFace();
	}
}

class MyDrawingFacePanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		
		g.drawArc(50, 80, 50, 50, 180, -180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 80, 180, 180);
	}
}