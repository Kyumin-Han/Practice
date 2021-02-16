import java.util.*;
public class Report18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] getnum = new int[10];
		int [] count = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < getnum.length; i++)
		{
			System.out.print("1-100 사이의 수를 입력하세요 : ");
			getnum[i] = input.nextInt();
			
			if(getnum[i] < 0 || getnum[i] > 100)
			{
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
			
			int tmp = (getnum[i] - 1) / 10;
			
			for(int j = 0; j < getnum.length; j++)
			{
				if(tmp == j)
				{
					count[j]++;
				}
			}
		}
		
		for(int i = 0; i < getnum.length; i++)
		{
			System.out.print((i + 1) * 10 - 9 + " ~ " + (i + 1) * 10 + " : ");
			
			for(int j = 0; j < count[i]; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
