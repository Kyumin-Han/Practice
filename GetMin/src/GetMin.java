
public class GetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = { 100, 190, 240, 1000, 102, 98, 360 };
		
		int min = prices[0];
		
		for(int i = 1; i < prices.length; i++)
		{
			if(prices[i] < min)
			{
				min = prices[i];
			}
		}
		
		System.out.println("최소값은 " + min + " 입니다.");
	}

}
