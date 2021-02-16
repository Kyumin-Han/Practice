import java.util.*;
public class Test12 {

	public static void main(String[] args) {
//		getPi();
//		testArray();
		testArray2();
	}
	
	public static void getPi() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = input.nextInt();
		
		double dividor;
		double dividend = -4;
		double pi = 0.0;
		
		for(int i = 1; i <= n; i++)
		{
			dividor = (i-1)*2 + 1;
			dividend = dividend*(-1);
			
			pi = pi + dividend/dividor;
		}
		
		System.out.println("파이는 " + pi);
		
		input.close();
	}
	
	public static void testArray() {
		// 배열 (array)
		// 자바에서 배열의 원소는 같은 변수형만 저장할 수 있다.
		// int[] scores; -> 변수형 [] 배열 이름
		// 배열은 참조형이다.
		// int[] scores = new int[10] -> 배열 선언
		// 배열의 인덱스는 0부터 시작한다
		
		int[] scores = new int[5];
		// 선언하면서 초기화도 가능
		// int[] arr = {1,2,3,4,5};
		// 배열을 선언 한 후 다시 값을 할당하는 것은 안됨
		
		// int[] scores;
		//
		// scores = new int[5];
		// 위와 같이 배열을 선언한 후 따로 메모리 공가능ㄹ 할당 하는 것은 가능하다.
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println("점수를 입력하세요 : ");
			scores[i] = input.nextInt();
		}
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " ");
		}
		
		input.close();
		
	}
	
	public static void testArray2() {
		
		/*
		 * 사용자로부터 몇개의 정수를 입력할지 그 크기를 입력받는다
		 * 그 크기의 배열 변수를 생성한다.
		 * 
		 * 배열의 크기만큼 다음을 반복
		 * 		사용로부터 점수를 입력받아 배열에 순서대로 저장한
		 * 
		 * 배열의 첫번째 원소부터 마지막 원소까지 출력한다.
		 * 그 점수들의 평균을 출력한다
		 * 
		 * 입력된 정수 중 최대 점수를 출력한다.
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		double avg;
		System.out.print("입력받을 정수의 개수를 입력하세요 : ");
		num = input.nextInt();
		
		int[] scores = new int[num];
		
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(i+1 + "번째 점수를 입력하세요 : ");
			scores[i] = input.nextInt();
			
			sum += scores[i];
		}
		
		System.out.println("입력한 점수는 다음과 같습니다");
		for(int i = 0; i < scores.length; i++)
		{
			System.out.println(i+1 + "번째 점수 : " + scores[i]);
		}
		
		int max = scores[0];
		int min = scores[0];
		
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] > max)
			{
				max = scores[i];
			}
			else if(scores[i] < min)
			{
				min = scores[i];
			}
		}
		
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		
//		형 변환 연산자가 나누기 연산보다 우선순위가 높기 때문에
//		(double)sum/scores.length의 경우
//		sum 이 먼저 double형으로 형 변환되고 나누기 연산이 실행된다
		avg = (double)sum / scores.length;
		System.out.println("점수의 평균 : " + avg);
		
		input.close();
			
	}

}
