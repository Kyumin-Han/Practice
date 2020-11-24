import java.util.*;

public class Test17 {
	public static void main(String[] args) {
//		twoDimensionalArray2();
//		twoDimensionalArray3();
		ticTacToe();
						
	}
	
	public static void twoDimensionalArray2() {
		int[][] table = {{10, 20, 30, 40, 50},
						{60, 70, 80, 90, 100},
						{110, 120, 130, 140} };
		
		// 2���� �迭�� 1���� �迭 ���� �ʱ�ȭ �� �� �ִ�
		// �� ���� ������ ������ �޶� �ȴ�
		
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				System.out.print(table[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void twoDimensionalArray3() {
		int[][] table = new int[3][];
		
		// �� ���� ���� ������ �ٸ��� ����� ���� ��
		// ���� ���� �����ϸ� �ึ�� �� �ִ� �ּ� ���� NULL���� ������ �Ǵµ�
		// �̶� ���� ���� 1���� �迭�� �ٽ� ������ �ָ� �ึ�� ���̰� �ٸ��� ������ �� �ִ�
		// �� ����� �Ʒ� �ڵ�� ����
		
		table[0] = new int[5];
		table[1] = new int[5];
		table[2] = new int[4];
		
		int value = 10;
		
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				table[i][j] = value;
				value += 10;
				
				System.out.print(table[i][j] + " ");
			}
			
			System.out.println();
		}
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

			int[][] boardNum = new int[3][3];
			
			int sumU1 = 0;
			int sumU2 = 0; 
			int sumU3 = 0;
			int sumU = 0;
			int sumC1 = 0;
			int sumC2 = 0; 
			int sumC3 = 0;
			int sumC = 0;
			
			for(int i = 0; i < boardNum.length; i++)
			{
				for(int j = 0; j < boardNum[i].length; j++)
				{
					if(board[i][j] == 'X')
					{
						boardNum[i][j] = 1;
						if(i == 0)
						{
							sumU1 += boardNum[i][j];
							if(sumU1 == 2)
							{
								sumU1 = 1;
							}
							else if(sumU1 == 3)
							{
								sumU = sumU1;
								break;
							}
							
						}
						else if(i == 1)
						{
							sumU2 += boardNum[i][j];
							if(sumU2 == 2)
							{
								sumU2 = 1;
							}
							else if(sumU2 == 3)
							{
								sumU = sumU2;
								break;
							}
						}
						else if(i == 2)
						{
							sumU3 += boardNum[i][j];
							if(sumU3 == 2)
							{
								sumU3 = 1;
							}
							else if(sumU3 == 3)
							{
								sumU = sumU3;
								break;
							}
						}
						sumU = sumU1 + sumU2 + sumU3;
					}
					
					
					
					if(board[i][j] == 'O')
					{
						
						boardNum[i][j] = 1;
						
						if(i == 0)
						{
							sumC1 += boardNum[i][j];
							if(sumC1 == 2)
							{
								sumC1 = 1;
							}
							else if(sumC1 == 3)
							{
								sumC = sumC1;
								break;
							}
						}
						else if(i == 1)
						{
							if(sumC2 ==2)
							{
								sumC2 = 1;
							}
							else if(sumC2 == 3)
							{
								sumC = sumC2;
								break;
							}
						}
						else if(i == 2)
						{
							if(sumC3 == 2)
							{
								sumC3 = 1;
							}
							else if(sumC3 == 3)
							{
								sumC = sumC3;
								break;
							}
						}
						sumC = sumC1 + sumC2 + sumC3;
					}
					
					
					
				
				
				if(sumU == 3 || sumC == 3)
				{
					isOver = true;
					break;
				}
			}
				
		
			}
			if(sumU == 3)
			{
				System.out.println("Winner : Player");
				System.out.println("Congratulations!");
			}
			else if(sumC == 3)
			{
				System.out.println("Winner : Computer");
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
