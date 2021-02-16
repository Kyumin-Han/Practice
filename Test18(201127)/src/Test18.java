import java.util.Arrays;

public class Test18 {

	public static void main(String[] args) {
//		mineSweeper();
		randomWalk();

	}
	
	public static void mineSweeper() {
		boolean[][] board = new boolean[10][10];
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(Math.random() < 0.3)
				{
					board[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == true)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" . ");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void randomWalk() {
		boolean[][] tiles = new boolean[10][10];
		
		tiles[5][5] = true;
		
		int steps = 10;
		int row = 5;
		int col = 5;
		
		for(int i = 0; i < steps; i++)
		{
			/*
			 * 무작위로 0~3 사이의 값을 발생시키고
			 * 그 값이 0이면 위로, 1이면 오른쪽, 2면 아래, 3이면 왼쪽으로 움직인다
			 * 	위로 이동: row--
			 * 	오른쪽 이동: col++
			 *  아래로 이동: row++
			 *  왼쪽 이동: col--
			 *  tiles[row][col] = true
			 * 현재 tiles의 상태를 출력
			 */
			
			int way = (int) (Math.random()*4);
			
			if(way == 0)
			{
				if(row-1 >= 0)
				{
					row--;
				}
			}
			else if(way == 1)
			{
				if(col+1 <= tiles.length)
				{
					col++;
				}
			}
			else if(way == 2)
			{
				if(row+1 < tiles.length)
				{
					row++;
				}
				
			}
			else
			{
				if(col-1 >= 0)
				{
					col--;	
				}
			}
			
			
			tiles[row][col] = true;
			
			for(int j = 0; j < tiles.length; j++)
			{
				for(int k = 0; k < tiles[j].length; k++)
				{
					if(tiles[k][j] == true)
					{
						System.out.print(" # ");
					}
					else
					{
						System.out.print(" . ");
					}
				}
				
				System.out.println();
			}
			
			System.out.println();
			
		}
		
	}

}
