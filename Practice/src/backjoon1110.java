import java.util.Scanner;
public class backjoon1110 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        int orgNum = input.nextInt();
	        
	        int count = 0;
	        int copy = orgNum;
	        while(true) 
	        {
	            orgNum = ((orgNum % 10)*10) + (((orgNum/10) + (orgNum % 10)) % 10);
	            count++;
	            
	            if(copy == orgNum) 
	            {
	                break;
	            }
	        }
	        
	        System.out.println(count);

	}

}
