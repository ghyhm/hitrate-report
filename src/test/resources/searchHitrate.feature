Feature: Hitrate Report 

Background:
	Given I have login as below user
		| user_name | password |
		| mandy     | test     |
	And I have the following hit rate data 
		| visit_date | website 				| visits 	|
		| 2016-01-06 | www.bing.com 		|  14065457 |
		| 2016-01-06 | www.ebay.com.au 		|  19831166 |
		| 2016-01-06 | www.facebook.com 	| 104346720 |
		| 2016-01-06 | mail.live.com        |  21536612 |
		| 2016-01-06 | www.wikipedia.org	|  13246531 |
		| 2016-01-06 | au.yahoo.com			|  11492756	|
		| 2016-01-06 | www.google.com		|  26165099	|
		| 2016-01-06 | ninemsn.com.au		|  21734381	|
		| 2016-01-20 | mail.live.com		|  24344783	|
	And I have the following exclusion list
		| host 		   | excluded_since | excluded_till |
		| facebook.com | 2016-12-01 	|	 			|
		| google.com   | 2016-01-01 	| 2016-03-14	|

Scenario: Search top 5 hit rate websites 
	When I search for hit rate on 2016-01-06
	Then I should see the following hit rates
		| visit_date | website 				| visits    |
		| 2016-01-06 | www.facebook.com 	| 104346720 |
		| 2016-01-06 | ninemsn.com.au		|  21734381	|
		| 2016-01-06 | mail.live.com        |  21536612 |
		| 2016-01-06 | www.ebay.com.au 		|  19831166 |
		| 2016-01-06 | www.bing.com 		|  14065457 |
	
	
