import java.util.*; //Scanner Ŭ������ �ڹ� ���̺귯������ ȣ���Ѵ�.
public class Report8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ �� ���α׷����� ����ϱ� ���� ������.
		
		int num1,num2,num3,min;
		
		System.out.print("ù��° ������ �Է��ϼ���: ");
		num1 = input.nextInt(); //ù��° ������ �Է¹޴´�.
		
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		num2 = input.nextInt(); //�ι��� ������ �Է¹޴´�.
		
		System.out.print("����° ������ �Է��ϼ���: ");
		num3 = input.nextInt(); //����° ������ �Է¹޴´�.
		
		if(num1 < num2)
		{
			if(num1 < num3)
			{
				min = num1;
			}
			else
			{
				min = num3;
			}
		}
		else if(num2 < num3)
		{
			min = num2;
		}
		else
		{
			min = num3;
		}
		
		System.out.println("���� ���� ���� : " + min); //���� �������� ����Ѵ�.
		
		input.close(); //Scanner Ŭ������ �������ִ� ������.
	}

}
