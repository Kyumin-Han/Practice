import java.util.*; //Scanner 클래스를 자바 라이브러리에서 호출한다.
public class Report9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 이 프로그램에서 사용하기 위한 생성자.
		
		double x; //사용자가 입력한 x의 값을 저장하기 위한 변수
		double cal; //함수의 계산결과를 저장할 변수
		
		System.out.print("x의 값을 입력하세요: ");
		x = input.nextDouble();
		
		if(x <= 0)
		{
			cal = x * x * x - 9 * x + 2;
		}
		else
		{
			cal = 7 * x + 2;
		}
		
		System.out.println("계산한 값은 : " + cal); //계산된 함수의 값을 출력한다.
		
		input.close();
	}

}
