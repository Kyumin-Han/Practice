import java.util.*;
public class Test16 {

	public static void main(String[] args) {
		if(args.length > 0)
		{
			int n1, n2;
			
			if(args.length != 2)
			{
				System.out.println("����=> java Test16 num1 num2");
				return;
				// ��� �޼ҵ�� return�� ������ ����ȴ�.
			}
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			System.out.println(n1 +"�� " + n2 + "�� ��" + (n1 + n2));
			
			// wrapper class : int -> Integer, short -> Short, long -> Long
			// �������� ���� �Ǵ� ������ ����
			
		/*System.out.println("���� �޼ҵ�� ���޵� ����");
		
			for(int i = 0; i < args.length; i++)
			{
				System.out.println(args[i]);
			}
			*/
		}
		else
		{
			System.out.println("���� �޼ҵ�� ���޵� ���ڰ� �����ϴ�.");
		}
		
		// main �޼ҵ��� �Ű� ���� String[] args�� �뵵
		// JVM�� ���� �޼ҵ带 ȣ��
	}


}
