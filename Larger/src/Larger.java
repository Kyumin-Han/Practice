import java.util.*;
public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		int max;
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = input.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = input.nextInt();
		
		if(num1 > num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}
		
		System.out.println("더 큰 정수는 " + max + "입니다.");
		
		input.close();
	}

}
