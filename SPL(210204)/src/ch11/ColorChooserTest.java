package ch11;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

public class ColorChooserTest extends JFrame implements ChangeListener, ActionListener {

	private JColorChooser colorChooser = new JColorChooser();
	private JButton selectBtn = new JButton("���� ���� �Ϸ�");
	private MyDrawingColorPanel drawingPanel = new MyDrawingColorPanel(); 
	private JPanel panel = new JPanel();
	public ColorChooserTest() {
		this.setTitle("���� ���ñ� �׽�Ʈ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		colorChooser.getSelectionModel().addChangeListener(this);
		
		
		panel.add(colorChooser);
		
		this.add(panel, BorderLayout.CENTER);
		this.add(selectBtn, BorderLayout.SOUTH);
		selectBtn.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new ColorChooserTest();
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println(colorChooser.getColor());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("���� ���� �Ϸ�"))
		{
			this.remove(panel);
			this.add(drawingPanel, BorderLayout.CENTER);
			drawingPanel.color = colorChooser.getColor();
			selectBtn.setText("���� �����ϱ�");
		}
		else 
		{
			this.remove(drawingPanel);
			this.add(panel, BorderLayout.CENTER);
			selectBtn.setText("���� ���� �Ϸ�");
		}
		repaint();
	}
}

class MyDrawingColorPanel extends JPanel implements MouseMotionListener {
	Color color = Color.BLACK;
	ArrayList<Point> points = new ArrayList<>();
	
	class Point {
		int x;
		int y;
		Color color;
	}
	
	public MyDrawingColorPanel() {
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged (MouseEvent e) {
		Point p = new Point();
		p.x = e.getX();
		p.y = e.getY();
		p.color = color;
		points.add(p);
		
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void paintComponent(Graphics g) {
//		g.setColor(color);
		
		for(int i = 0; i < points.size(); i++)
		{
			Point p = points.get(i);
			g.setColor(p.color);
			g.drawRect(p.x, p.y, 1, 1);
		}
	}
	
	
}
