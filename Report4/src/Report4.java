import java.util.*; //Java�� ���̺귯������ Scanner Ŭ������ ȣ���Ѵ�.
public class Report4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //�� ���α׷����� Scanner Ŭ������ input�̶�� ������ ����ϱ� ���� ������.
		
		double celsius; //��ȯ�� �����µ��� �����ϱ� ���� ����
		double fahren; //�Էµ� ȭ���µ��� �����ϱ� ���� ����
		
		System.out.print("��ȯ�� ȭ�� �µ��� �Է��ϼ��� : ");
		fahren = input.nextDouble(); //ȭ���µ��� �Է¹޴´�.
		
		celsius = 5*(fahren - 32) / 9; //���Ŀ� ���� ȭ���µ��� �����µ��� ��ȯ���ش�.
		
		System.out.println("ȭ�� " + fahren + "���� ���� " + celsius + "�� �Դϴ�." ); //��ȯ�� �����µ��� ������ش�.
		
		input.close();
	}

}
