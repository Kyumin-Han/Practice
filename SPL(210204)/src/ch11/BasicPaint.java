package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicPaint {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("�׷��� ���� ���α׷�");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		
		frame.add(new MyDrawingPanel());
		frame.setVisible(true);
	}
}

class MyDrawingPanel extends JPanel {
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	
	public MyDrawingPanel() {
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				drawSquare(e.getX(), e.getY());
			}
		});
		
		this.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				drawSquare(e.getX(), e.getY());
			}
			
		});
	}
	
	private void drawSquare(int x, int y) {
		
		
//		if(squareX != x || squareY != y)
//		{
//			repaint(squareX, squareY, squareW+1, squareH+1);
//			
//			squareX = x;
//			squareY = y;
//			
//			repaint(squareX, squareY, squareW+1, squareH+1);
//		}
		
		squareX = x;
		squareY = y;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("���콺�� Ŭ���ϸ� �簢���� �׷����ϴ�.", 10, 20);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, squareW, squareH);
		
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
	
	
}
