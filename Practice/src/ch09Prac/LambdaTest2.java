package ch09Prac;

@FunctionalInterface
interface MyInterface2 {
	public void calculate(int x, int y);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		MyInterface2 hello = (a,b) -> {
			int result = a * b;
			System.out.println("계산결과는 : " + result);
		};
		
		hello.calculate(10, 20);

	}

}
