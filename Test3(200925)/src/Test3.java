import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		//testIf();
		testIf2();
	}
	
	public static void testIf() {
		/*
		 * ���� ��ǥ: 1000
		 * ������ �Է� �޴´�
		 * 
		 * ������ ���� ��ǥ �̻��̸�
		 * ���� �޼� ���
		 * ���ʽ� �ݾ� ���: �ʰ� ������ 10%
		 * ������ �޼� ���� ���ϸ�
		 * ���� �̴޼� ���
		 * ���ʽ� �ݾ� ���: 0
		 */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		double bonus;
		
		final int TARGET = 1000;
		final double RATE = 0.1;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = input.nextInt(); // ������ �Ǽ��� �Է��� ������ ��ٸ���
		
		if(num >= TARGET)
		{
			bonus = (num-TARGET) * RATE;
			System.out.println("���� �޼�");
			System.out.println("���ʽ� : " + bonus);	
		}
		else
		{
			System.out.println("���� �̴޼�");
			System.out.println("���ʽ� : 0");
		}
		
		input.close();
	}

	public static void testIf2() {

		Scanner input = new Scanner(System.in);
		
		int score;
		
		do {
			System.out.print("������ �ӷ��Ͻÿ� : (0~100)");
			score = input.nextInt();
		} while(score < 0 || score > 100);
		
//		System.out.print("������ �Է��Ͻÿ� : ");
//		score = input.nextInt();
		
		if(score >= 90 && score <= 100)
		{
			System.out.println("A�����Դϴ�.");
		}
		else if(score >= 80)
		{
			System.out.println("B�����Դϴ�.");
		}
		else if(score >= 70)
		{
			System.out.println("C�����Դϴ�.");
		}
		else if(score >= 60)
		{
			System.out.println("D�����Դϴ�.");
		}
		else
		{
			System.out.println("F�����Դϴ�.");
		}
		
		/*
		 * if - else if ������ �ϳ��� ���ǽĿ��� true ���� ������
		 * ���������� ������ ���ǹ����� �˻����� �ʰ�
		 * ���ǿ� �´� ���ǹ��� ���常 ����ȴ�
		 */
		
		input.close();
	}
}
