import java.util.*;
public class Score2Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score,num;
		char grade;
		
		System.out.print("������ �Է��ϼ���: ");
		score = input.nextInt();
		num = score / 10;
		
		switch(num)
		{
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("���� : " + grade);
		
		input.close();
		
	}

}
