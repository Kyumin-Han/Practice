
public class Test15_1 {

	public static void main(String[] args) {
		System.out.println("main");
		test();
		System.out.println("test �޼ҵ� ����");
		
		int n1 = 128;
		int n2 = 956;
		sum(128, 956);
		
		System.out.println("a: " + n1);
		System.out.println("b: " + n2);
		//������ �ʿ��ϴٸ� ��ȣ �ȿ��� �� ������ ��ġ�� �����ش�
		
		System.out.println("-------------------------------------");
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arrTotal = sum(nums);
//		�Ʒ����� �迭�� �ٽ� ����� ���� ���ٸ� �޼ҵ��� ���ڿ� ���� ����迭�� �����ؼ� ����� �� �ִ�.
		
//		for(int i = 0; i < nums.length; i++)
//		{
//			System.out.println("nums[" + i + "]: " + nums[i]);
//		}
		
		for(int n : nums)
		{
			System.out.println(n);
			
			//nums �迭�� �ִ� ���� ���� for���� �������� n�� �����ϰ� �� n�� ����Ѵ�.
			//�� ������ �������� ���� ���� �� �ִ� ��쿡 for-each�� ����� �� �ִ�
			//�ڹ� ������ �ö󰨿� ���� �߰��� �����̴�(�ٸ� ���� �����ϴ� ������ �Ȱ��� �����Ѵ�)
			//for-each�� ����ϸ� ������ ó������ ������ ���� �ؾ� �ϴ� ������ �ִ�.
		}
		
		int[] array = nums;
		
		array[0] = 200;
		
		System.out.println("-----------------------");
		
		System.out.println("nums�� ����");
		for(int n : nums)
		{
			System.out.print(n + " ");
		}
		
		for(int n : array)
		{
			System.out.print(n + " ");
		}
		
		
		System.out.println("\n�迭 ���Ұ��� ���� : " + arrTotal);
		//�޼ҵ忡�� ��ȣ �ȿ� ���� ���� �Ű� ������� �ϰ�
		//���� �޼ҵ忡�� �ٸ� �޼ҵ带 ������ ȣ�� �Ҷ� �־��ִ� ���� ���ڶ�� �Ѵ�.
		
//		System.out.println("nums[0]: " + nums[0]);
//		System.out.println("nums[1]: " + nums[1]);
		//������ ������ ��� ������ �޸� ���� ��ü�� ���� �����ؼ� �޼ҵ� �ȿ��� ���� �ٲ㵵 ���� �޼ҵ忡�� ����ص� ���� ���ο��� ������ ������ ���� ��µ�����
		//������ ������ ��� ���� ���� ����� �ּҸ� �����ϰ� �����Ƿ� ���� ���� ���� �޼ҵ尡 �ƴ� �ٸ� �޼ҵ忡�� �ٲٸ� ���� ���� �ٲ��
		//������ ��� ������ �ٲ� ���� �״�� ����ȴ�
		
		int total = sum(662, 93821);
		
		if(total > 15000)
		{
			System.out.println("15,000 ���� Ů�ϴ�.");
		}
		else
		{
			System.out.println("15,000 ���� �۽��ϴ�.");
		}

	}
	
	//�����ϸ� ���� �޼ҵ�ȿ� �ִ� �ڵ常 ����ȴ�
	//�ٸ� �޼ҵ带 �����Ϸ��� ���θ޼ҵ忡�� ȣ���� �־�� ����ȴ�
	
	//���θ޼ҵ忡 �ִ� �ڵ��� ȣ��� �޼ҵ带 �����Ҷ���
	//ȣ��� �޼ҵ尡 ����Ǵ� ������ ���� ����ǰ�
	//�ٽ� ���� �޼ҵ�� ���� �ȿ� �ִ� �ڵ带 �����Ѵ�
	
	public static void test() {
		System.out.println("test");
		
		//void = ������ ������ ȣ���� �޼ҵ忡 ��ȯ�� �ִ� ���� �ƹ��͵� ����
		
	}
	
	public static void test2() {
		System.out.println("test2");
	}
	// class�ȿ� ���� �͵��߿� ���� ���� �͵��� ��� �޼ҵ��� �Ѵ�.
	
	public static int sum(int a, int b) {
//		System.out.println(a + "+" + b + "=" + (a+b));
		int total = a + b;
		a = 20;
		b = 30;
		
		return total;
		
		//main �޼ҵ�� sum �޼ҵ忡���� ������ �������̴�
		//main �޼ҵ忡�� ȣ��� �޼ҵ忡�� ����� ������ �ش� �޼ҵ忡�� ����ϰ� ���� �޸𸮻󿡼� �������
	}
	
	public static int sum(int[] arr) {
		//method overloading-�޼ҵ� �����ε�
		//������ �̸��� ���Ƶ� �Ű������� Ÿ��, ������ �޶� ���� �����ϴ�
		
		int total = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		
//		System.out.println("�� �� : " + total);
		
		arr[0] = 100;
		arr[1] = 200;
		
		return total;
	}
}
