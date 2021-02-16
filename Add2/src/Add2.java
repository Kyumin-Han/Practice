import java.util.*;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int sum;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		a = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		b = input.nextInt();
		
		sum = a + b;
		
		System.out.println("두수의 합은 : " + sum);
		
		input.close();
	}

}
