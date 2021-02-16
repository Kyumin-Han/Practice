
public class Programmers4 {

	public static void main(String[] args) {
		String orgS = "1234";
		
		System.out.println(solution(orgS));
	}

	public static boolean solution(String s) {
		boolean answer = true;

		char[] getChar = s.toCharArray();
		
		if(getChar.length != 4 && getChar.length != 6)
		{
			answer = false;
		}
		else
		{
			for(int i = 0; i < getChar.length; i++)
			{
				if(getChar[i] >= '0' && getChar[i] <= '9')
				{
					answer = true;
				}
				else
				{
					answer = false;
					return answer;
				}
			}
			
			return answer;
		}

		return answer;
	}

}