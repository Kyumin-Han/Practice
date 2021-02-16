import java.util.*; //Scanner 클래스를 자바 라이브러리에서 호출한다.
public class Report6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3; //입력받을 정수의 값을 정수 변수형의 변수명으로 선언
		
		System.out.print("정수를 입력하세요 : ");
		num1 = input.nextInt(); //첫번째 정수를 입력한다.
		
		System.out.print("정수를 입력하세요 : ");
		num2 = input.nextInt(); //두번째 정수를 입력한다.
		
		System.out.print("정수를 입력하세요 : ");
		num3 = input.nextInt(); //세번째 정수를 입력한다.
		
		if(num1 < num2)
		{
			if(num2 < num3)
			{
				System.out.println("정렬된 숫자 : " + num1 + " " + num2 + " " + num3);
			}
			else if(num1 < num3)
			{
				System.out.println("졍렬된 숫자 : " + num1 + " " + num3 + " " + num2);
			}
			else //if(num1 > num3)
			{
				System.out.println("정렬된 숫자 : " + num3 + " " + num1 + " " + num2);
			}
		}
		else if(num2 < num3)
		{
			if(num1 < num3)
			{
				System.out.println("정렬된 숫자 : " + num2 + " " + num1 + " " + num3);
			}
			else //if(num1 > num3)
			{
				System.out.println("정렬된 숫자 : " + num2 + " " + num3 + " " + num1);
			}
		}
		else //if(num2 > num3)
		{
			System.out.println("정렬된 숫자 : " + num3 + " " + num2 + " " + num1);
		}
		
		input.close();
	}

}
