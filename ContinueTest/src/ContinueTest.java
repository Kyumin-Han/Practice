
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "no new is good news";
		
		int n = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != 'n')
			{
				continue;
			}
			
			
			n++;
		}
		
		System.out.println("���忡�� �߰ߵ� n�� ������ " + n);
	}

}