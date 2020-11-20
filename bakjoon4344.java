import java.util.*;
public class bakjoon4344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int numOfStudent;
		for(int i = 0; i < num; i++)
		{
			numOfStudent = input.nextInt();
			
			int[] scores = new int[numOfStudent];
			
			int sum = 0;
			int avg = 0;
			int count = 0;
			double rate = 1.0;
			
			
			for(int j = 0; j < scores.length; j++)
			{
				System.out.print("\n점수를 입력하세요 : ");
				scores[j] = input.nextInt();
				
				sum += scores[j];
				avg = sum / scores.length;
			}
			
			for(int j = 0; j < scores.length; j++)
			{
				if(scores[j] > avg)
				{
					count++;
				}
				
				rate = ((double)count/scores.length)*100;
			}
			
			
			System.out.printf("%.3f%%" ,rate);
			System.out.print("안녕하세요 \n 테스트입니다");
		}
			input.close();
	}
}
