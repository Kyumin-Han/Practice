package challenge3_1;

public class OddNumSum {
	private int sum = 0;
	
	public OddNumSum() {
		for(int i = 0; i <= 10; i++)
		{
			if(i % 2 != 0)
			{
				sum += i;
			}
		}
	}
	
	@Override
	public String toString() {
		return "1~10까지 홀수의 합 = " + sum;
	}
}
