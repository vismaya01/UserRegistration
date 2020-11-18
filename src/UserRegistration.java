import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	
	//First name validation
	public void firstNameValidate() {
		String pattern = "^[A-Z][a-zA-Z]{2,}$";
		
		System.out.println("Enter the first name");
		String firstName = scanner.next();
		
		if (firstName.matches(pattern)) 
			System.out.println("valid First name");
		else {
			System.out.println("Invalid First name");
			firstNameValidate();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		UserRegistration user = new UserRegistration();
		user.firstNameValidate();
		}
}
