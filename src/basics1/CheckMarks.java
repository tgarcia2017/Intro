package basics1;

public class CheckMarks {

	public static void main(String[] args) {
		gradeStudent(48);
	}

	// TODO Auto-generated method stub

	static void gradeStudent(int studentScore) {

		// if studentScore is 50-60 print D
		if (studentScore >= 50 && studentScore < 60) {
			System.out.println("Grade D");
		}

		// if studentScore is 61-70 print C
		else if (studentScore >= 60 && studentScore < 70) {
			System.out.println("Grade C");

		}

		// if studentScore is 71-80 print B
		else if (studentScore >= 71 && studentScore < 80) {
			System.out.println("Grade B");
		}

		// if studentScore is 81-100 print A
		else if (studentScore >= 71 && studentScore < 80) {
			System.out.println("Grade B");

		}
		else System.out.println("Fail");
	}
}