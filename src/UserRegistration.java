import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	
	//name validation
	public void nameValidate() {
		String pattern = "^[A-Z][a-zA-Z]{2,}$";
		
		System.out.println("Enter the first name:");
		String firstName = scanner.next();
		
		if (firstName.matches(pattern)) {
			System.out.println("valid First name");
		}
		else {
			System.out.println("Invalid First name");
			nameValidate();
		}
		
		System.out.println("Enter the last name:");
		String lastName = scanner.next();
		
		if (lastName.matches(pattern)) {
			System.out.println("valid last name");
		}
		else {
			System.out.println("Invalid last name");
			nameValidate();
		}
	}
	
	//email validation
	public void emailValidator() {
		String pattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
		
		System.out.println("Enter the email id :");
		String email = scanner.next();
		
		if (email.matches(pattern)) {
			System.out.println("valid email id");
		}
		else {
			System.out.println("Invalid email id");
			emailValidator();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		UserRegistration user = new UserRegistration();
		user.nameValidate();
		
		user.emailValidator();
		}
}
