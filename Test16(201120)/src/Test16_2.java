import java.util.*;
public class Test16_2 {

	public static void main(String[] args) {
		// 2���� �迭�� �����ϴ� ���
		
		int[][] scoreArr = new int[2][10];
		// ���Ҹ� �ΰ� ������ �迭�ε� �� ���Ұ� �Ǵٽ� ���� �迭�̰�
		// �� �迭�� ���̴� [] �ȿ� �ִ� �����̴�
		
		for(int i = 0; i < scoreArr.length; i++)
		{
			System.out.print(i + ": ");
			
			for(int j = 0; j < scoreArr[i].length; j++)
			{
				generateRandomInt(scoreArr[i]);
				
				System.out.printf("%3d ", scoreArr[i][j]);
			}
			System.out.println();
		}
		

	}
	
	public static void generateRandomInt(int[] arr) {
		Random random = new Random();
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = random.nextInt(100)+1;
		}
	}

}
