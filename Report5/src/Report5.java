import java.util.*; //Scanner Ŭ�������� �ڹ� ���̺귯������ ȣ���Ѵ�.
public class Report5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ ����ϱ� ���� ������
		
		double tall, weight; //Ű�� �����԰� �Ǽ������� �Էµ� ���ɼ��� �ֱ⶧���� double �Ǽ� �������� ����ؼ� �������� �������ش�.
		double std; //ǥ��ü���� ����Ҷ� �Ǽ������� ���� ���ɼ��� �����Ƿ� �Ǽ� �������� ����Ͽ� ������ �������ش�.
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		tall = input.nextDouble(); //����ڷκ��� Ű�� �Է¹޴´�
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		weight = input.nextDouble(); //����ڷκ��� �����Ը� �Է¹޴´�.
		
		std = (tall-100) * 0.9; //����ڷκ��� �Է¹��� ������ ǥ��ü���� ���� ����Ѵ�.
		
		if(weight > std) 
		{
			System.out.println("��ü���Դϴ�."); //�Է¹��� ü���� ǥ��ü�ߺ��� ũ�� ��ü���Դϴٸ� ���
		}
		else if(weight < std)
		{
			System.out.println("��ü���Դϴ�."); //�Է¹��� ü���� ǥ��ü�ߺ��� ������ ��ü���Դϴٸ� ���
		}
		else
		{
			System.out.println("ǥ��ü���Դϴ�."); //���� ������ ��� �������� ������ ǥ��ü���Դϴٸ� ���
		}
		
		input.close(); //������ Scanner Ŭ������ ��������ִ� ������
	}

}
