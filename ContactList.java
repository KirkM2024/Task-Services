
public class ContactList {

	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// Constructor
	public ContactList(String contactID, String firstName, String lastName, String phoneNumber,
			String address) {
		
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("The first name field must not be blank or over 10 characters.");
		};
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("The first name must not be blank or over 10 characters.");
		};
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("The last name name must not be blank or over 10 characters.");
		};
		
		if(phoneNumber == null || phoneNumber.matches("//d{10}")) {
			throw new IllegalArgumentException("The phone number must not be blank or over 10 digits.");
		};
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("The address must not be blank or over 30 characters.");
		};
		
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
		
	};
	
	// Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	/*
	 * Public Setters to access private member functions below.
	 * -------------------------------------------------------------
	 */	
	
	public void setFirstName(String firstName) {
		setfirstName(firstName);
	}
	
	public void setLastName(String lastName) {
		setlastName(lastName);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		setphoneNumber(phoneNumber);
	}
	
	public void setAddress(String address) {
		setaddress(address);
	}
	
	/*
	 * Actual Setter functions made private accessed from the public functions
	 * above.
	 * -------------------------------------------------------------
	 */	
	
	
	// Sets the first name of the contact.
	// Throws two types of IllegalArguementException one for a blank input 
	// and the second for character length.
	private void setfirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("The first name field must not be blank.");
		}else if(firstName.length() > 10) {
			throw new IllegalArgumentException("Your first name can not be more than 10 characters.");
		}else {
			this.firstName = firstName;
		};
	}
	
	// Sets the last name of the contact.
	// Throws two types of IllegalArguementException one for a blank input 
	// and the second for character length.
	private void setlastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("The last name field must not be blank.");
		}else if(lastName.length() > 10) {
			throw new IllegalArgumentException("Your last name can not be more than 10 characters.");
		}else {
			this.lastName = lastName;
		};
	}
	
	// Sets the phone number of the contact.
	// Throws two types of IllegalArguementException one for a blank input 
	// and the second for character length.
	private void setphoneNumber(String phoneNumber) {
		if(phoneNumber == null) {
			throw new IllegalArgumentException("The phone numer field must not be blank.");
		}else if(!phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Your phone number can not be more than 10 digits.");
		}else {
			this.phoneNumber = phoneNumber;
		};
	}
	
	// Sets the address of the contact.
	// Throws two types of IllegalArguementException one for a blank input 
	// and the second for character length.
	private void setaddress(String address) {
		if(address == null) {
			throw new IllegalArgumentException("The address field must not be blank.");
		}else if(address.length() > 30) {
			throw new IllegalArgumentException("Your address can not be more than 30 characters.");
		}else {
			this.address = address;
		};
	}
	

}