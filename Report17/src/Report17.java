import java.util.*;
public class Report17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		int students = input.nextInt();
		
		int [] grade = new int[students];
		int score;
		int total = 0;
		
		for(int i = 0; i < grade.length; i++)
		{
			System.out.print("�л� " + (i + 1) + "�� ������ �Է��ϼ���: ");
			score = input.nextInt();
			
			if(score < 0 || score > 100)
			{
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
				System.out.print("�л� " + (i + 1) + "�� ������ �Է��ϼ���: ");
				score = input.nextInt();
			}
			
			grade[i] = score;
			
			total += grade[i];
		}
		
		System.out.println("��� ������ " + total/students + "�Դϴ�.");
		
		input.close();
	}

}
