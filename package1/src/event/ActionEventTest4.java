package event;

import javax.swing.*;
import java.awt.event.*;

class MyFrame4 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame4() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button)
				{
					label.setText("마침내 버튼이 눌려졌습니다.");
				}
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}

public class ActionEventTest4 {

	public static void main(String[] args) {
		MyFrame4 frame = new MyFrame4();
	}

}
