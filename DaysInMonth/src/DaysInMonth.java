import java.util.*;
public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int month;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��ϼ��� : ");
		month = input.nextInt();
		
		int days;
		
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			days = 31;
			break;
		}
		
		System.out.println(month + "���� ������ " + days + "�� �Դϴ�.");
		
		input.close();
		
	}

}
