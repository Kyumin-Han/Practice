package event;

import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다.");
	}
}

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener());
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
	}
}

public class ActionEventTest1 {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();

	}

}
