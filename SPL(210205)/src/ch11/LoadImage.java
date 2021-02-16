package ch11;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadImage extends JPanel{
	private static BufferedImage img;
	
	static {
		try {
			img = ImageIO.read(new File("C:\\Users\\한규민\\OneDrive - yjc.ac.kr\\바탕 화면\\galaxy.jpg"));	
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("이미지를 읽을 수 없어 프로그램을 종료합니다.");
			System.exit(1);
		}
	}
	
	
	public LoadImage() {
		try {
			img = ImageIO.read(new File("C:\\Users\\한규민\\OneDrive - yjc.ac.kr\\바탕 화면\\galaxy.jpg"));	
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("이미지를 읽을 수 없어 프로그램을 종료합니다.");
			System.exit(1);
		}
		
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(img, 0, 0, null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		LoadImage panel = new LoadImage();
//		frame.add(panel);
//		frame.setSize(panel.img.getWidth(), panel.img.getHeight());
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(img));
		frame.add(label);
		frame.setSize(img.getWidth(), img.getHeight());
		frame.setVisible(true);
		
	}
}
