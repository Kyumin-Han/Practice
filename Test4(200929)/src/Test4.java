import java.util.*;
public class Test4 {

	public static void main(String[] args) {
//		testIf();
//		testSwitch();
//		testSwitch2();
//		testSwitch3();
		testSwitch4();
	}
	public static void testIf() {
		/*
		 * ���� �ð��� ����
		 * 		Good Morning! (06~12�� ������)
		 * 		Good Afternoon! (12~17�� ������)
		 * 		Good Evening! (17~21�� ������)
		 * 		Good Night! (21~06)
		 */
		
		Date date = new Date();
		int hour = date.getHours();
		//hour���� �ð����� 0~23������ 24���� ���ڰ� ����ȴ�
		
		System.out.println("���� �ð� : " + date);
		if(hour >= 6 && hour < 12)
		{
			System.out.println("Good Morning");
		}
		else if(hour >= 12 && hour < 17)
		{
			System.out.println("Good Afternoon!");
		}
		else if(hour >= 17 && hour < 21)
		{
			System.out.println("Good evening!");
		}
		else
		{
			System.out.println("Good Night!");
		}
		
		
	}
	
	public static void testSwitch() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = input.nextInt();
		//������ ���� �߿��� int�� ����� �� �ִ�
		//byte�� short�� int�� �ڵ� �� ��ȯ�� �Ͼ�⶧���� ��� ����
		//long�� int�� �ڵ� �� ��ȯ�� �� �� ���� ������ ������� ���Ѵ�
		switch(n)
		{
			case 1:
				System.out.println("1�� �����߽��ϴ�.");
				break;
			case 2:
				System.out.println("2�� �����߽��ϴ�.");
				break;
			case 3:
				System.out.println("3�� �����߽��ϴ�.");
				break;
			case 4:
				System.out.println("4�� �����߽��ϴ�.");
				break;
			case 5:
				System.out.println("5�� �����߽��ϴ�.");
				break;
			default:
				System.out.println("�߸� �����߽��ϴ�.");
		}
		
		input.close();
	}
	
	public static void testSwitch2() {
		/*
		 * 1�� �Է��ϸ� "�ϳ�"�� ���
		 * 2�� �Է��ϸ� "��"�� ���
		 * 3�� �Է��ϸ� "��"�� ���
		 * �׿��� ���� "�߸��Է�"�� ���
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~3 ������ ������ �Է��ϼ��� : ");
		int n = input.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
				default:
					System.out.println("�߸� �Է�");
		}
		
		input.close();
	}
	
	public static void testSwitch3() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ϳ�, �� �Ǵ� ���� �Է�: ");
		String s = input.nextLine();
		
		switch(s)
		{
			case "�ϳ�":
				System.out.println(1);
				break;
			case "��":
				System.out.println(2);
				break;
			case "��":
				System.out.println(3);
				break;
			default:
				System.out.println("�߸� �Է�");
				
		}
		
		System.out.println("----------------------------------");
		
		if(s.equals("�ϳ�"))
		{
			System.out.println(1);
		}
		else if(s.equals("��"))
		{
			System.out.println(2);
		}
		else if(s.equals("��"))
		{
			System.out.println(3);
		}
		else
		{
			System.out.println("�߸� �Է�");
		}
		
		input.close();
	}
	
	public static void testSwitch4() {
		/*
		 * ������ �Է¹޾Ƽ�
		 * ���࿡ 90~100�̸� A ���
		 * 80~89�̸� B���
		 * 70~79�̸� C���
		 * 60~60�̸� D���
		 * �׷��� ������ F���
		 */
		
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("������ �Է��ϼ���: ");
		score = input.nextInt();
		
		int num = score / 10;
		switch(num)
		{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
				default:
					System.out.println("F");
		}
		
		input.close();
	}
}
