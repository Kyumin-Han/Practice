import java.util.*;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double pi = 3.141592;
		double r;
		double ca;
		
		System.out.print("반지름을 입력하세요 : ");
		r = input.nextDouble();
		
		ca = pi * r * r;
		
		System.out.printf("원의 넓이는 : " + "%5.1f",ca);
		
		input.close();
	}

}
