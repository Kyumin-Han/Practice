import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(true)
		{
			System.out.print("������ �Է��ϼ���: ");
			int score = input.nextInt();
			
			if(score < 0)
			{
				break;
			}
			
			total = total + score;
			count++;
		}
		
		System.out.println("����� " + total/count);
		
		input.close();
	}

}
