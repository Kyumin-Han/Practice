package ch09Prac;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(200, 10);
		
		System.out.println(r1);
		System.out.println(r2);
		
		if(r1.compareTo(r2) == 1)
		{
			System.out.println(r1 + "직사각형과 " + r2 + "직사각형이 같습니다.");
		}
		else if(r1.compareTo(r2) == -1)
		{
			System.out.println(r1 + "가 더 큽니다.");
		}
		else
		{
			System.out.println(r2 + "가 더 큽니다.");
		}

	}

}
