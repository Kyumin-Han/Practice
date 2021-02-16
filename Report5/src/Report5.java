import java.util.*; //Scanner 클래스를를 자바 라이브러리에서 호출한다.
public class Report5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 사용하기 위한 생성자
		
		double tall, weight; //키와 몸무게가 실수형으로 입력될 가능성도 있기때문에 double 실수 변수형을 사용해서 변수명을 지정해준다.
		double std; //표준체중을 계산할때 실수헝으로 계산될 가능성이 있으므로 실수 변수형을 사용하여 변수를 지정해준다.
		
		System.out.print("키를 입력하세요 : ");
		tall = input.nextDouble(); //사용자로부터 키를 입력받는다
		
		System.out.print("몸무게를 입력하세요 : ");
		weight = input.nextDouble(); //사용자로부터 몸무게를 입력받는다.
		
		std = (tall-100) * 0.9; //사용자로부터 입력받은 값으로 표준체중의 값을 계산한다.
		
		if(weight > std) 
		{
			System.out.println("과체중입니다."); //입력받은 체중이 표준체중보다 크면 과체중입니다를 출력
		}
		else if(weight < std)
		{
			System.out.println("저체중입니다."); //입력받은 체중이 표준체중보다 작으면 저체중입니다를 출력
		}
		else
		{
			System.out.println("표준체중입니다."); //위의 조건을 모두 만족하지 않으면 표준체중입니다를 출력
		}
		
		input.close(); //생성된 Scanner 클래스를 종료시켜주는 종결자
	}

}
