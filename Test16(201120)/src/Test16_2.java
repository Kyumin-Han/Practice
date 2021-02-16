import java.util.*;
public class Test16_2 {

	public static void main(String[] args) {
		// 2차원 배열을 생성하는 방법
		
		int[][] scoreArr = new int[2][10];
		// 원소를 두개 가지는 배열인데 각 원소가 또다시 각각 배열이고
		// 각 배열의 길이는 [] 안에 있는 숫자이다
		
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
