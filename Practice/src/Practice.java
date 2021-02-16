import java.util.*;
public class Practice {

	public static void main(String[] args) {
//		testFor();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		solution(n);
		

	}
	
	public static void testFor() {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
	}
	
	 public static String solution(int n) {
	        String answer = "";
	        
	        if(n == 1 || n == 2)
	        {
	        	answer = Integer.toString(n);
	        }
	        else if(n == 3)
	        {
	        	answer = Integer.toString(4);
	        }
	        
	        
	        
	        return answer;
	    }

}
