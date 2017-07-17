Feature: Hitrate Report 

Scenario: Search top 5 hit rate websites 

	Given I have the following hit rate data 
		| visit_date | website 				| visits |
		| 2016-01-06 | www.bing.com 		|  14065457 |
		| 2016-01-06 | www.ebay.com.au 		|  19831166 |
		| 2016-01-06 | www.facebook.com 	| 104346720 |
		| 2016-01-06 | mail.live.com        |  21536612 |
		| 2016-01-06 | www.wikipedia.org	|  13246531 |
	When I search for hit rate on 2016-01-06
	Then I should see the following hit rates
		| visit_date | website 				| visits |
		| 2016-01-06 | www.bing.com 		|  14065457 |
		| 2016-01-06 | www.ebay.com.au 		|  19831166 |
		| 2016-01-06 | www.facebook.com 	| 104346720 |
		| 2016-01-06 | mail.live.com        |  21536612 |
		| 2016-01-06 | www.wikipedia.org	|  13246531 |
	
	
