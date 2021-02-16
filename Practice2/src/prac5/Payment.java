package prac5;

public class Payment {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 200, 3);
		Drink tea = new Drink("녹차", 150, 2);
		Alchol wine = new Alchol("와인", 300, 2, 15.0f);
		
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alchol.printTitle();
		wine.printData();
		
		int sum = coffee.totalPrice() + tea.totalPrice() + wine.totalPrice();
		
		System.out.println("\n*** 합계금액 " + sum + "원 ***");

	}

}
