package ex06;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan			= new Scanner(System.in);
		
		boolean	checkInputValue = true;
		int		inputSizeInt	= 0;
		
		//반복문 : 역 피라미드의 높이를 입력 받고, 유효성 검사를 실시
		do {
			
			int tmpCount = 0;
			
			System.out.print("역 피라미드의 높이를 입력하세요 : ");
			String inputSizeString = scan.next();

			//반복, 조건문 : 입력값이 숫자인지 검사
			for (int i = 0; i < inputSizeString.length(); i++) {
				
				if (inputSizeString.charAt(i) >= '0' && inputSizeString.charAt(i) <= '9')	tmpCount++;
				else	break;
			}
			
			//조건문 : 입력값이 모두 숫자일 경우, 0보다 큰 정수인지 검사
			if (tmpCount == inputSizeString.length()) {
				
				inputSizeInt = Integer.parseInt(inputSizeString);
				
				if (inputSizeInt > 0)			checkInputValue = false;
			}
			
		} while (checkInputValue);
		
		//반복문 : 역 피라미드를 출력
		for (int i = 0; i < inputSizeInt; i++) {
			
			char	startChar		= ' ';
			
			//반복문 : 역 피라미드 앞부분의 공백을 출력
			for (int j = 0; j < i; j++)		System.out.print(" ");
			
			//반복문 : 역 피라미드에서 대문자, 숫자, 소문자를 반복해서 출력
			for (int j = 0; j < (inputSizeInt - i) * 2 - 1; j++) {
				
				//조건문 : 출력되는 대문자, 숫자, 소문자의 초기화
				if (j == 0) {
					if		(i % 3 == 0)			startChar = 'A';
					else if (i % 3 == 1) 			startChar = '1';
					else if (i % 3 == 2) 			startChar = 'a';
				}
				else {
					if		(startChar == 'Z' + 1)	startChar = 'A';
					else if (startChar == '9' + 1)	startChar = '0';
					else if (startChar == 'z' + 1)	startChar = 'a';
				}
				System.out.print(startChar++);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
