import java.util.*;
public class Report19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String [] com = { "가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true)
		{
			System.out.print("가위 바위 보! >> ");
			String get = input.nextLine();
			
			if(get.equals("그만"))
			{
				System.out.print("게임을 종료합니다...");
				break;
			}
			
			int i =(int) (Math.random() * 3);
			
			System.out.print("사용자 = " + get + ", 컴퓨터 = " + com[i]);
			
			if((get.equals("가위") && com[i].equals("보")) ||(get.equals("바위") && com[i].equals("가위") || (get.equals("보") && com[i].equals("바위"))))
			{
				System.out.println(" 사용자가 이겼습니다.");
			}
			else if((get.equals("가위") && com[i].equals("바위")) || (get.equals("바위") && com[i].equals("보")) || (get.equals("보") && com[i].equals("가위")))
			{
				System.out.println(" 사용자가 졌습니다.");
			}
			else
			{
				System.out.println(" 비겼습니다.");
			}
		}
	}
}
