package chap01;

import java.util.Scanner;

public class SumGauss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값을 입력하세요: ");
		n = input.nextInt();
		
//		int sum = (1+n) * (n/2) + (n %2 == 1 ? (n+1) / 2 : 0);
		int sum = (1+n) * n/2;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
