import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {
	
	// Creates a contact to test creation via constructor in class ContactList.
	@Test
	public void testContactCreation() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		assertEquals("1234", contact.getContactID());
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("123456789",contact.getPhoneNumber());
		assertEquals("21 Elm Street",contact.getAddress());
	}
	
	/*
	 * Tests Setters for ContactList class.
	 * -------------------------------------------------------------
	 */	
	@Test
	public void testSetFirstName() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setFirstName("Chris");
		
	}
	@Test
	public void testSetLastName() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setLastName("Turk");
	}
	
	@Test
	public void testSetPhoneNumber() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setPhoneNumber("902calturk");
	}
	
	@Test
	public void testSetAddress() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setAddress("901 Sacred Heart");
	}
	
	/*
	 * Tests Setters for ContactList if input is NULL.
	 * -------------------------------------------------------------
	 */	
	@Test(expected = IllegalArgumentException.class)
	public void testSetFirstNameNULL() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setFirstName(null);
			
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetLastNameNULL() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setLastName(null);
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetPhoneNumberNULL() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setPhoneNumber(null);
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetAddressNULL() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setAddress(null);
	}
		
	
	/*
	 * Tests Setters for ContactList if input is over length.
	 * -------------------------------------------------------------
	 */	
	@Test(expected = IllegalArgumentException.class)
	public void testSetFirstNameLength() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setFirstName("JohnMichael");
			
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetLastNameLength() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setLastName("Doriandeeznuts");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetPhoneNumberLength() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setPhoneNumber("1800666555444");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetAddressLength() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contact.setAddress("121 Jump Street, Chigaco, United States Of America");
	}
	
	
	/*
	 * Tests ContactList constructor for length the same error message would
	 * display if input was NULL based on logic.
	 * -------------------------------------------------------------
	 */	
	@Test(expected = IllegalArgumentException.class)
	public void testContactID() {
		new ContactList("12345678901", "John", "Dorian", "123456789", "21 Jump Street");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFirstName() {
		new ContactList("1234", "JohnMichael", "Dorian", "123456789", "21 Jump Street");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLastName() {
		new ContactList("1234", "John", "Doriandeeznuts", "123456789", "21 Jump Street");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPhoneNumber() {
		new ContactList("1234", "John", "Dorian", "1800666555444", "21 Jump Street");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddress() {
		new ContactList("1234", "John", "Dorian", "123456789", "121 Jump Street, Chigaco, United States Of America");
		
	}
}
