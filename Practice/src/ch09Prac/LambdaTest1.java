package ch09Prac;

@FunctionalInterface
interface MyInterface1 {
	void sayHello();
}

public class LambdaTest1 {

	public static void main(String[] args) {
		MyInterface1 hello = () -> System.out.println("Hello Lambda!");
		// �Ű� ������ ������ �ʴ� ���ٽ� ǥ��
		hello.sayHello();
	}

}
