import java.util.*;
public class LoopExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dan;
		int i = 1;
		
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = input.nextInt();
		
		while(i <= 9)
		{
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		
		input.close();
	}
}
