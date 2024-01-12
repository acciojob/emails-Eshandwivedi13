package com.driver.test;

import com.driver.Email;
import com.driver.Gmail;
import org.junit.Test;

public class TestCases {

    @Test
    public void testEmail1() {
        Email email = new Email("accio@gmail.com");
        email.changePassword("Accio@123", "Va#1234567");
        assert (email.getPassword().equals("Va#1234567"));
    }

    @Test
    public void testGmail1() {
        Gmail gmail = new Gmail("accio@gmail.com", 3);
//        assert (gmail.getEmailId().equals("accio@gmail.com"));
        gmail.changePassword("Accio@123", "Va#1234567");
        assert (gmail.getPassword().equals("Va#1234567"));
//        gmail.changePassword("Va#1234567", "a#1234567");
//        assert (gmail.getPassword().equals("Va#1234567"));
//        assert(gmail.getInboxCapacity() == 3);
    }
}
