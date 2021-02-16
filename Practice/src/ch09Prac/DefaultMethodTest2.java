package ch09Prac;

interface OperateCar1 {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default public void fly() {
		System.out.println("�ϴ��� ���� ����!");
	}
}

class OldCar implements OperateCar1 {
	public void start() { }
	public void stop() { }
	public void setSpeed(int speed) { }
	public void turn(int degree) { }
}

public class DefaultMethodTest2 {

	public static void main(String[] args) {
		OldCar oc = new OldCar();
		
		oc.fly();

	}

}
