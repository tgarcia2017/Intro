package basics1;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateSum(3, 7);
		
		calculateDiffernce(3, 7);
		
		calculateDivision(3, 7);
	}
	static void calculateSum(int a, int b) {
        System.out.println(a+b); 
 
		}

	static void calculateDiffernce(int a, int b) {
        System.out.println(a-b); 
        }

	static void calculateDivision(int a, int b) {
        System.out.println(a/b); 
        }
}