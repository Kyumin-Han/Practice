
public class QuadraticEq {

	public static void main(String[] args) {
		double a = 1;
		double b = -3;
		double c = 2;
		
		double disc = b*b - 4*a*c;
		double sqr = Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2*a;
		double r2 = (-b - sqr) / 2*a;
		
		System.out.println("근은 " + r1);
		System.out.println("근은 " + r2);

	}

}
