import java.util.*; //Java의 라이브러리에서 Scanner 클래스를 호출한다.
public class Report3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 이 프로그램에서 쉽게 사용하기위한 생성자.
		
		final double pi = 3.141592; //원주율의 값은 변하지 않기 때문에 pi의 값에 대입하여 상수형으로 저장해준다.
		double radius; //문제에서 구의 반지름은 실수로 입력된다고 하였으므로 double 변수형으로 지정해준다.
		double volume; //실수형과 실수형의 연산에서 실수형이 예상되므로 최종 부피도 double 변수형으로 지정해준다.
		
		System.out.print("구의 반지름을 입력하세요: ");
		radius = input.nextDouble(); //사용자로부터 구의 반지름을 입력받는다.
		
		volume = (4 * pi * radius * radius * radius) / 3; //구의 부피를 구하는 공식에 따라 부피를 계산해준다.
		
		System.out.println("구의 부피는 " + volume + "입니다."); //구의 부피를 최종적으로 출력해준다.
		
		input.close(); //생성된 Scanner 클래스를 종료해주는 종결자.
	}

}
