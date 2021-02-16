import java.util.*;
public class Local2004HSlv_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] countChar = new int[7];
		char[] loms = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int[] lomValues = {1, 5, 10, 50, 100, 500, 1000}; 
		
		
		System.out.print("로마숫자를 입력하세요 : ");
		String lom1 = input.next();
//		String lom2 = input.next();
			
		int count = 0;
		for(int i = 0; i < lom1.length(); i++)
		{
			if(lom1.charAt(i) == 'I')
			{
				count++;
					
				countChar[0] = count;
			}
			else if(lom1.charAt(i) == 'V')
			{
				count++;
					
				countChar[1] = count;
			}
				
			else if(lom1.charAt(i) == 'X')
			{
				count++;
					
				countChar[2] = count;
			}
			else if(lom1.charAt(i) == 'L')
			{
				count++;
					
				countChar[3] = count;
			}
			else if(lom1.charAt(i) == 'C')
			{
				count++;
					
				countChar[4] = count;
			}
			else if(lom1.charAt(i) == 'D')
			{
				count++;
					
				countChar[5] = count;
			}
			else if(lom1.charAt(i) == 'M')
			{
				count++;
					
				countChar[6] = count;
			}
		}
			
		
		for(int i = 0; i < countChar.length; i++)
		{
			System.out.print(countChar[i] + " ");
		}
		

	}

}
