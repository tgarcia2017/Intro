package basics1;

public class SumAllTheElementsInArray {
	
	// No user input Just write the program in Main method
	// Write a program that sums(adds) all the elements in an
	// int[]

	// for9int i : arrayName){
	// }
	
			public static void main(String[] args) {

			int[] numberList = { 1, 2, 3, 4 };

			int sum = 0;
			
			for (int number : numberList) {
				// sum += number;(short and nifty version)
				sum = sum + number;

			}
			int average = sum / numberList.length;
			
			System.out.println("The average of all elements in an array is : " + average);

		}

	}
