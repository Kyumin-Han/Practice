package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FontTest {
	static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	
	public static void main(String[] args) {
		
		String[] fontFamilies =ge.getAvailableFontFamilyNames();
		
		for(String s : fontFamilies)
			System.out.println(s);
		
		Font font = new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 30);
		
		JLabel label = new JLabel("Hello");
		label.setFont(font);
		
		
		JFrame frame = new JFrame();
		frame.add(label, BorderLayout.NORTH);
		frame.setSize(300, 200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
