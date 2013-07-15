package com.yash.talentacquisition.cuke;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.yash.talentacquisition.cuke.UsersStepDefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersStepDefs {
	private List<ApplicationUser> users = new ArrayList<ApplicationUser>();
    
    @Given("^Application Users$")
    public void Application_Users(List<ApplicationUser> items) throws Throwable {
        for (ApplicationUser item : items) {
    			users.add(item);
        }
    }

    @When("^user request for user by email \"([^\"]*)\"$")
    public void user_request_for_user_by_email(String email) throws Throwable {
    		System.out.println("email :"+email);
    }

    @Then("^The user details should return$")
    public void The_user_details_should_return(List<ApplicationUser> expected) throws Throwable {
    		//Assert.assertEquals(expected, users.toString());
    }
    // When converting tables to a List of objects it's usually better to
    // use classes that are only used in test (not in production). This
    // reduces coupling between scenarios and domain and gives you more control.
    public static class ApplicationUser {
        private String email;
        private String name;
    }
}
