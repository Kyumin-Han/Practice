import java.util.*;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int sum;
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		a = input.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		b = input.nextInt();
		
		sum = a + b;
		
		System.out.println("�μ��� ���� : " + sum);
		
		input.close();
	}

}
