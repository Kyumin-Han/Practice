import java.util.Scanner;
public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = input.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = input.nextInt();
		
		System.out.println(name + "�� �ȳ��ϼ���! " + age + "���̽ó׿�.");
		
		input.close();
		
	}

}
