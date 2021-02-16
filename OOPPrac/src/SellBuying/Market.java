package SellBuying;

public class Market {
	
	public void start() {
		
		Buyer k = new Buyer(0, 50000);
		Seller km = new Seller(500, 50000);
		
		k.buy(km);
		
		
		System.out.println(k);
		System.out.println(km);
	}
	
	public static void main(String[] args) {
		
		new Market().start();
	}
}
