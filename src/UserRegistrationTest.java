import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.FirstNameValidate("Vismaya");
		Assert.assertTrue(result);		
	}
		
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.FirstNameValidate("vi");
		Assert.assertFalse(result);			}
	
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.LastNameValidate("Vismaya");
		Assert.assertTrue(result);	
	}
		
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.LastNameValidate("vi");
		Assert.assertFalse(result);			}
		
	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.emailValidator("kvvismaya98@gmail.com");
		Assert.assertTrue(result);			
	}
	
	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.emailValidator("abc()*@gmail.com");
		Assert.assertFalse(result);			}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.phoneNumberValidator("919923456789");
		Assert.assertTrue(result);	
	}
		
	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.phoneNumberValidator("9825236");
		Assert.assertFalse(result);			
	}
		
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.passwordValidator("Vismaya@123");
		Assert.assertTrue(result);		
	}
	
	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.passwordValidator("visma@#$12");
		Assert.assertFalse(result);		
	}

}


