import java.util.*;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double width;
		double height;
		
		System.out.print("사각형의 가로를 입력하세요: ");
		width = input.nextDouble();
		
		System.out.print("사각형의 세로를 입력하세요: ");
		height = input.nextDouble();
		
		double area = width * height;
		double perimeter = 2.0 * (width + height);
		
		System.out.println("사각형의 넓이는 : " + area);
		System.out.println("사각형의 둘레는 : " + perimeter);
		
		input.close();
	}

}
