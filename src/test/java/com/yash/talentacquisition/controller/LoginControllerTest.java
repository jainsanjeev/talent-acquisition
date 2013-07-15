package com.yash.talentacquisition.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
	
	@InjectMocks
	private LoginController classToTest;
	@Test
	public void shouldShowLoginPage() {
		ModelAndView modelAndView = classToTest.getLoginPage();
		Assert.assertEquals("login/login", modelAndView.getViewName());
		Assert.assertEquals(0, modelAndView.getModelMap().size());
	}
	
	
		
}
