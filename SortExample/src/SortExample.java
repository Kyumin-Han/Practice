import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 10;
		
		int [] numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++)
		{
			int r = (int) (Math.random() * 100);
			numbers[i] = r;
		}
		
		System.out.print("�ʱ��� ����Ʈ: ");
		for(int r : numbers)
		{
			System.out.print(r + " ");
		}
		
		Arrays.sort(numbers);
		
		System.out.print("\n���ĵ� ����Ʈ : ");
		for(int r : numbers)
		{
			System.out.print(r + " ");
		}
	}

}
