import java.util.*;
public class LoopExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dan;
		int i = 1;
		
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��ϼ��� : ");
		dan = input.nextInt();
		
		while(i <= 9)
		{
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
		input.close();
	}
}
