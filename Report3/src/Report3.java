import java.util.*; //Java�� ���̺귯������ Scanner Ŭ������ ȣ���Ѵ�.
public class Report3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ �� ���α׷����� ���� ����ϱ����� ������.
		
		final double pi = 3.141592; //�������� ���� ������ �ʱ� ������ pi�� ���� �����Ͽ� ��������� �������ش�.
		double radius; //�������� ���� �������� �Ǽ��� �Էµȴٰ� �Ͽ����Ƿ� double ���������� �������ش�.
		double volume; //�Ǽ����� �Ǽ����� ���꿡�� �Ǽ����� ����ǹǷ� ���� ���ǵ� double ���������� �������ش�.
		
		System.out.print("���� �������� �Է��ϼ���: ");
		radius = input.nextDouble(); //����ڷκ��� ���� �������� �Է¹޴´�.
		
		volume = (4 * pi * radius * radius * radius) / 3; //���� ���Ǹ� ���ϴ� ���Ŀ� ���� ���Ǹ� ������ش�.
		
		System.out.println("���� ���Ǵ� " + volume + "�Դϴ�."); //���� ���Ǹ� ���������� ������ش�.
		
		input.close(); //������ Scanner Ŭ������ �������ִ� ������.
	}

}
