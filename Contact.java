/*
 * Michael Bauer
 */


package projectOne;

public class Contact {
	
	private String contactID; 
	private String firstName; 
	private String lastName; 
	private String phoneNumber; 
	private String address;
	
	public Contact (String newID, String newFirstName, String newLastName, String newPhoneNum, String newAddress) {
		if (newID == null || newID.length() > 10) {
			throw new IllegalArgumentException ("Invalid ID");
		}
		else {
			contactID = newID;
		}
		
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Name");
		}
		else {
			firstName = newFirstName;
		}
		
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Name");
		}
		else {
			lastName = newLastName;
		}
		
		if (newPhoneNum == null || newPhoneNum.length() != 10) {
			throw new IllegalArgumentException ("Invalid Phone Number");
		}
		else {
			phoneNumber = newPhoneNum;
		}
		
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException ("Invalid Address");
		}
		else {
			address = newAddress;
		}
	}
	
	public void setFirstName (String newFirstName) {
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Name");
		}
		else {
			firstName = newFirstName;
		}
	}
	
	public void setLastName (String newLastName) {
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Name");
		}
		else {
			lastName = newLastName;
		}
	}
	
	public void setPhoneNumber (String newPhoneNum) {
		if (newPhoneNum == null || newPhoneNum.length() != 10) {
			throw new IllegalArgumentException ("Invalid Phone Number");
		}
		else {
			phoneNumber = newPhoneNum;
		}
	}
	
	public void setAddress (String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException ("Invalid Address");
		}
		else {
			address = newAddress;
		}
	}
	
	public String getFirstName () {
		return firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public String getPhoneNum () {
		return phoneNumber;
	}
	
	public String getAddress () {
		return address;
	}
	
	public String getContactID () {
		return contactID;
	}
}