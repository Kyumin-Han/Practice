
public class Report11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cal = 0;
		
		for(int i = 2; i <= 9; ++i)
		{
			System.out.println(i + "´Ü ");
			for(int j = 1; j < 10; ++j)
			{
				cal = i * j;
				System.out.println(i + " * " + j + " = " + cal);
			}
			
			System.out.print("\n");
		}
	}

}
