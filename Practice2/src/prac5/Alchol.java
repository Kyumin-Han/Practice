package prac5;

public class Alchol extends Drink {
	private float alcper;
	
	public Alchol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	public static void printTitle() {
		System.out.println("��ǰ��(����[%])\t����\t����\t�ݾ�");
	}
	
	public void printData() {
		System.out.println(getName() + "(" + alcper + ")\t" + getPrice() + "\t" + getCount() + "\t" + totalPrice());
	}
}
