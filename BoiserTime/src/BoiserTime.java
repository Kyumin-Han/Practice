
public class BoiserTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double DISTANCE = 40e12;
		double boiserSpd = 60e3;
		
		double boiserTime;
		
		boiserTime = DISTANCE / boiserSpd;
		
		double lightSpd = boiserTime / (60.0*60.0*24.0*365.0);
		
		System.out.println("������ 1ȣ�� �ɸ��� �ð��� " + lightSpd + "�����Դϴ�.");
	}

}
