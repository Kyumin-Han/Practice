package event;

import javax.swing.*;
import java.awt.event.*;

class MyFrame5 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame5() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(e -> {
			label.setText("마침내 버튼이 눌려졌습니다.");
		});
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
	}
}

public class ActionEvent5 {

	public static void main(String[] args) {
		MyFrame5 frame = new MyFrame5();

	}

}
