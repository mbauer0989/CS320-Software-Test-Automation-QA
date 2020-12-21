/*
 * Michael Bauer
 */

package test;

import projectOne.Contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactTest {

	@Test
	void testContactClass() {
		Contact testContact = new Contact ("1234", "John", "Smith", "1234567890", "123 John Street");
		assertTrue (testContact.getAddress().equals("123 John Street"));
		assertTrue (testContact.getFirstName().equals("John"));
		assertTrue (testContact.getLastName().equals("Smith"));
		assertTrue (testContact.getPhoneNum().equals("1234567890"));
		assertTrue (testContact.getContactID().equals("1234"));
	}
	
	@Test
	void testContactClassSet () {
		Contact testContact = new Contact ("1234", "John", "Smith", "1234567890", "123 John Street");

		testContact.setAddress("123 New Address");
		testContact.setFirstName("Jim");
		testContact.setLastName("Jones");
		testContact.setPhoneNumber("5555555555");

		assertTrue (testContact.getAddress().equals("123 New Address"));
		assertTrue (testContact.getFirstName().equals("Jim"));
		assertTrue (testContact.getLastName().equals("Jones"));
		assertTrue (testContact.getPhoneNum().equals("5555555555"));
	}
	
	@Test
	void testContactClassTooLong () {
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("12345678900", "John", "Smith", "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("1234567890", "Johnnnnnnnn", "Smith", "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("1234567890", "John", "Smithhhhhhh", "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("1234567890", "John", "Smith", "123456789", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("1234567890", "John", "Smith", "1234567890", "123 John Street Somewhere Somewhere");
		});
		}
	
	@Test
	void testContactClassNull () {
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact (null, "John", "Smith", "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("1234567890", null, "Smith", "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("12345678900", "John", null, "1234567890", "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("12345678900", "John", "Smith", null, "123 John Street");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			new Contact ("12345678900", "John", "Smith", "1234567890", null);
		});
		}
	
	@Test
	void testContactClassSetTooLong () {
		Contact testContact = new Contact ("1234", "John", "Smith", "1234567890", "123 John Street");
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setAddress("123 John Street Somewhere Somewhere");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setFirstName("123 John Street Somewhere Somewhere");
		});

		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setLastName("123 John Street Somewhere Somewhere");
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber("123 John Street Somewhere Somewhere");
		});
	}
	
	@Test
	void testContactClassSetNull () {
		Contact testContact = new Contact ("1234", "John", "Smith", "1234567890", "123 John Street");
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setAddress(null);
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setFirstName(null);
		});

		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setLastName(null);
		});
		
		assertThrows (IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber(null);
		});
	}
}



