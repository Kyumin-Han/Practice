
public class Report14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		int count = 0;
		
		for(int i = 1; i <= 100; i++) //a
		{
			for(int j = 1; j <= 100; j++) //b
			{
				for(int k = 1; k <= 100; k++) //c
				{
					int AB = (i*i) + (j*j);
					int C = k*k;
					
					if(AB == C)
					{
						a = i;
						b = j;
						c = k;
						
						
						System.out.println("��Ÿ����� ������ �����ϴ� ���� : " + a + " " + b + " " + c);
						count++;
					}
				}
			}
		}
		System.out.println("���� : " + count);
	}

}
