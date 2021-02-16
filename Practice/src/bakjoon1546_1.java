import java.util.*;
public class bakjoon1546_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		double[] scores = new double[num];
		
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = input.nextInt();
		}
		
		double max = scores[0];
		
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] > max)
			{
				max = scores[i];
			}
		}
		
		double sum = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = scores[i]/max*100;
			sum += scores[i];
		}
		
		System.out.println(sum/scores.length);
		
		input.close();

	}

}
