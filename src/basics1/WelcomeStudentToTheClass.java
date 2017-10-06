package basics1;

public class WelcomeStudentToTheClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] listOfNames = {"Brooke", "Kira", "Rico"};
		
		  welcomeStudents(listOfNames);
	}
	
		static void welcomeStudents(String[] listOfNames) {
			
			for (String name: listOfNames) {	
				
				System.out.println(name +  "Welcome to the class");
				
								
				}

}
}