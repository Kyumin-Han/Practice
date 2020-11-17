import java.util.*;
public class bakjoon2577_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = (input.nextInt() * input.nextInt() * input.nextInt());
		String s = Integer.toString(value);
		input.close();
		
		for(int i = 0; i < 10; i++)
		{
			int count = 0;
			for(int j = 0; j < s.length(); j++)
			{
				if((s.charAt(j) - '0') == i)
				{
					count++;
				}
			}
			
			System.out.println(count);
		}
		

	}

}
