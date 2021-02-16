package chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		while(true) 
		{
			System.out.print("양의 정수를 입력하세요: ");
			n = input.nextInt();
			if(n > 0)
			{
				break;
			}
			System.out.println("양수만 입력할 수 있습니다.");
		}
		
		int count = 0;
		for(int i = 1; ;i *= 10)
		{
			if(n / i == 0) break;

			count++;
		}
		System.out.println("그 수는 " + count + "자리 입니다.");
	}

}
