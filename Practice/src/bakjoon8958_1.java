import java.util.*;
public class bakjoon8958_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		input.nextLine();
		
		String[] answers = new String[num];
		
		for(int i = 0; i < answers.length; i++)
		{
//			answers[i] = input.next();
			answers[i] = input.nextLine();
		}
		
		input.close();
		
		
		for(int i = 0 ; i < answers.length; i++)
		{
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j < answers[i].length(); ++j)
			{
				if(answers[i].charAt(j) == 'O')
				{
					count++;
				}
				else
				{
					count = 0;
				}
				
				sum += count;
			}
			
			System.out.println(sum);
		}

	}

}
