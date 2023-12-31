package org.peronal;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findPhoneNumberByNameTest () {
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("Jos de Vos");
        assertFalse(phoneNumber.isEmpty());
    }
    @org.junit.Test
    public void findPhoneNumberByName_NotFound() {
        expectedException.expect(NoSuchElementException.class);

        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("Jos de Voss");

        phoneNumber.get();
    }

}