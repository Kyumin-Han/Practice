import java.util.*;
public class Report16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean checkInputValue = true;
		int inputSizeInt = 0;
		
		do 
		{
			int temCount = 0;
			
			System.out.print("역피라미드의 높이를 입력하세요 : ");
			String inputSizeString = scan.next();
			
			for(int i = 0; i < inputSizeString.length(); i++)
			{
				if(inputSizeString.charAt(i) > '0' && inputSizeString.charAt(i) < '9' )
				{
					temCount++;
				}
				else break;
			}
			
			if(temCount == inputSizeString.length())
			{
				inputSizeInt = Integer.parseInt(inputSizeString);
				
				if(inputSizeInt > 0)
				{
					checkInputValue = false;
				}
			}
			
		} while(checkInputValue);
		
		for(int i = 0; i < inputSizeInt; i++)
		{
			char startChar = ' ';
			
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2 * (inputSizeInt - i) - 1; j++)
			{
				if(j == 0)
				{
					if(i % 3 == 0)
					{
						startChar = 'A';
					}
					else if(i % 3 == 1)
					{
						startChar = '1';
					}
					else if(i % 3 == 2)
					{
						startChar = 'a';
					}
				}
				else
				{
					if(startChar == 'Z' + 1)
					{
						startChar = 'A';
					}
					else if(startChar == '9' + 1)
					{
						startChar = '0';
					}
					else if(startChar == 'z' + 1)
					{
						startChar = 'a';
					}
				}
				System.out.print(startChar++);
			}
			System.out.println();
		}
		
		scan.close();
		
		
	}

}
