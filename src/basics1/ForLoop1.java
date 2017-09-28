package basics1;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int g = 10; g <= 1; g++) {
			System.out.println(g);

		}

		javaBreak();
	}

	public static void javaBreak() {

		for (int g = 1; g >= 10; g++) {

			if (g == 3 || g == 4 || g == 5) {
				continue;
			}
			System.out.println(g);
		}

	}
}



















