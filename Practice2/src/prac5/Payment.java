package prac5;

public class Payment {

	public static void main(String[] args) {
		Drink coffee = new Drink("Ŀ��", 200, 3);
		Drink tea = new Drink("����", 150, 2);
		Alchol wine = new Alchol("����", 300, 2, 15.0f);
		
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alchol.printTitle();
		wine.printData();
		
		int sum = coffee.totalPrice() + tea.totalPrice() + wine.totalPrice();
		
		System.out.println("\n*** �հ�ݾ� " + sum + "�� ***");

	}

}