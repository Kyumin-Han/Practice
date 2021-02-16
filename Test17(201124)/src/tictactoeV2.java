import java.util.Random;
import java.util.Scanner;

public class tictactoeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void ticTacToe() {
		Scanner input = new Scanner(System.in);
		
		char[][] board = new char[3][3];
		
		int userX, userY;
		
		initialize(board);
		
		boolean isOver = false;
		
		while(true)
		{
			/*
			 * 1. 현재 보드의 상태를 디스플레이
			 * 2. 좌표를 입력받는다. (row, col) <= 1 1 은 board[0][0]
			 * 								<= 1 2 는 board[0][1]
			 * 3. 입력받은 좌표의 값이 빈 공간인지 체크
			 * if(board[userX-1][userY-1] == ' ')
			 * {
			 * 	board[userX-1][userY-1] = 'X';
			 * }
			 * else
			 * {
			 * 	continue;
			 * }
			 * 
			 *  4. 컴퓨터가 빈 공간에 'O'를 놓는다. 위치 i, j를 찾는다.
			 *   board[i][j] = 'O';
			 * 			 
			 * */
			display(board);
			if(isOver == true)
			{
				break;
			}
			
			System.out.println("다음에 놓을 좌표를 입력하세요 (1 1 ~ 3 3) : ");
			userX = input.nextInt();
			userY = input.nextInt();
			
			if(board[userX-1][userY-1] == ' ')
			{
				board[userX-1][userY-1] = 'X';
				// 끝났는지 확인
				// 끝났으면 isOver를 true로 바꿔준다
			}
			else
			{
				System.out.println("잘못된 위치입니다.");
				continue;
			}
			
			
			if(isOver == false)
			{
//				insertCom(board); // 컴퓨터가 첫번째 빈자리에 찾아 넣는다
				insertCom2(board); // 컴퓨터가 무작위로 자리를 정해서 놓는다
				//끝났는지 확인하고 끝났으면 isOver를 true로 설정
			}

			
		
		}
	}
	
	public static void display(char[][] board) {
		for(int i = 0; i < board.length; i++) // 각 행에 대해서
		{
			for(int j = 0; j < board[i].length; j++) // 각 열에 대해서
			{
				if(j < board[i].length-1)
				{
					System.out.print(board[i][j] + " |"); // i번째 행에 j번째 열을 출력	
				}
				else
				{
					System.out.print(board[i][j]);
				}
				
			}
			
			System.out.println();
			System.out.println("__|__|__");
			
		}
		
	}
	
	public static void insertCom(char[][] board)
	{
		/*
		 * 일단 단순하게 구현
		 * 가장 처음에 발견되는 빈자리에 'O'를 놓는다
		 */
		
		
		for(int i = 0; i < board.length; i++) // 각 행에 대해서
		{
			// 각 행을 반복할 때마다 그 행에서 빈 공간이 발견되어 'O'를 놓았는지
			// 체크하기 위한 변수 found를 false로 초기화
			// 발견되면 found를 true로 변경
			
			boolean found = false;
			for(int j = 0; j < board[i].length; j++) // 각 열에 대해서
			{
				if(board[i][j] == ' ')
				{
					board[i][j] = 'O';
					found = true;
					break;
				}
			}
			
			if(found == true)
			{
				break;
			}
			// i행의 특정 열에 'O'를 놓았으면 break;
		}
	}
	
	public static void initialize(char[][] board) {
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				board[i][j] = ' ';
			}
		}
		
	}
	
	
	
	public static void insertCom2(char[][] board) {
		Random random = new Random();
		while(true)
		{
			// 행의 값을 1~3의 무작위 값으로 발생 시키고
			// 열의 값을 1~3의 무작위 값으로 발생 시키고
			
			int x = random.nextInt(3)+1;
			int y = random.nextInt(3)+1;	
			
			if(board[x-1][y-1] == ' ')
			{
				board[x-1][y-1] = 'O';
				break;
			}
		}
	}

}
