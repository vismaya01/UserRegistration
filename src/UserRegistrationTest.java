import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.FirstNameValidate("Vismaya"));
		} catch (UserRegistrationException e) {
		}	
	}
		
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.FirstNameValidate("vi");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid first name", e.getMessage());
		}
	}
	
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.LastNameValidate("Vismaya"));
		} catch (UserRegistrationException e) {
		}
	}
		
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.LastNameValidate("vi");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid last name", e.getMessage());
		}			
	}
		
	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.emailValidator("kvvismaya98@gmail.com"));
		} catch (UserRegistrationException e) {
		}		
	}
	
	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.emailValidator("abc()*@gmail.com");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid email id", e.getMessage());
		}	
	}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.phoneNumberValidator("919923456789"));
		} catch (UserRegistrationException e) {
		}	
	}
		
	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.phoneNumberValidator("9825236");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid phone number", e.getMessage());
		}		
	}
		
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.passwordValidator("Vismaya@123"));
		} catch (UserRegistrationException e) {
		}		
	}
	
	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.passwordValidator("visma@#$12");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid password", e.getMessage());
		}	
	}

}


