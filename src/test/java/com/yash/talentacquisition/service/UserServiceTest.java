package com.yash.talentacquisition.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.talentacquisition.model.User;
import com.yash.talentacquisition.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	private static final String ANY_EMAIL_COM = "any@email.com";
	@InjectMocks
	private UserService classToTest;
	@Mock
	private UserRepository userRepository;
	
	@Test
	public void shouldGetUserByEmail() {
		User user = new User();
		Mockito.when(userRepository.findUserByEmail(ANY_EMAIL_COM))
				.thenReturn(user);
		User actual = classToTest.getUserByEmail(ANY_EMAIL_COM);
		Assert.assertSame(user, actual);
	}

}
