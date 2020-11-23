import java.util.Scanner;

public class UserRegistration  {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;
	
	//name validation
	public boolean FirstNameValidate(String firstName) throws UserRegistrationException {
		String pattern = "^[A-Z][a-z]{2,}$";
		
		if (firstName.matches(pattern)) {
			System.out.println("valid First name");
			return true;
		}
		else {
			throw new UserRegistrationException("Please enter a valid first name");
		}
	}	
	
	public boolean LastNameValidate(String lastName) throws UserRegistrationException {
		String pattern = "^[A-Z][a-z]{2,}$";
		
		if (lastName.matches(pattern)) {
			System.out.println("valid last name");
			return true;
		}
		else {
			throw new UserRegistrationException("Please enter a valid last name");
		}
	}
	
	//email validation
	public boolean emailValidator(String email) throws UserRegistrationException {
		String pattern = "^[a-zA-Z]{1,}([.\\-+]?[a-zA-Z0-9]+)?\\@[a-z0-9]{1,}\\.([a-z]{2,4})(\\.[a-z]{2,4})?$";
		
		if (email.matches(pattern)) {
			System.out.println("valid email id");
			return true;
		}
		else {
			throw new UserRegistrationException("Please enter a valid email id");
		}
	}
	
	//phone number validation
	public boolean phoneNumberValidator(String phoneNumber) throws UserRegistrationException  {
		String pattern="^([\\+]?91)[6-9]{1}[0-9]{9}$";
			
		if (phoneNumber.matches(pattern)) {
			System.out.println("valid phone number");
			return true;
		}
		else {
			throw new UserRegistrationException("Please enter a valid phone number");
		}
	}
	
	//password validation
	public boolean passwordValidator(String password) throws UserRegistrationException  {
		String pattern="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		
		if (password.matches(pattern)) {
			System.out.println("valid password");
			return true;
		}
		else {
			throw new UserRegistrationException("Please enter a valid password");
		}
	}
	
	public void userInput()  {
		while(true) {
			System.out.println("Enter the First name :");
			firstName = scanner.next();
			try {
				boolean result = FirstNameValidate(firstName);
				if ( result == true ) {
					break;
				}
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("Enter the Last name :");
			lastName = scanner.next();
			try {
				boolean result = LastNameValidate(lastName);
				if ( result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("Enter the email id :");
			email = scanner.next();
			try {
				boolean result = emailValidator(email);
				if ( result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("Enter the phone number:");
			phoneNumber = scanner.next();
			try {
				boolean result = phoneNumberValidator(phoneNumber);
				if ( result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("Enter the password:");
			password = scanner.next();
			try {
				boolean result = passwordValidator(password);
				if ( result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		UserRegistration user = new UserRegistration();
		user.userInput();
		}
}

