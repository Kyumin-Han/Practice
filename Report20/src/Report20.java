import java.util.*;
public class Report20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ������ ������ �Է��ϼ��� : ");
		int getnum = input.nextInt();
		
		int [] savenum = new int[getnum];
		
		int count = 0;
		
		for(int i = 0; i < getnum; i++)
		{
			savenum[i] = (int) ((Math.random() * 100) + 1);
			
			System.out.print(savenum[i] + " ");
			
			count++;
			
			if(count % 10 == 0)
			{
				System.out.println();
			}
		}
	}

}
