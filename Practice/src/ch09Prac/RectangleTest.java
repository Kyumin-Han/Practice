package ch09Prac;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(200, 10);
		
		System.out.println(r1);
		System.out.println(r2);
		
		if(r1.compareTo(r2) == 1)
		{
			System.out.println(r1 + "���簢���� " + r2 + "���簢���� �����ϴ�.");
		}
		else if(r1.compareTo(r2) == -1)
		{
			System.out.println(r1 + "�� �� Ů�ϴ�.");
		}
		else
		{
			System.out.println(r2 + "�� �� Ů�ϴ�.");
		}

	}

}
