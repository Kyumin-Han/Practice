package chap01;

import java.util.Scanner;

public class Max4m {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);
 		
 		int a, b, c, d;
 		
 		System.out.println("네 정수의 최댓값을 구합니다.");
 		
 		System.out.print("a를 입력하세요: ");
 		a = input.nextInt();
 		System.out.print("b를 입력하세요: ");
 		b = input.nextInt();
 		System.out.print("c를 입력하세요: ");
 		c = input.nextInt();
 		System.out.print("d를 입력하세요: ");
 		d = input.nextInt();
 		
 		System.out.println("네 정수의 최댓값은 " + max4(a, b, c, d) + "입니다.");
	}

}
