package prac5;

public class Alchol extends Drink {
	private float alcper;
	
	public Alchol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t단위\t수량\t금액");
	}
	
	public void printData() {
		System.out.println(getName() + "(" + alcper + ")\t" + getPrice() + "\t" + getCount() + "\t" + totalPrice());
	}
}
