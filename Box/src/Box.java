import java.util.*;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double width;
		double height;
		
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		width = input.nextDouble();
		
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		height = input.nextDouble();
		
		double area = width * height;
		double perimeter = 2.0 * (width + height);
		
		System.out.println("�簢���� ���̴� : " + area);
		System.out.println("�簢���� �ѷ��� : " + perimeter);
		
		input.close();
	}

}
