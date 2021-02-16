
public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 6;
		int [] freq = new int[size];
		
		for(int i = 0; i < 10000; i++)
		{
			++freq[(int)(Math.random() * size)];
		}
		
		System.out.println("====================");
		System.out.println("¸é        ºóµµ");
		System.out.println("====================");
		
		for(int i = 0; i < size; i++)
		{
			System.out.println((i + 1) + " " + freq[i]);
		}
	}

}
