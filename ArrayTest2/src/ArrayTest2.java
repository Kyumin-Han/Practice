import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int students = 5;
		int total = 0;
		
		int [] scores = new int[students];
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = input.nextInt();
			
			total = total + scores[i];
		}
		
		int avg = total / scores.length;
		
		System.out.println("��� ������ " + avg + "�� �Դϴ�.");
	}
}
