import java.util.*; //Scanner Ŭ������ �ڹ� ���̺귯������ ȣ���Ѵ�.
public class Report6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3; //�Է¹��� ������ ���� ���� �������� ���������� ����
		
		System.out.print("������ �Է��ϼ��� : ");
		num1 = input.nextInt(); //ù��° ������ �Է��Ѵ�.
		
		System.out.print("������ �Է��ϼ��� : ");
		num2 = input.nextInt(); //�ι�° ������ �Է��Ѵ�.
		
		System.out.print("������ �Է��ϼ��� : ");
		num3 = input.nextInt(); //����° ������ �Է��Ѵ�.
		
		if(num1 < num2)
		{
			if(num2 < num3)
			{
				System.out.println("���ĵ� ���� : " + num1 + " " + num2 + " " + num3);
			}
			else if(num1 < num3)
			{
				System.out.println("���ĵ� ���� : " + num1 + " " + num3 + " " + num2);
			}
			else //if(num1 > num3)
			{
				System.out.println("���ĵ� ���� : " + num3 + " " + num1 + " " + num2);
			}
		}
		else if(num2 < num3)
		{
			if(num1 < num3)
			{
				System.out.println("���ĵ� ���� : " + num2 + " " + num1 + " " + num3);
			}
			else //if(num1 > num3)
			{
				System.out.println("���ĵ� ���� : " + num2 + " " + num3 + " " + num1);
			}
		}
		else //if(num2 > num3)
		{
			System.out.println("���ĵ� ���� : " + num3 + " " + num2 + " " + num1);
		}
		
		input.close();
	}

}
