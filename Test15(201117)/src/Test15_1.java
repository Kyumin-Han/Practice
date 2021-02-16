
public class Test15_1 {

	public static void main(String[] args) {
		System.out.println("main");
		test();
		System.out.println("test 메소드 종료");
		
		int n1 = 128;
		int n2 = 956;
		sum(128, 956);
		
		System.out.println("a: " + n1);
		System.out.println("b: " + n2);
		//변수가 필요하다면 괄호 안에서 각 변수의 위치에 적어준다
		
		System.out.println("-------------------------------------");
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arrTotal = sum(nums);
//		아래에서 배열을 다시 사용할 일이 없다면 메소드의 인자에 직접 무명배열을 생성해서 사용할 수 있다.
		
//		for(int i = 0; i < nums.length; i++)
//		{
//			System.out.println("nums[" + i + "]: " + nums[i]);
//		}
		
		for(int n : nums)
		{
			System.out.println(n);
			
			//nums 배열에 있는 원소 값을 for문이 돌때마다 n에 저장하고 그 n을 출력한다.
			//한 변수에 여러개의 값을 담을 수 있는 경우에 for-each를 사용할 수 있다
			//자바 버전이 올라감에 따라 추가된 문법이다(다른 언어에서 지원하는 문법을 똑같이 지원한다)
			//for-each를 사용하면 무조건 처음부터 끝까지 접근 해야 하는 단점이 있다.
		}
		
		int[] array = nums;
		
		array[0] = 200;
		
		System.out.println("-----------------------");
		
		System.out.println("nums의 내용");
		for(int n : nums)
		{
			System.out.print(n + " ");
		}
		
		for(int n : array)
		{
			System.out.print(n + " ");
		}
		
		
		System.out.println("\n배열 원소값의 총합 : " + arrTotal);
		//메소드에서 괄호 안에 들어가는 것을 매개 변수라고 하고
		//메인 메소드에서 다른 메소드를 실제로 호출 할때 넣어주는 값을 인자라고 한다.
		
//		System.out.println("nums[0]: " + nums[0]);
//		System.out.println("nums[1]: " + nums[1]);
		//기초형 변수의 경우 변수의 메모리 공간 자체에 값을 저장해서 메소드 안에서 값을 바꿔도 메인 메소드에서 출력해도 값은 메인에서 지정된 변수의 값이 출력되지만
		//참조형 변수의 경우 실제 값이 저장된 주소를 저장하고 있으므로 실제 값을 메인 메소드가 아닌 다른 메소드에서 바꾸면 실제 값이 바뀌고
		//실행이 모두 끝나도 바뀐 값은 그대로 저장된다
		
		int total = sum(662, 93821);
		
		if(total > 15000)
		{
			System.out.println("15,000 보다 큽니다.");
		}
		else
		{
			System.out.println("15,000 보다 작습니다.");
		}

	}
	
	//실행하면 메인 메소드안에 있는 코드만 실행된다
	//다른 메소드를 실행하려면 메인메소드에서 호출해 주어야 실행된다
	
	//메인메소드에 있는 코드들과 호출된 메소드를 실행할때는
	//호출된 메소드가 실행되는 곳으로 가서 실행되고
	//다시 메인 메소드로 가서 안에 있는 코드를 실행한다
	
	public static void test() {
		System.out.println("test");
		
		//void = 실행이 끝나도 호출한 메소드에 반환해 주는 값이 아무것도 없다
		
	}
	
	public static void test2() {
		System.out.println("test2");
	}
	// class안에 오는 것들중에 위와 같은 것들을 멤버 메소드라고 한다.
	
	public static int sum(int a, int b) {
//		System.out.println(a + "+" + b + "=" + (a+b));
		int total = a + b;
		a = 20;
		b = 30;
		
		return total;
		
		//main 메소드와 sum 메소드에서의 변수는 독립적이다
		//main 메소드에서 호출된 메소드에서 선언된 변수는 해당 메소드에서 사용하고 나면 메모리상에서 사라진다
	}
	
	public static int sum(int[] arr) {
		//method overloading-메소드 오버로딩
		//동일한 이름이 같아도 매개변수의 타입, 개수가 달라도 생성 가능하다
		
		int total = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		
//		System.out.println("총 합 : " + total);
		
		arr[0] = 100;
		arr[1] = 200;
		
		return total;
	}
}
