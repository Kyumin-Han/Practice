import java.util.*; //Java의 라이브러리에서 Scanner 클래스를 호출한다.
public class Report4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //이 프로그램에서 Scanner 클래스를 input이라는 변수로 사용하기 위한 생성자.
		
		double celsius; //변환된 섭씨온도를 저장하기 위한 변수
		double fahren; //입력된 화씨온도를 저장하기 위한 변수
		
		System.out.print("변환할 화씨 온도를 입력하세요 : ");
		fahren = input.nextDouble(); //화씨온도를 입력받는다.
		
		celsius = 5*(fahren - 32) / 9; //공식에 따라 화씨온도를 섭씨온도로 변환해준다.
		
		System.out.println("화씨 " + fahren + "도는 섭씨 " + celsius + "도 입니다." ); //변환된 섭씨온도를 출력해준다.
		
		input.close();
	}

}
