import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	
	//First name validation
	public void NameValidate() {
		String pattern = "^[A-Z][a-zA-Z]{2,}$";
		
		System.out.println("Enter the first name");
		String firstName = scanner.next();
		
		if (firstName.matches(pattern)) {
			System.out.println("valid First name");
		}
		else {
			System.out.println("Invalid First name");
			NameValidate();
		}
		
		System.out.println("Enter the last name");
		String lastName = scanner.next();
		
		if (lastName.matches(pattern)) {
			System.out.println("valid last name");
		}
		else {
			System.out.println("Invalid last name");
			NameValidate();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		UserRegistration user = new UserRegistration();
		user.NameValidate();
		}
}
