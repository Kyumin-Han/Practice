import java.util.*;

public class Test {
    public static void main(String[] args) {
//      star1();
//    	star2();
//    	star3();
//    	star4();
//    	star5();
//    	star6();
//    	star7();
//    	star8();
    	bakjoon();
    	
    }
    
    public static void star1() {
    	Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("행의 개수를 입력하세요 : ");
        n = input.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < n-i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        input.close();
    }
    
    public static void star2() {
    	
//    	Scanner input = new Scanner(System.in);
//    	
//    	int n;
//    	
//    	System.out.print("행의 개수를 입력하세요 : ");
//    	n = input.nextInt();
//    	
    	for(int i = 0; i < 9; i++)
    	{
    		if(i < 5)
    		{
    			for(int j = 0; j < i+1; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		else
    		{
    			for(int j = 0; j < 9-i; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		
    		System.out.println();
    	}
    	
    }
    
    public static void star3() {
    	
    	for(int i = 0; i < 9; i++)
    	{
    		if(i < 5)
    		{
    			for(int j = 0; j < 4 - i; j++)
    			{
    				System.out.print(" ");
    			}
    			
    			for(int j = 0; j < i + 1; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		else
    		{
    			for(int j = 0; j < i - 4; j++)
    			{
    				System.out.print(" ");
    			}
    			
    			for(int j = 0; j < 9 - i; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void star4() {
    	
    	for(int i = 0; i < 9; i++)
    	{
    		if(i < 5)
    		{
    			for(int j = 0; j < 5 - i; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		else
    		{
    			for(int j = 0; j < i - 4; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void star5() { 
    	
    	for(int i = 0; i < 9; i++)
    	{
    		if(i < 5)
    		{
    			for(int j = 0; j < i; j++)
    			{
    				System.out.print(" ");
    			}
    			
    			for(int j = 0; j < 5-i; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		else
    		{
    			for(int j = 0; j < 8-i; j++)
    			{
    				System.out.print(" ");
    			}
    			
    			for(int j = 0; j < i - 3; j++)
    			{
    				System.out.print("*");
    			}
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void star6() {
    	
    	
    	for(int i = 0; i < 7; i++)
    	{
    			if(i < 5)
        		{
        			for(int j = 0; j < 5 - i; j++)
        			{
        				System.out.print(" ");
        			}
        			
        			for(int j = 0; j < 2*i + 1; j++)
        			{
        				System.out.print("*");
        			}
        			
        			for(int j = 0; j < 5 - i; j++)
        			{
        				System.out.print(" ");
        			}
        		}
        		else
        		{
        			for(int j = 0; j < i - 2; j++)
        			{
        				System.out.print(" ");
        			}
        			
        			for(int j = 0; j < 13 - 2*i; j++)
        			{
        				System.out.print("*");
        			}
        			
        			for(int j = 0; j < i - 2; j++)
        			{
        				System.out.print(" ");
        			}
        		}
    		
    		
    		
    		System.out.println();
    	}
    }
    
    public static void star7() {
    	Scanner input = new Scanner(System.in);
    	
    	int n;
    	
    	System.out.print("행의 개수를 입력하세요 : ");
    	n = input.nextInt();
    	
    	input.close();
    	for(int i = 1; i <= n; i++)
    	{
    		for(int j = 1; j <= n - i; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		for(int j = 1; j <= 2*i - 1; j++)
    		{
    			System.out.print("*");
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void star8() {
    	Scanner input = new Scanner(System.in);
    	
    	int n;
    	
    	System.out.print("행의 개수를 입력하세요 : ");
    	n = input.nextInt();
    	
    	input.close();
    	
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < i; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		for(int j = 0; j < 2*(n-1-i) - 1; j++)
    		{
    			System.out.print("*");
    		}
    		
    		System.out.println();
    	}
    }
    
    public static void bakjoon() {
    	Scanner input = new Scanner(System.in);
        int size;
        
        System.out.print("입력할 정수의 개수를 입력하세요: ");
        size = input.nextInt();
        
        int[] nums = new int[size];
        
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        
        int max = nums[0];
        int min = nums[0];
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
            else if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        
        System.out.print(min);
        System.out.print(" " + max);
    }
    
}