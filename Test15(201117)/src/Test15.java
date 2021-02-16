import java.util.Arrays;

public class Test15 {

	public static void main(String[] args) {
//		anonymousArray();
//		testArray();
		copyArray();
		
	}
	
	public static void anonymousArray() {
		int[] arr;
		
		arr = new int[] {1, 2, 3, 4, 5};
		
	}
	
	public static void testArray() {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8 , 9};
		int[] array2 = new int[array1.length];
		
		
		int idx = 0;
		for(int n : array1)
		{
			array2[idx++] = n;
		}
		
		//각 배열을 독립적으로 선언하고 그 값을 바꾸면 해당 배열에서만 바뀌도록 하려면 위와 같은 방법으로 해야한다
		
		System.out.println("array의 내용: ");
		for(int n : array1)
		{
			System.out.print(n + " ");
		}
		
		System.out.println("\n\narray2의 내용 : ");
		for(int n : array2)
		{
			System.out.print(n + " ");
		}
	}
	
	public static void copyArray() {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8 , 9};
		int[] array2 = Arrays.copyOf(array1, array1.length);
		
		System.out.println("array의 내용: ");
		System.out.println(Arrays.toString(array1));
		
		System.out.println("array2의 내용: ");
		System.out.println(Arrays.toString(array2));
		
	}

}
