import java.util.*;
public class Test1 {

	public static void main(String[] args) {
//		String s1 = "......... ";
//		String s2 = s1 + "|" + s1;
//		String s3 = s2 + "|" + s2;
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		CircleArea();
		BoxArea();
	}
	
	public static void CircleArea () {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.print("반지름을 입력하세요.");
		double r = input.nextDouble();
		
		double area = pi * r * r;
		
		
		System.out.println("반지름이 " + r + "인 원의 면적: " + area);
		
		input.close();
	}
	
	public static void BoxArea() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로의 길이를 입력하세요 : ");
		double width = input.nextDouble();
		
		System.out.print("사각형의 세로의 길이를 입력하세요 : ");
		double height = input.nextDouble();
		
		double area = width * height;
		
		System.out.println("가로가 " + width + ", 세로가 " + height + "인 사각형의 면적: " + area);
		
		input.close();
	}

}
