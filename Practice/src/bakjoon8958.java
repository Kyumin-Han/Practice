import java.util.*;
public class bakjoon8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		
		Random random = new Random();
		
		for(int i = 0; i < testCase; i++)
		{
			int length = random.nextInt(80);
			int[] answers = new int[length];
			
			int sum = 0;
			int count = 0;
			
			for(int j = 0; j < length; j++)
			{
				boolean tempAnswer = random.nextBoolean();
				
				int answer = (tempAnswer) ? 1 : 0;
				
				answers[j] = answer;
				
				System.out.print(answers[j] + " ");
				
				if(answers[j] == 1)
				{
					count = count + 1;
					
					sum += count;
				}
				else
				{
					count = 0;
				}
			}
			
			System.out.println(sum);
			
			System.out.println();
		}
		
		input.close();
		
	}

}
