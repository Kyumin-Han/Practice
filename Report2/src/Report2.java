import java.util.*; //Java�� ���̺귯������ Scanner Ŭ������ ȣ���Ѵ�.
public class Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ �� ���α׷����� ����� �̸��� �������ش�.
		
		int receive; //�������� ������ ����
		int total; //��ǰ�� �Ѿ��� ������ ����
		int tax; //�ΰ����� ������ ����
		int change; //�ܵ��� ������ ����
		
		System.out.print("���� �� : ");
		receive = input.nextInt(); //���� ���� �Է¹޴´�.
		
		System.out.print("��ǰ�� �Ѿ� : ");
		total = input.nextInt(); //��ǰ�� �Ѿ��� �Է¹޴´�.
		
		tax = total / 10; //�Է¹��� �Ѿ��� �ΰ����� ����Ѵ�.
		
		change = receive - total; //�ܵ��� ����Ѵ�.
		
		System.out.println("�ΰ��� : " + tax); //���� �ΰ����� ����Ѵ�.
		System.out.println("�ܵ� : " + change); //���� �ܵ��� ����Ѵ�.
		
		input.close(); //Scanner Ŭ������ �����ϴ� ������.
		
	}

}
