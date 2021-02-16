package event;

import javax.swing.*;
import java.awt.event.*;

class MyFrame4 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame4() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button)
				{
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
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
