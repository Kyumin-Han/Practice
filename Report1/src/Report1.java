import java.util.*; //Java의 라이브러리에서 Scanner 클래스를 호출한다.
public class Report1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 본 프로그램 안에서 input으로 정희하는 생성자.
		
		final double mile_kilo = 1.609; //1마일이 1.609킬로미터라는 것은 변하지 않기 때문에 상수형으로 변수를 지정함.
		double enter_mile; //사용자가 입력할 마일의 값을 저장할 변수
		double kilometer; //사용자가 입력한 마일을 킬로미터로 변환한 값을 저장할 변수
		
		System.out.print("마일을 입력하시오 : ");
		enter_mile = input.nextDouble(); //사용자가 마일의 값을 입력한다.
		
		kilometer = enter_mile * mile_kilo; //사용자가 입력한 마일의 값을 킬로미터로 변환한다.
		
		System.out.println(enter_mile + "마일은 " + kilometer + "킬로미터입니다."); //최종적으로 변환한 값을 출력한다.
		
		input.close(); //Scanner 클래스를 종료하는 종결자.
	}

}
