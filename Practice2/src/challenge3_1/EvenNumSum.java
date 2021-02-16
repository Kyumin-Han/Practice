package challenge3_1;

public class EvenNumSum {
	private int sum = 0;
	
	public EvenNumSum() {
		for(int i = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				sum += i;
			}
		}
	}

	@Override
	public String toString() {
		return "1~10까지의 짝수의 합 = " + sum;
	}
	
	
	
}
