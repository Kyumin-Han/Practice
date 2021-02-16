import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int std = 1000;
		int mysale, bonus;
		
		System.out.print("실적을 입력하세요(단위: 만원) : ");
		mysale = input.nextInt();
		
		if(mysale >= std)
		{
			System.out.println("실적을 달성하였습니다.");
			bonus = (mysale - std) / 10;
		}
		else
		{
			System.out.println("실적을 달성하지 못했습니다.");
			bonus = 0;
		}
		
		System.out.println("보너스 : " + bonus);
		
		input.close();
	}

}
