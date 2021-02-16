package ch6_1;

public class Study_Java extends Study {

	@Override
	void printmsg() {
		System.out.println("자바가 보이는 그림책");
		
	}
	
	public static void main(String[] args) {
		Study_Java stdJ = new Study_Java();
		
		stdJ.printmsg();
	}

}
