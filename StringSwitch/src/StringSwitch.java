import java.util.*;
public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String month;
		
		System.out.print("월의 이름을 입력하세요: ");
		month = input.next();
		
		int monthnum;
		switch(month)
		{
		case "january":
			monthnum = 1;
			break;
		case "february":
			monthnum = 2;
			break;
		case "march":
			monthnum = 3;
			break;
		default:
			monthnum = 0;
			break;
		}
		
		System.out.println(monthnum);
		
		input.close();
	}

}
