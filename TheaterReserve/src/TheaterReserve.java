import java.util.*;
public class TheaterReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 10;
		int [] seats = new int[size];
		
		while (true)
		{
			System.out.println("---------------------------");
			for(int i = 0; i < size; i++)
				System.out.print(i+1 + " ");
			System.out.println("\n---------------------------");
			for(int i = 0; i < size; i++)
				System.out.print(seats[i] + " ");
			System.out.println("\n---------------------------");
			
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
			
			Scanner input = new Scanner(System.in);
			int s = input.nextInt();
			
			if(s == -1)
				break;
			
			if(seats[s-1] == 0) 
			{
				seats[s-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�̹� ���õ� �¼��Դϴ�.");
			}
			
		}
		
	}

}