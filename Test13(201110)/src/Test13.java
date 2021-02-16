import java.util.*;

public class Test13 {

	public static void main(String[] args) {
//		testStringArray();
//		getMaxnMin();
		
		int[] prices = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = random.nextInt(100) + 100; // 100~199까지의 값 안에서 난수 생성
		}
		int min = getMinimum2(prices);
		
		System.out.println("최소값은 : " + min);
		System.out.println(array2String(prices));

	}
	
	public static void testArrayError() {
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		int avg;
		System.out.print("입력받을 정수의 개수를 입력하세요 : ");
		num = input.nextInt();
		
		int[] scores = new int[num];
		
		int max;
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print("점수를 입력하세요 : ");
			scores[i] = input.nextInt();
			
			sum += scores[i];
			
			max = scores[0];
			
			if(scores[i] > max)
			{
				max = scores[i];
			}
			
		}
		
//		System.out.println("최대값 : " + max);

//		위 코드에서 for문이 실행되지 않을 수 있으므로 max 값이 초기화 되지 않을 수 있다
//		따라서 38번째 라인은 초기화가 되지 않는 오류가 발생하게 된다
		
		
		avg = sum / scores.length;
		System.out.println("점수의 평균 : " + avg);
		
		input.close();
	}
	
	public static void testStringArray() {
		String s = "동해물과 백두산이 마르고 닳도록";
		String[] strArr = {"동해", "서해", "남해", "백두산", "한라산"};
		String[] strArr2 = new String[5];
		
		for(int i = 0; i < strArr.length; i++)
		{
			System.out.println(strArr[i] + " ");
		}
		
		System.out.println("******************************");
		
		strArr2[0] = "한국";
		strArr2[1] = "일본";
		strArr2[2] = "바이든";
		strArr2[3] = "트럼프";
		strArr2[4] = "미국";
		
		for(int i = 0; i < strArr2.length; i++)
		{
			System.out.println(strArr2[i] + " ");
		}
		
		String[] hobbies = new String[5];
		
		System.out.println("자신의 취미를 반드시 5개 입력하세요.");
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < hobbies.length; i++)
		{
			System.out.println(i+1 + "번째 취미를 입력하세요.");
			hobbies[i] = input.nextLine();
		}
		
		System.out.println("당신의 취미는 다음과 같습니다.");
		
		for(int i = 0; i < hobbies.length; i++)
		{
			System.out.println(hobbies[i]);
		}
		
		input.close();
		
	}
	
	public static void getMaxnMin() {
		
		int[] prices = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = random.nextInt(100) + 100; // 100~199까지의 값 안에서 난수 생성
		}
		
		int min = prices[0];
		
		System.out.println("상품의 가격은 다음과 같습니다.");
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < min)
			{
				min = prices[i];
			}
			
//			System.out.println(i+1 + "번째 상품의 가격: " + prices[i] + "만원");
//			for문안에서 배열 값 찍어주기
		}
		
		System.out.println("상품의 최저 가격은 " + min + "만원 입니다.");
		
		System.out.println(array2String(prices)); // 자바가 제공하는 API로 해당 배열의 주소에 있는 배열을 문자열로 바꿔서 출력해준다.
		
		
	}
	
	private static String array2String(int[] arr) {
		String s = "["; //초기화
		
		for(int i = 0; i < arr.length-1; i++)
		{
			s = s + arr[i] + ", ";
		}
		
		s = s + arr[arr.length-1] + "]";
				
		return s;
	}
	
	private static int getMinimum2(int[] prices) {
		int min = prices[0];
		
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] < min)
			{
				min = prices[i];
			}
		}
		
		return min;
		
	}
	
	
	

}
