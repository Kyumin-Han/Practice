package ch6_1;

public class Study_Java extends Study {

	@Override
	void printmsg() {
		System.out.println("�ڹٰ� ���̴� �׸�å");
		
	}
	
	public static void main(String[] args) {
		Study_Java stdJ = new Study_Java();
		
		stdJ.printmsg();
	}

}
