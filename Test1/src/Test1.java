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
		
		System.out.print("�������� �Է��ϼ���.");
		double r = input.nextDouble();
		
		double area = pi * r * r;
		
		
		System.out.println("�������� " + r + "�� ���� ����: " + area);
		
		input.close();
	}
	
	public static void BoxArea() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�簢���� ������ ���̸� �Է��ϼ��� : ");
		double width = input.nextDouble();
		
		System.out.print("�簢���� ������ ���̸� �Է��ϼ��� : ");
		double height = input.nextDouble();
		
		double area = width * height;
		
		System.out.println("���ΰ� " + width + ", ���ΰ� " + height + "�� �簢���� ����: " + area);
		
		input.close();
	}

}
