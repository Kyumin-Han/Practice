
public class Programmers6 {

	public static void main(String[] args) {
		String str = "abcde";
		
		solution(str);
	}
	
	public static String solution(String s) {
		String answer = "";
		
		int mid;
		
		if(s.length() %2 == 1)
		{
			mid = s.length()/2;
			answer = Character.toString(s.charAt(mid));
		}
		else if(s.length() %2 == 0)
		{
			mid = s.length()/2;
			answer = Character.toString(s.charAt(mid-1)) + Character.toString(s.charAt(mid));
		}
		
		System.out.println(answer);
		return answer;
	}

}
