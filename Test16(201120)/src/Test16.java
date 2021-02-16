import java.util.*;
public class Test16 {

	public static void main(String[] args) {
		if(args.length > 0)
		{
			int n1, n2;
			
			if(args.length != 2)
			{
				System.out.println("사용법=> java Test16 num1 num2");
				return;
				// 모든 메소드는 return을 만나면 종료된다.
			}
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			System.out.println(n1 +"과 " + n2 + "의 합" + (n1 + n2));
			
			// wrapper class : int -> Integer, short -> Short, long -> Long
			// 기초형에 대응 되는 참조형 변수
			
		/*System.out.println("메인 메소드로 전달된 인자");
		
			for(int i = 0; i < args.length; i++)
			{
				System.out.println(args[i]);
			}
			*/
		}
		else
		{
			System.out.println("메인 메소드로 전달된 인자가 없습니다.");
		}
		
		// main 메소드의 매개 변수 String[] args의 용도
		// JVM이 메인 메소드를 호출
	}


}
