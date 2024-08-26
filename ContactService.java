import java.util.HashMap;
import java.util.Map;


public class ContactService {
	// Create Data structure to hold contacts.
	private final Map<String, ContactList> contacts;
	
	// Constructor.
	public ContactService() {
		this.contacts = new HashMap<>();
	}
	
	/*
	 * Public functions to call private member functions.
	 * -------------------------------------------------------------
	 */	
	public void AddContact(ContactList contact) {
		addContact(contact);
	}
	
	public void DeleteContact(String contactID) {
		deleteContact(contactID);
	}
	
	public void UpdateContact(String contactID, String firstName, String lastName,
			String phoneNumber, String address) {
		updateContact(contactID, firstName, lastName,
				phoneNumber, address);
	}
	
	
	/*
	 * Private functions found below handle logic through 
	 * public functions above.
	 *-------------------------------------------------------------
	 */	
	
	// Adds a contact to ContactList.
	// Throws an IllegalArguementException if the contact ID is already in the system. 
	private void addContact(ContactList contact) {
		if(contacts.containsKey(contact.getContactID())) {
			throw new IllegalArgumentException("The ID must be unique.");
		}
		
		contacts.put(contact.getContactID(), contact);
	}
	
	// Deletes a contact from ContactList based on ContactID.
	// Throws an IllegalArguementException if no ID was found.
	private void deleteContact(String contactID) {
		if(!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("The ID was not found.");
		}
		
		contacts.remove(contactID);
	}
	
	// Updates an existing contact will throw an IllegalArguementException 
	// if no ID was found when trying to update a contact. 
	private void updateContact(String contactID, String firstName, String lastName,
			String phoneNumber, String address){
		ContactList contact = contacts.get(contactID);
		
		if(contact == null) {
			throw new IllegalArgumentException("The ID was not found.");
		}
		
		if(firstName != null && !firstName.isEmpty()) {
			contact.setFirstName(firstName);
		}
		
		if(lastName != null && !lastName.isEmpty()) {
			contact.setLastName(lastName);
		}
		
		if(phoneNumber != null && !phoneNumber.isEmpty() ) {
			contact.setPhoneNumber(phoneNumber);
		}
		
		if(address != null && !address.isEmpty()) {
			contact.setAddress(address);
		}
	}
	
	public ContactList getContact(String contactID) {
		return contacts.get(contactID);
		
	}
	
}
