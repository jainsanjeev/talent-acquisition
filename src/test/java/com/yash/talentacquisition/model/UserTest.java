package com.yash.talentacquisition.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.talentacquisition.model.User;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {
	@Test
    public void testPasswordDigest() {
        final User u = new User();
        assertNull( u.getPasswordDigest() );
        u.setPasswordPlaintext("a password");
        
        assertNotNull( u.getPasswordDigest() );
        assertEquals( 32, u.getPasswordDigest().length() );
        assertEquals( User.computePasswordDigest("a password"), u.getPasswordDigest() );
    }
}
