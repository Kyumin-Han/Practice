import java.util.*;
public class FInd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int [] numbers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int value, index = -1;
		
		System.out.print("Ž���� ���� �Է��ϼ���: ");
		value = input.nextInt();
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == value)
			{
				index = i;
			}
		}
		
		if(index < numbers.length && index >= 0)
		{
			System.out.println(value + "���� " + index + "��ġ�� �ֽ��ϴ�.");
		}
		else
		{
			System.out.print("�ش��ϴ� ���� �����ϴ�.");
		}
		input.close();
	}
	

}
