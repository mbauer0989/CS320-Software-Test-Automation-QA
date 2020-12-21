/*
 * Michael Bauer
 */

package test;

import projectOne.ContactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactServiceTest {
	
	ContactService testContactService = new ContactService ();

	@Test
	void testContactServiceAddDeleteUpdate () {
		testContactService.addContact("1234", "John", "Smith", "1234567890", "123 John Street");
		testContactService.addContact("12345", "John", "Smith", "1234567890", "123 John Street");

		assertEquals (true, testContactService.updateAddress("1234", "123 New Address"));
		assertEquals (true, testContactService.updateFirstName("1234", "Jim"));
		assertEquals (true, testContactService.updateLastName("1234", "Jones"));
		assertEquals (true, testContactService.updatePhoneNumber("1234", "5555555555"));
		
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.updateAddress("1234", "123 New Address Somewhere Somewhere"));
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.updateFirstName("1234", "Jimmmmmmmmm"));
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.updateLastName("1234", "Jonesssssss"));
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.updatePhoneNumber("1234", "555555555"));
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.addContact("1234", "Joe", "Smith", "1234567890", "123 John Street"));
		assertThrows (IllegalArgumentException.class, () ->
			testContactService.getContact("123"));
		
		assertTrue (testContactService.getContact("1234").getAddress().equals("123 New Address"));
		assertTrue (testContactService.getContact("1234").getFirstName().equals("Jim"));
		assertTrue (testContactService.getContact("1234").getLastName().equals("Jones"));
		assertTrue (testContactService.getContact("1234").getPhoneNum().equals("5555555555"));
		
		assertEquals (false, testContactService.deleteContact("123"));
		assertEquals (false, testContactService.updateAddress("123", "123 New Address"));
		assertEquals (false, testContactService.updateFirstName("123", "Joe"));
		assertEquals (false, testContactService.updateLastName("123", "Jones"));
		assertEquals (false, testContactService.updatePhoneNumber("123", "5555555555"));
		
		assertEquals (false, testContactService.deleteContact("123"));
		assertEquals (true, testContactService.deleteContact("1234"));
		}
}
