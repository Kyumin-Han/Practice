package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class ImagePuzzle extends JFrame implements ActionListener{
	private int pieces = 4;
	private int totalPieces = pieces * pieces;
	private BufferedImage img;
	private ArrayList<Integer> pieceNums = new ArrayList<>();
	
	public static void main(String[] args) {
		new ImagePuzzle();
	}
	
	public ImagePuzzle() {
		this.setTitle("Puzzle Game");
		
		try {
			img = ImageIO.read(new File("C:\\Users\\«—±‘πŒ\\OneDrive - yjc.ac.kr\\πŸ≈¡ »≠∏È\\galaxy.jpg"));
		}
		catch(IOException e) {
			System.exit(1);
		}
		
//		shuffle();
		
		for(int i = 0; i < totalPieces; i++)
		{
			pieceNums.add(i);
		}
		
		this.add(new ImagePanel(), BorderLayout.CENTER);
		JButton imgDivideBtn = new JButton("Divide Image");
		this.add(imgDivideBtn, BorderLayout.SOUTH);
		
		imgDivideBtn.addActionListener(this);
		this.setSize(img.getWidth(), img.getHeight()+30);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void shuffle() {		
		Collections.shuffle(pieceNums);
		
		System.out.println(pieceNums);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		shuffle();
		repaint();
		
	}
	
	class ImagePanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pieceWidth = img.getWidth() / pieces;
			int pieceHeight = img.getHeight() / pieces;
			
			for(int x = 0; x < pieces; x++)
			{
				for(int y = 0; y < pieces; y++)
				{
					int sx = pieceNums.get(x*pieces + y)/pieces * pieceWidth;
					int sy = pieceNums.get(x*pieces + y)%pieces * pieceHeight;
					int dx = x * pieceWidth;
					int dy = y * pieceHeight;
					
					g.drawImage(img, dx, dy, dx+pieceWidth, dy+pieceHeight, sx, sy, sx+pieceWidth, sy+pieceHeight, null);
					
				}
			}
		}
		
	}
}
