package SPL2;

public class BankMain {

	public static void main(String[] args) {
		Bank bb = new BadBank();
		Bank nb = new NormalBank();
		Bank gb = new GoodBank();
		
		System.out.println(bb.getInterestRate());
		System.out.println(nb.getInterestRate());
		System.out.println(gb.getInterestRate());                              

	}

}
