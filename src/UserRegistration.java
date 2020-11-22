import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;
	
	//name validation
	public boolean FirstNameValidate(String firstName) {
		String pattern = "^[A-Z][a-zA-Z]{2,}$";
		
		if (firstName.matches(pattern)) {
			System.out.println("valid First name");
			return true;
		}
		else {
			System.out.println("Invalid First name");
			return false;
			
		}
	}	
	
	public boolean LastNameValidate(String lastName) {
		String pattern = "^[A-Z][a-zA-Z]{2,}$";
		
		if (lastName.matches(pattern)) {
			System.out.println("valid last name");
			return true;
		}
		else {
			System.out.println("Invalid last name");
			return false;
		}
	}
	
	//email validation
	public boolean emailValidator(String email) {
		String pattern = "^[a-zA-Z]{1,}([.\\-+]?[a-zA-Z0-9]+)?\\@[a-z0-9]{1,}\\.([a-z]{2,4})(\\.[a-z]{2,4})?$";
		
		if (email.matches(pattern)) {
			System.out.println("valid email id");
			return true;
		}
		else {
			System.out.println("Invalid email id");
			return false;
		}
	}
	
	//phone number validation
	public boolean phoneNumberValidator(String phoneNumber) {
		String pattern="^([\\+]?91)[6-9]{1}[0-9]{9}$";
			
		if (phoneNumber.matches(pattern)) {
			System.out.println("valid phone number");
			return true;
		}
		else {
			System.out.println("Invalid phone number");
			return false;
		}
	}
	
	//password validation
	public boolean passwordValidator(String password) {
		String pattern="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		
		if (password.matches(pattern)) {
			System.out.println("valid password");
			return true;
		}
		else {
			System.out.println("Invalid password");
			return false;
		}
	}
	
	public void userFirstName(){
		System.out.println("Enter the First name :");
		firstName = scanner.next();
		boolean result =  FirstNameValidate(firstName);
		if ( result == false) {
			userFirstName();
		}
	}
	
	public void userLastName(){	
		System.out.println("Enter the Last name :");
		lastName = scanner.next();
		boolean result = LastNameValidate(lastName);
		if ( result == false) {
			userLastName();
		}
	}
	
	public void userEmail(){	
		System.out.println("Enter the email id :");
		email = scanner.next();
		boolean result = emailValidator(email);
		if ( result == false) {
			userEmail();
		}
	}	
	
	public void userPhoneNumber(){
		System.out.println("Enter the phone number:");
		phoneNumber = scanner.next();
		boolean result = phoneNumberValidator(phoneNumber);
		if ( result == false) {
			userPhoneNumber();
		}
	}
	
	public void userPassword(){
		System.out.println("Enter the password:");
		password = scanner.next();
		boolean result = passwordValidator(password);
		if ( result == false) {
			userPassword();
		}
	
	} 
		
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		UserRegistration user = new UserRegistration();
		user.userFirstName();
		
		user.userLastName();
		
		user.userEmail();
		
		user.userPhoneNumber();
		
		user.userPassword();
		}
}
