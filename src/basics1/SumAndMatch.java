package basics1;

public class SumAndMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 1;
		int number2 = 10; 
		boolean result = findSumAndDouble(number1, number2);
		 System.out.println("The result is: " + result);
		 	}
				 private static boolean findSumAndDouble(int number1, int number2) {
		// TODO Auto-generated method stub
		return false;
	}
				public static boolean makes10(int a  , int b) {
					 if(a==10 || b==10) {
						 return true;
					 }
					 else if(a + b == 10) {
						 return true;
						   
					 }
					 else {
						 return false;
						 
					 }
				 }
				
}