package event;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class KeyPadFrame extends JFrame {
	private JButton button;
	private JTextField txt;
	private JPanel panel;
	public KeyPadFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txt = new JTextField(20);
		this.add(txt, BorderLayout.NORTH);
		
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(3, 3));
		
		for(int i = 0; i < 9; i++)
		{
			button = new JButton(Integer.toString(i+1));
			
			button.setFocusable(false);
			button.setPreferredSize(new Dimension(100, 100));
			button.addActionListener(e -> {
				String actionCommand = e.getActionCommand();
				txt.setText(txt.getText() + actionCommand);
			});
			panel.add(button);
		}
		
		this.add(panel);
		
		
		this.pack();
		this.setVisible(true);
	}
}

public class KeyPad {

	public static void main(String[] args) {
		KeyPadFrame keypad = new KeyPadFrame();

	}

}
