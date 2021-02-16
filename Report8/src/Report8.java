import java.util.*; //Scanner 클래스를 자바 라이브러리에서 호출한다.
public class Report8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 이 프로그램에서 사용하기 위한 생성자.
		
		int num1,num2,num3,min;
		
		System.out.print("첫번째 정수를 입력하세요: ");
		num1 = input.nextInt(); //첫번째 정수를 입력받는다.
		
		System.out.print("두번째 정수를 입력하세요: ");
		num2 = input.nextInt(); //두번쨰 정수를 입력받는다.
		
		System.out.print("세번째 정수를 입력하세요: ");
		num3 = input.nextInt(); //세번째 정수를 입력받는다.
		
		if(num1 < num2)
		{
			if(num1 < num3)
			{
				min = num1;
			}
			else
			{
				min = num3;
			}
		}
		else if(num2 < num3)
		{
			min = num2;
		}
		else
		{
			min = num3;
		}
		
		System.out.println("가장 작은 수는 : " + min); //가장 작은수를 출력한다.
		
		input.close(); //Scanner 클래스를 종료해주는 종결자.
	}

}
