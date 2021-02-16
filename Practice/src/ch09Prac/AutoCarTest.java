package ch09Prac;

public class AutoCarTest extends AutoCar {

	public static void main(String[] args) {
		AutoCar ac = new AutoCar();
		
		ac.start();
		ac.setSpeed(30);
		ac.turn(15);
		ac.stop();

	}

}
