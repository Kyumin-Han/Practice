package SellBuying;

public class Buyer {
	
	private int productNum;
	
	private int money;
	
	public Buyer(int productNum, int money) {
		System.out.println("������ ������ ȣ��...");
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
		
		String msg = String.format("������ ��ǰ ���� : %d\n�����ڰ� ���� �ݾ� : %d\n", this.productNum, this.money);
		return msg;
	}

}