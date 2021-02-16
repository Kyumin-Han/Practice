package SellBuying;

public class Seller {
	private final int PRICE = 2500;
	
	private int money;
	
	private int productNum;
	
	public Seller(int productNum, int money) {
		System.out.println("�Ǹ��� ������ ȣ��...");
		
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
	
	public void sell(Buyer buyer) {
		this.productNum--;
		
		buyer.pay(PRICE);
		
		this.money += PRICE;
	}
	
	public boolean isSoldOut() {
		boolean isSoldOut = this.productNum == 0;
		return isSoldOut;
	}
	
	@Override
	public String toString() {
		String msg = String.format("�Ǹ����� ��ǰ ���� : %d\n�Ǹ��ڰ� ���� �ݾ� : %d", this.productNum, this.money);
		return msg;
	}
}
