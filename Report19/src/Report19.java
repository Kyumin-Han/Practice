import java.util.*;
public class Report19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String [] com = { "����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true)
		{
			System.out.print("���� ���� ��! >> ");
			String get = input.nextLine();
			
			if(get.equals("�׸�"))
			{
				System.out.print("������ �����մϴ�...");
				break;
			}
			
			int i =(int) (Math.random() * 3);
			
			System.out.print("����� = " + get + ", ��ǻ�� = " + com[i]);
			
			if((get.equals("����") && com[i].equals("��")) ||(get.equals("����") && com[i].equals("����") || (get.equals("��") && com[i].equals("����"))))
			{
				System.out.println(" ����ڰ� �̰���ϴ�.");
			}
			else if((get.equals("����") && com[i].equals("����")) || (get.equals("����") && com[i].equals("��")) || (get.equals("��") && com[i].equals("����")))
			{
				System.out.println(" ����ڰ� �����ϴ�.");
			}
			else
			{
				System.out.println(" �����ϴ�.");
			}
		}
	}
}
