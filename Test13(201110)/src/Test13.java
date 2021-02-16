import java.util.*;

public class Test13 {

	public static void main(String[] args) {
//		testStringArray();
//		getMaxnMin();
		
		int[] prices = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = random.nextInt(100) + 100; // 100~199������ �� �ȿ��� ���� ����
		}
		int min = getMinimum2(prices);
		
		System.out.println("�ּҰ��� : " + min);
		System.out.println(array2String(prices));

	}
	
	public static void testArrayError() {
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		int avg;
		System.out.print("�Է¹��� ������ ������ �Է��ϼ��� : ");
		num = input.nextInt();
		
		int[] scores = new int[num];
		
		int max;
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = input.nextInt();
			
			sum += scores[i];
			
			max = scores[0];
			
			if(scores[i] > max)
			{
				max = scores[i];
			}
			
		}
		
//		System.out.println("�ִ밪 : " + max);

//		�� �ڵ忡�� for���� ������� ���� �� �����Ƿ� max ���� �ʱ�ȭ ���� ���� �� �ִ�
//		���� 38��° ������ �ʱ�ȭ�� ���� �ʴ� ������ �߻��ϰ� �ȴ�
		
		
		avg = sum / scores.length;
		System.out.println("������ ��� : " + avg);
		
		input.close();
	}
	
	public static void testStringArray() {
		String s = "���ع��� ��λ��� ������ �⵵��";
		String[] strArr = {"����", "����", "����", "��λ�", "�Ѷ��"};
		String[] strArr2 = new String[5];
		
		for(int i = 0; i < strArr.length; i++)
		{
			System.out.println(strArr[i] + " ");
		}
		
		System.out.println("******************************");
		
		strArr2[0] = "�ѱ�";
		strArr2[1] = "�Ϻ�";
		strArr2[2] = "���̵�";
		strArr2[3] = "Ʈ����";
		strArr2[4] = "�̱�";
		
		for(int i = 0; i < strArr2.length; i++)
		{
			System.out.println(strArr2[i] + " ");
		}
		
		String[] hobbies = new String[5];
		
		System.out.println("�ڽ��� ��̸� �ݵ�� 5�� �Է��ϼ���.");
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < hobbies.length; i++)
		{
			System.out.println(i+1 + "��° ��̸� �Է��ϼ���.");
			hobbies[i] = input.nextLine();
		}
		
		System.out.println("����� ��̴� ������ �����ϴ�.");
		
		for(int i = 0; i < hobbies.length; i++)
		{
			System.out.println(hobbies[i]);
		}
		
		input.close();
		
	}
	
	public static void getMaxnMin() {
		
		int[] prices = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = random.nextInt(100) + 100; // 100~199������ �� �ȿ��� ���� ����
		}
		
		int min = prices[0];
		
		System.out.println("��ǰ�� ������ ������ �����ϴ�.");
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < min)
			{
				min = prices[i];
			}
			
//			System.out.println(i+1 + "��° ��ǰ�� ����: " + prices[i] + "����");
//			for���ȿ��� �迭 �� ����ֱ�
		}
		
		System.out.println("��ǰ�� ���� ������ " + min + "���� �Դϴ�.");
		
		System.out.println(array2String(prices)); // �ڹٰ� �����ϴ� API�� �ش� �迭�� �ּҿ� �ִ� �迭�� ���ڿ��� �ٲ㼭 ������ش�.
		
		
	}
	
	private static String array2String(int[] arr) {
		String s = "["; //�ʱ�ȭ
		
		for(int i = 0; i < arr.length-1; i++)
		{
			s = s + arr[i] + ", ";
		}
		
		s = s + arr[arr.length-1] + "]";
				
		return s;
	}
	
	private static int getMinimum2(int[] prices) {
		int min = prices[0];
		
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] < min)
			{
				min = prices[i];
			}
		}
		
		return min;
		
	}
	
	
	

}
