import java.util.Scanner;
public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = input.nextInt();
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		
		input.close();
		
	}

}
