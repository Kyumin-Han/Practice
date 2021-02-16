import java.util.*;
public class Programmers2 {

	public static void main(String[] args) {
		int[] orgAnswers = {1,2,3,4,5};
		
		for(int n : solution(orgAnswers))
		{
			System.out.print(n);
		}
	}
	
	public static int[] solution(int[] answers)
	{
		int[] answer = {};
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		int[] answer1 = {1,2,3,4,5};
		int[] answer2 = {2,1,2,3,2,4,2,5};
		int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
		
		for(int i = 0; i < answers.length; i++)
		{
			if(answer1[i%answer1.length] == answers[i])
			{
				count1++;
			}
			
			if(answer2[i%answer2.length] == answers[i])
			{
				count2++;
			}
			
			if(answer3[i%answer3.length] == answers[i])
			{
				count3++;
			}
		}
		
		int max = Math.max(Math.max(count1, count2),count3);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(max == count1) 
		{
			list.add(1);
		}
		
		if(max == count2) 
		{
			list.add(2);
		}
		if(max == count3) 
		{
			list.add(3);
		}
		
		answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++)
		{
			answer[i] = list.get(i);
		}
		
		
		return answer;
	}

}
