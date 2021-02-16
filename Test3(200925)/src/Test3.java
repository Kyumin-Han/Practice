import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		//testIf();
		testIf2();
	}
	
	public static void testIf() {
		/*
		 * 실적 목표: 1000
		 * 실적을 입력 받는다
		 * 
		 * 실적이 실적 목표 이상이면
		 * 실적 달성 출력
		 * 보너스 금액 출력: 초과 실적의 10%
		 * 실적을 달성 하지 못하면
		 * 실적 미달성 출력
		 * 보너스 금액 출력: 0
		 */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		double bonus;
		
		final int TARGET = 1000;
		final double RATE = 0.1;
		
		System.out.print("실적을 입력하세요 : ");
		num = input.nextInt(); // 정수형 실수를 입력할 때까지 기다린다
		
		if(num >= TARGET)
		{
			bonus = (num-TARGET) * RATE;
			System.out.println("실적 달성");
			System.out.println("보너스 : " + bonus);	
		}
		else
		{
			System.out.println("실적 미달성");
			System.out.println("보너스 : 0");
		}
		
		input.close();
	}

	public static void testIf2() {

		Scanner input = new Scanner(System.in);
		
		int score;
		
		do {
			System.out.print("성적을 임력하시오 : (0~100)");
			score = input.nextInt();
		} while(score < 0 || score > 100);
		
//		System.out.print("성적을 입력하시오 : ");
//		score = input.nextInt();
		
		if(score >= 90 && score <= 100)
		{
			System.out.println("A학점입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B학점입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C학점입니다.");
		}
		else if(score >= 60)
		{
			System.out.println("D학점입니다.");
		}
		else
		{
			System.out.println("F학점입니다.");
		}
		
		/*
		 * if - else if 문에서 하나의 조건식에서 true 값이 나오면
		 * 순차적으로 나오는 조건문등은 검사하지 않고
		 * 조건에 맞는 조건문의 문장만 실행된다
		 */
		
		input.close();
	}
}
