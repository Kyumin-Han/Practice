package ch09Prac;

import java.awt.event.*;
import javax.swing.*;

class MyClass implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep");
	}
}

public class CallbackTest {

	public static void main(String[] args) {
		
		ActionListener listener = new MyClass();
		
		Timer t = new Timer(1000, listener);
		t.start();
		
		for(int i = 0; i < 1000; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}

}
