import java.util.*;
public class LoopExample1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int i = 0;
		
		System.out.print("숫자를 입력하세요: ");
		a = input.nextInt();
		
		while(i <= a)
		{
			System.out.print(i + " ");
			i++;
		}
		
		input.close();
	}

}
