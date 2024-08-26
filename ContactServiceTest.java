import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ContactServiceTest {
	private ContactService contactService;
	
	// Initiializes contatc Service.
	@Before
	public void setupService() {
		contactService = new ContactService();
		
	}
	
	// Tests the AddContact function in ContactService.
	@Test
	public void testAddContact() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contactService.AddContact(contact);
		assertNotNull(contactService.getContact("1234"));
	}
	
	// Tests the DeleteContact function in ContactService.
	@Test
	public void testDeleteContact() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contactService.AddContact(contact);
		contactService.DeleteContact("1234");
		assertNull(contactService.getContact("1234"));
	}
	
	// Tests the UpdateContact function in ContactService.
	@Test
	public void testUpdateContact() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contactService.AddContact(contact);
		contactService.UpdateContact("1234", "Perry", "Cox", "902123456", "123 Don't visit Ave");
		ContactList updatedContact = contactService.getContact("1234");
		assertEquals("Perry", updatedContact.getFirstName());
		assertEquals("Cox", updatedContact.getLastName());
		assertEquals("902123456", updatedContact.getPhoneNumber());
		assertEquals("123 Don't visit Ave", updatedContact.getAddress());
		
	}
	
	// Tests the AddContact function in ContactService for a duplicate contact.
	@Test(expected = IllegalArgumentException.class)
	public void testAddDuplicateContactID() {
		ContactList contact1 = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		ContactList contact2 = new ContactList("1234", "Bob", "Kelso", "987654321", "904 Sacred Heart");
		contactService.AddContact(contact1);
		contactService.AddContact(contact2);
	}
	
	// Tests the DeleteContact function in ContactService if no ID was found to delete.
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteContactNotFound() {
		contactService.DeleteContact("1234");
	}
	
	// Tests the UpdateContact function in ContactService if no ID was found to update.
	@Test(expected = IllegalArgumentException.class)
	public void testUpdateContactNotFound() {
		contactService.UpdateContact("1234", "Dr", "Janitor", "123456789", "Sacred Heart Hospital");
	}
	
	// Tests the UpdateContact function in ContactService to update the contact partially.
	@Test
	public void testUpdateContactPartially() {
		ContactList contact = new ContactList("1234", "John", "Dorian", "123456789", "21 Jump Street");
		contactService.AddContact(contact);
		contactService.UpdateContact("1234", "Elliot", "Reid", null, null);
		ContactList updatedContact = contactService.getContact("1234");
		assertEquals("Elliot", updatedContact.getFirstName());
		assertEquals("Reid", updatedContact.getLastName());
		assertEquals("123456789", updatedContact.getPhoneNumber());
		assertEquals("21 Jump Street", updatedContact.getAddress());
		
	}
	
}
