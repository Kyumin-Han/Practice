import java.util.*; //Scanner Ŭ������ �ڹ� ���̺귯������ �ҷ��´�.
public class Report7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner Ŭ������ ����ϱ����� ������.
		
		String eng;
		
		System.out.print("���� �Ѱ��� �Է��ϼ��� : ");
		eng = input.next();
		
		char c = eng.charAt(0);
		String m;
		
		switch(c)
		{
		case 'a':
		case 'i':
		case 'e':
		case 'o':
		case 'u':
			m = "����";
			break;
		default:
			m = "����";
			break;
		}
		
		System.out.println(eng + "�� " + m + "�Դϴ�. ");
		
		input.close();
	}

}
