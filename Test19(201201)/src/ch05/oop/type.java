package ch05.oop;

public class type {

	public static void main(String[] args) {
		
		int n = 14;
		String s = "";
		
		while(n > 0)
		{
			int val = n % 2;
			s = val + s;
			n = n / 2;
		}
		
		System.out.println(s);

	}

}
