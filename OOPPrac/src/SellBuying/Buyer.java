package SellBuying;

public class Buyer {
	
	private int productNum;
	
	private int money;
	
	public Buyer(int productNum, int money) {
		System.out.println("구매자 생성자 호출...");
		setProductNum(productNum);
		setMoney(money);
		
		System.out.println(this);
	}
	
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public int getProductNum() {
		return this.productNum;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void buy(Seller seller) {
		seller.sell(this);
		
		this.productNum++;
	}
	
	public void pay(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {
		
		String msg = String.format("구매한 상품 갯수 : %d\n구매자가 가진 금액 : %d\n", this.productNum, this.money);
		return msg;
	}

}
