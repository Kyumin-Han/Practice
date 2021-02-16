import java.util.*; //Java의 라이브러리에서 Scanner 클래스를 호출한다.
public class Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 이 프로그램에서 사용할 이름을 지정해준다.
		
		int receive; //받은돈을 저장할 변수
		int total; //상품의 총액을 저장할 변수
		int tax; //부가세를 저장할 변수
		int change; //잔돈을 저장할 변수
		
		System.out.print("받은 돈 : ");
		receive = input.nextInt(); //받은 돈을 입력받는다.
		
		System.out.print("상품의 총액 : ");
		total = input.nextInt(); //상품의 총액을 입력받는다.
		
		tax = total / 10; //입력받은 총액의 부가세를 계산한다.
		
		change = receive - total; //잔돈을 계산한다.
		
		System.out.println("부가세 : " + tax); //계산된 부가세를 출력한다.
		System.out.println("잔돈 : " + change); //계산된 잔돈을 출력한다.
		
		input.close(); //Scanner 클래스를 종료하는 종결자.
		
	}

}
