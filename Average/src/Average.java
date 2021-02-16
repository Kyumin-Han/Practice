import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(true)
		{
			System.out.print("점수를 입력하세요: ");
			int score = input.nextInt();
			
			if(score < 0)
			{
				break;
			}
			
			total = total + score;
			count++;
		}
		
		System.out.println("평균은 " + total/count);
		
		input.close();
	}

}
