package SPL2;

public class BadBank extends Bank{
	
	@Override
	double getInterestRate() {
		return 10.0;
	}
}
