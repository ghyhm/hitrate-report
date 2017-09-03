'use strict';

app.controller('HitrateController', [ '$scope', '$routeParams', '$window', '$location', 'HitrateService', function($scope, $routeParams, $window, $location, HitrateService) {
	var self = this;
	self.hitrate = {
		id : null,
		visitDate : '',
		website : '',
		visits: null
	};
	self.hitrates = [];
	self.searchHitrates = searchHitrates;
	
	function searchHitrates(hitrate) {
		console.log(hitrate);
		HitrateService.searchHitrates(hitrate)
			.then(
				function(d) {
					self.hitrates = d;
					console.log(self.hitrates);
				},
				function(errResponse) {
					console.error('Error while fetching Hitrates');
				}
		);
	}
} ]);