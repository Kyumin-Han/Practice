import java.util.*; //Scanner 클래스를 자바 라이브러리에서 불러온다.
public class Report7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner 클래스를 사용하기위한 생성자.
		
		String eng;
		
		System.out.print("영어 한개를 입력하세요 : ");
		eng = input.next();
		
		char c = eng.charAt(0);
		String m;
		
		switch(c)
		{
		case 'a':
		case 'i':
		case 'e':
		case 'o':
		case 'u':
			m = "모음";
			break;
		default:
			m = "자음";
			break;
		}
		
		System.out.println(eng + "는 " + m + "입니다. ");
		
		input.close();
	}

}
