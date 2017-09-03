'use strict';

app.factory('HitrateService', [ '$http', '$q', function($http, $q) {
	var REST_SERVICE_URI = 'search';

	var factory = {
		searchHitrates : searchHitrates
	};

	return factory;

	function searchHitrates(hitrate) {
		var deferred = $q.defer();
		var visitDate = null;
		if (hitrate) {
			visitDate = hitrate.visitDate;
		}
		if (visitDate) {
			$http.get(REST_SERVICE_URI, {params: {visitDate: visitDate}})
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					console.error('Error while fetching Hitrates');
					deferred.reject(errResponse);
				}
			);
		}
		return deferred.promise;
	}
} ]);