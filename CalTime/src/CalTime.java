
public class CalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double LIGHT_SPD = 30e4;
		final double DISTANCE = 40e12;
		
		double t;
		
		t = DISTANCE / LIGHT_SPD;
		
		double light_year = t / (60.0*60.0*24.0*365.0);
		
		System.out.println("�ɸ��� �ð��� " + light_year + "�����Դϴ�");
	}

}
