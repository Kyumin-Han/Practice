import java.util.*; //Java�� ���̺귯������ Scanner Ŭ������ ȣ���Ѵ�.
public class Report1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ �� ���α׷� �ȿ��� input���� �����ϴ� ������.
		
		final double mile_kilo = 1.609; //1������ 1.609ų�ι��Ͷ�� ���� ������ �ʱ� ������ ��������� ������ ������.
		double enter_mile; //����ڰ� �Է��� ������ ���� ������ ����
		double kilometer; //����ڰ� �Է��� ������ ų�ι��ͷ� ��ȯ�� ���� ������ ����
		
		System.out.print("������ �Է��Ͻÿ� : ");
		enter_mile = input.nextDouble(); //����ڰ� ������ ���� �Է��Ѵ�.
		
		kilometer = enter_mile * mile_kilo; //����ڰ� �Է��� ������ ���� ų�ι��ͷ� ��ȯ�Ѵ�.
		
		System.out.println(enter_mile + "������ " + kilometer + "ų�ι����Դϴ�."); //���������� ��ȯ�� ���� ����Ѵ�.
		
		input.close(); //Scanner Ŭ������ �����ϴ� ������.
	}

}
