import java.util.*; //Scanner Ŭ������ �ڹ� ���̺귯������ ȣ���Ѵ�.
public class Report9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ �� ���α׷����� ����ϱ� ���� ������.
		
		double x; //����ڰ� �Է��� x�� ���� �����ϱ� ���� ����
		double cal; //�Լ��� ������� ������ ����
		
		System.out.print("x�� ���� �Է��ϼ���: ");
		x = input.nextDouble();
		
		if(x <= 0)
		{
			cal = x * x * x - 9 * x + 2;
		}
		else
		{
			cal = 7 * x + 2;
		}
		
		System.out.println("����� ���� : " + cal); //���� �Լ��� ���� ����Ѵ�.
		
		input.close();
	}

}
