package OOP;

public class Main2 {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setName("��ũ����");
		p1.setSid("P1234");
		p1.setPhone("010-123-4567");
		p1.setLectures(new String[] {"���α׷��ֱ���", "�����α׷���(I)"});
		p1.print();
//		System.out.println(p1);
		
		Professor p2 = new Professor();
		p2.setName("����������");
		p2.setSid("P2341");
		p2.setPhone("010-234-1223");
		p2.setLectures(new String[] {"��ǻ�ͳ�Ʈ��ũ" , "�����ͺ��̽�����"});
		p2.print();
//		System.out.println(p2);
	}

}
