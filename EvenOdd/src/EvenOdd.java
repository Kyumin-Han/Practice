import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("입력된 정수는 짝수입니다.");
		}
		else
		{
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		input.close();
	}

}
