package prac5;

public class Drink {
	private String name;
	private int price;
	private int count;
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int totalPrice() {
		return price * count;
	}
	
	public static void printTitle() {
		System.out.println("��ǰ��\t����\t����\t�ݾ�");
	}
	
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + totalPrice());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}