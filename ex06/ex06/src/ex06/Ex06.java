package ex06;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan			= new Scanner(System.in);
		
		boolean	checkInputValue = true;
		int		inputSizeInt	= 0;
		
		//�ݺ��� : �� �Ƕ�̵��� ���̸� �Է� �ް�, ��ȿ�� �˻縦 �ǽ�
		do {
			
			int tmpCount = 0;
			
			System.out.print("�� �Ƕ�̵��� ���̸� �Է��ϼ��� : ");
			String inputSizeString = scan.next();

			//�ݺ�, ���ǹ� : �Է°��� �������� �˻�
			for (int i = 0; i < inputSizeString.length(); i++) {
				
				if (inputSizeString.charAt(i) >= '0' && inputSizeString.charAt(i) <= '9')	tmpCount++;
				else	break;
			}
			
			//���ǹ� : �Է°��� ��� ������ ���, 0���� ū �������� �˻�
			if (tmpCount == inputSizeString.length()) {
				
				inputSizeInt = Integer.parseInt(inputSizeString);
				
				if (inputSizeInt > 0)			checkInputValue = false;
			}
			
		} while (checkInputValue);
		
		//�ݺ��� : �� �Ƕ�̵带 ���
		for (int i = 0; i < inputSizeInt; i++) {
			
			char	startChar		= ' ';
			
			//�ݺ��� : �� �Ƕ�̵� �պκ��� ������ ���
			for (int j = 0; j < i; j++)		System.out.print(" ");
			
			//�ݺ��� : �� �Ƕ�̵忡�� �빮��, ����, �ҹ��ڸ� �ݺ��ؼ� ���
			for (int j = 0; j < (inputSizeInt - i) * 2 - 1; j++) {
				
				//���ǹ� : ��µǴ� �빮��, ����, �ҹ����� �ʱ�ȭ
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
