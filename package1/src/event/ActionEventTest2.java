package event;

import javax.swing.*;
import java.awt.event.*;

class MyFrame1 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame1() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
	}
	
	private class MyListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button)
			{
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}
}

public class ActionEventTest2 {

	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();

	}

}