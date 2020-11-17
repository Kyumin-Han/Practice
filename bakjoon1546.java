import java.util.*;
public class bakjoon1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		double[] orgScores = new double[num];
		
		for(int i = 0; i < orgScores.length; i++)
		{
			orgScores[i] = input.nextInt();
		}
		
		double max = orgScores[0];
		
		for(int i = 0; i < orgScores.length; i++)
		{
			if(orgScores[i] > max)
			{
				max = orgScores[i];
			}
		}
		
		double[] scores = new double[orgScores.length];
		
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = orgScores[i]/max*100;
		}
		
		double sum = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		double avg = sum/scores.length;
		
		System.out.println(avg);
		
		input.close();

	}

}
