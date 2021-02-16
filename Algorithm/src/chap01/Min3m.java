package chap01;

import java.util.Scanner;

public class Min3m {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		
		System.out.print("a를 입력하세요: ");
		a = input.nextInt();
		System.out.print("b를 입력하세요: ");
		b = input.nextInt();
		System.out.print("c를 입력하세요: ");
		c = input.nextInt();
		
		System.out.println("세 정수의 최솟값은 " + min3(a, b, c) + "입니다.");
	}

}
