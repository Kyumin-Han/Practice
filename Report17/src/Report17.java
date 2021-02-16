import java.util.*;
public class Report17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하세요 : ");
		int students = input.nextInt();
		
		int [] grade = new int[students];
		int score;
		int total = 0;
		
		for(int i = 0; i < grade.length; i++)
		{
			System.out.print("학생 " + (i + 1) + "의 성적을 입력하세요: ");
			score = input.nextInt();
			
			if(score < 0 || score > 100)
			{
				System.out.println("잘못된 성적입니다. 다시 입력하세요.");
				System.out.print("학생 " + (i + 1) + "의 성적을 입력하세요: ");
				score = input.nextInt();
			}
			
			grade[i] = score;
			
			total += grade[i];
		}
		
		System.out.println("평균 성적은 " + total/students + "입니다.");
		
		input.close();
	}

}
