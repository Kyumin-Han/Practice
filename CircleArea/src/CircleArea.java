import java.util.*;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double pi = 3.141592;
		double r;
		double ca;
		
		System.out.print("�������� �Է��ϼ��� : ");
		r = input.nextDouble();
		
		ca = pi * r * r;
		
		System.out.printf("���� ���̴� : " + "%5.1f",ca);
		
		input.close();
	}

}
