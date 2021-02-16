package ch09Prac;

@FunctionalInterface
interface MyInterface1 {
	void sayHello();
}

public class LambdaTest1 {

	public static void main(String[] args) {
		MyInterface1 hello = () -> System.out.println("Hello Lambda!");
		// 매개 변수를 가지지 않는 람다식 표현
		hello.sayHello();
	}

}
