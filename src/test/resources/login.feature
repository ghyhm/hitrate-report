Feature: Login 

Background:
	Given there are the following valid users
		| user_name | password |
		| mandy     | test     |

Scenario: Login with valid user information 
	When I login with below user
		| user_name | password |
		| mandy     | test     |
	Then I should go to Hit Rate report
	
Scenario: Login with invalid user information 
	When I login with below user
		| user_name | password |
		| tom       | tom      |
	Then I cannot access Hit Rate report
	
