package event;

import javax.swing.*;
import java.awt.event.*;

class MyFrame5 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame5() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(e -> {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
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
