import java.util.*;
public class Test16_1 {

	public static void main(String[] args) {
		sortArray();

	}
	
	public static void sortArray() {
		Random random = new Random();
		
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = random.nextInt(100)+1;
		}
		
		display(nums);
		
		selectionSort(nums);
		
		System.out.println("After Sorting");
		
		display(nums);
		
	}
	
	public static void display(int[] arr) {
		for(int n : arr)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			int minIdx = i; 
			// ㅑ+1 ~ arr.lenght - 1 제일 작은 원소 값의 index를 찾아 minIdx에 저장
			
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[minIdx] > arr[j])
				{
					minIdx = j;
				}
			}
			
			swap(arr, i, minIdx);
			
		}
	}
	
	public static void swap(int[] arr, int idx1, int idx2)
	{
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

}
