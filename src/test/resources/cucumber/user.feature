Feature: Login/Landing

Scenario: Get User By Email
Given Application Users
	| email		 	|name|
	| mike@tas.com	|Mike| 
When user request for user by email "mike@tas.com"
Then The user details should return
		| email		 	|name|
		| mike@tas.com	|Mike| 