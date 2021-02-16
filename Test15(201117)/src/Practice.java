
public class Practice {

	public static void main(String[] args) {
		
		int[] orgArr = new int[9];
		for(int i = 0; i < orgArr.length; i++)
		{
			orgArr[i] = i;
		}
		
		System.out.println("원래 배열의 값");
		for(int i = 0; i < orgArr.length; i++)
		{
			System.out.print(orgArr[i] + " ");
		}
		
		System.out.println("\n복사된 배열의 값");
		for(int n : copyArray(orgArr,orgArr.length))
		{
			System.out.print(n + " ");
		}

	}
	
	public static int[] copyArray(int[] arr, int length) {
		int[] copy = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			copy[i] = arr[i];
		}
		
		return copy;
	}

}
