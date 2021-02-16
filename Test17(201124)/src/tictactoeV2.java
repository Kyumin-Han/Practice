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
			 * 1. ���� ������ ���¸� ���÷���
			 * 2. ��ǥ�� �Է¹޴´�. (row, col) <= 1 1 �� board[0][0]
			 * 								<= 1 2 �� board[0][1]
			 * 3. �Է¹��� ��ǥ�� ���� �� �������� üũ
			 * if(board[userX-1][userY-1] == ' ')
			 * {
			 * 	board[userX-1][userY-1] = 'X';
			 * }
			 * else
			 * {
			 * 	continue;
			 * }
			 * 
			 *  4. ��ǻ�Ͱ� �� ������ 'O'�� ���´�. ��ġ i, j�� ã�´�.
			 *   board[i][j] = 'O';
			 * 			 
			 * */
			display(board);
			if(isOver == true)
			{
				break;
			}
			
			System.out.println("������ ���� ��ǥ�� �Է��ϼ��� (1 1 ~ 3 3) : ");
			userX = input.nextInt();
			userY = input.nextInt();
			
			if(board[userX-1][userY-1] == ' ')
			{
				board[userX-1][userY-1] = 'X';
				// �������� Ȯ��
				// �������� isOver�� true�� �ٲ��ش�
			}
			else
			{
				System.out.println("�߸��� ��ġ�Դϴ�.");
				continue;
			}
			
			
			if(isOver == false)
			{
//				insertCom(board); // ��ǻ�Ͱ� ù��° ���ڸ��� ã�� �ִ´�
				insertCom2(board); // ��ǻ�Ͱ� �������� �ڸ��� ���ؼ� ���´�
				//�������� Ȯ���ϰ� �������� isOver�� true�� ����
			}

			
		
		}
	}
	
	public static void display(char[][] board) {
		for(int i = 0; i < board.length; i++) // �� �࿡ ���ؼ�
		{
			for(int j = 0; j < board[i].length; j++) // �� ���� ���ؼ�
			{
				if(j < board[i].length-1)
				{
					System.out.print(board[i][j] + " |"); // i��° �࿡ j��° ���� ���	
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
		 * �ϴ� �ܼ��ϰ� ����
		 * ���� ó���� �߰ߵǴ� ���ڸ��� 'O'�� ���´�
		 */
		
		
		for(int i = 0; i < board.length; i++) // �� �࿡ ���ؼ�
		{
			// �� ���� �ݺ��� ������ �� �࿡�� �� ������ �߰ߵǾ� 'O'�� ���Ҵ���
			// üũ�ϱ� ���� ���� found�� false�� �ʱ�ȭ
			// �߰ߵǸ� found�� true�� ����
			
			boolean found = false;
			for(int j = 0; j < board[i].length; j++) // �� ���� ���ؼ�
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
			// i���� Ư�� ���� 'O'�� �������� break;
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
			// ���� ���� 1~3�� ������ ������ �߻� ��Ű��
			// ���� ���� 1~3�� ������ ������ �߻� ��Ű��
			
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
