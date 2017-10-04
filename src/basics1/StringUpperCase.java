package basics1;

import java.util.Scanner;

public class StringUpperCase {

	public static void main(String[] args) {

		String name1 = "Tracy";

		System.out.println(name1.toUpperCase());

		String name2 = "Tracy";

		System.out.println(name2.toLowerCase());

		String input = new Scanner(System.in).nextLine();

		System.out.println("tracy" + name1.toUpperCase());

		System.out.println("tracy" + name2.toLowerCase());
	}

}
		    