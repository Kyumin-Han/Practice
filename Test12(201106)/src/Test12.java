import java.util.*;
public class Test12 {

	public static void main(String[] args) {
//		getPi();
//		testArray();
		testArray2();
	}
	
	public static void getPi() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = input.nextInt();
		
		double dividor;
		double dividend = -4;
		double pi = 0.0;
		
		for(int i = 1; i <= n; i++)
		{
			dividor = (i-1)*2 + 1;
			dividend = dividend*(-1);
			
			pi = pi + dividend/dividor;
		}
		
		System.out.println("���̴� " + pi);
		
		input.close();
	}
	
	public static void testArray() {
		// �迭 (array)
		// �ڹٿ��� �迭�� ���Ҵ� ���� �������� ������ �� �ִ�.
		// int[] scores; -> ������ [] �迭 �̸�
		// �迭�� �������̴�.
		// int[] scores = new int[10] -> �迭 ����
		// �迭�� �ε����� 0���� �����Ѵ�
		
		int[] scores = new int[5];
		// �����ϸ鼭 �ʱ�ȭ�� ����
		// int[] arr = {1,2,3,4,5};
		// �迭�� ���� �� �� �ٽ� ���� �Ҵ��ϴ� ���� �ȵ�
		
		// int[] scores;
		//
		// scores = new int[5];
		// ���� ���� �迭�� ������ �� ���� �޸� �����ɤ� �Ҵ� �ϴ� ���� �����ϴ�.
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println("������ �Է��ϼ��� : ");
			scores[i] = input.nextInt();
		}
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " ");
		}
		
		input.close();
		
	}
	
	public static void testArray2() {
		
		/*
		 * ����ڷκ��� ��� ������ �Է����� �� ũ�⸦ �Է¹޴´�
		 * �� ũ���� �迭 ������ �����Ѵ�.
		 * 
		 * �迭�� ũ�⸸ŭ ������ �ݺ�
		 * 		���κ��� ������ �Է¹޾� �迭�� ������� ������
		 * 
		 * �迭�� ù��° ���Һ��� ������ ���ұ��� ����Ѵ�.
		 * �� �������� ����� ����Ѵ�
		 * 
		 * �Էµ� ���� �� �ִ� ������ ����Ѵ�.
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		double avg;
		System.out.print("�Է¹��� ������ ������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		int[] scores = new int[num];
		
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(i+1 + "��° ������ �Է��ϼ��� : ");
			scores[i] = input.nextInt();
			
			sum += scores[i];
		}
		
		System.out.println("�Է��� ������ ������ �����ϴ�");
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println(i+1 + "��° ���� : " + scores[i]);
		}
		
		int max = scores[0];
		int min = scores[0];
		
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] > max)
			{
				max = scores[i];
			}
			else if(scores[i] < min)
			{
				min = scores[i];
			}
		}
		
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּ����� : " + min);
		
//		�� ��ȯ �����ڰ� ������ ���꺸�� �켱������ ���� ������
//		(double)sum/scores.length�� ���
//		sum �� ���� double������ �� ��ȯ�ǰ� ������ ������ ����ȴ�
		avg = (double)sum / scores.length;
		System.out.println("������ ��� : " + avg);
		
		input.close();
			
	}

}
