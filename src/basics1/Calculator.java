package basics1;

public class Calculator {
	
	
	public static void main(String[] args) {
		// System.out.println(calculateSum(9, 6)
		
		calculateDifference(9, 6);
		calculateSum(9, 6);
		calculateDivision(9, 6);
		
	}

	

	static void calculateDifference(int t, int g) {
		System.out.println( t + g);
	}
		
	static void calculateSum(int t, int g) {
		System.out.println(t - g);
	}
		
	static void calculateDivision(int t, int g) {
	    System.out.println(t / g);
	}

}