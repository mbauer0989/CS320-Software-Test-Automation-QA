/*
 * Michael Bauer
 */

package projectOne;
import java.util.ArrayList;

public class ContactService {
	
	private ArrayList <Contact> contactList = new ArrayList <Contact>();
	
	public boolean addContact (String newID, String newFirstName, String newLastName, String newPhoneNum, String newAddress) 
	{	
		for (int i = 0; i < contactList.size(); i++ ) 
		{	
			if (newID == contactList.get(i).getContactID() ) 
			{
				throw new IllegalArgumentException ("Invalid ID");
			}
		}
		
		Contact newContact = new Contact (newID, newFirstName, newLastName, newPhoneNum, newAddress);
		contactList.add(newContact);
		
		return true;
	}
	
	public boolean deleteContact (String contactID) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.remove(i);
				return true;
			}
		}		
		return false;
	}
	
	public boolean updateFirstName (String contactID, String newFirstName) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setFirstName(newFirstName);
				return true;
			}
		}		
		return false;
	}
	
	public boolean updateLastName (String contactID, String newLastName) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setLastName(newLastName);
				return true;
			}
		}		
		return false;
	}
	
	public boolean updatePhoneNumber (String contactID, String newPhoneNumber) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setPhoneNumber(newPhoneNumber);
				return true;
			}
		}		
		return false;
	}
	
	public boolean updateAddress (String contactID, String newAddress) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setAddress(newAddress);
				return true;
			}
		}		
		return false;
	}
	
	public Contact getContact (String contactID)
	{		
		for (int i = 0; i < contactList.size(); i++ ) 
		{	
			if (contactID == contactList.get(i).getContactID() ) 
			{
				return contactList.get(i);
			}
		}
		
		throw new IllegalArgumentException ("ID Not Found");
	}
}