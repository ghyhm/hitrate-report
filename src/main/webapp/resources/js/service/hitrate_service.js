'use strict';

app.factory('HitrateService', [ '$http', '$q', function($http, $q) {
	var REST_SERVICE_URI = 'search';

	var factory = {
		searchHitrates : searchHitrates
//		getWine : getWine,
//		createWine : createWine,
//		updateWine : updateWine,
//		deleteWine : deleteWine
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

//	function getWine(pid) {
//		var deferred = $q.defer();
//		$http.get(REST_SERVICE_URI + pid)
//			.then(
//				function(response) {
//					deferred.resolve(response.data);
//				},
//				function(errResponse) {
//					console.error('Error while fetching Wine');
//					deferred.reject(errResponse);
//				}
//		);
//		return deferred.promise;
//	}
//
//	function createWine(wine) {
//		var deferred = $q.defer();
//		$http.post(REST_SERVICE_URI, wine)
//			.then(
//				function(response) {
//					deferred.resolve(response.data);
//				},
//				function(errResponse) {
//					console.log(errResponse);
//					console.error('Error while creating Wine');
//					deferred.reject(errResponse);
//				}
//		);
//		return deferred.promise;
//	}
//
//	function updateWine(wine, id) {
//		var deferred = $q.defer();
//		$http.put(REST_SERVICE_URI + id, wine)
//			.then(
//				function(response) {
//					deferred.resolve(response.data);
//				},
//				function(errResponse) {
//					console.error('Error while updating Wine');
//					deferred.reject(errResponse);
//				}
//		);
//		return deferred.promise;
//	}
//
//	function deleteWine(id) {
//		var deferred = $q.defer();
//		$http.delete(REST_SERVICE_URI + id)
//			.then(
//				function(response) {
//					deferred.resolve(response.data);
//				},
//				function(errResponse) {
//					console.error('Error while deleting Wine');
//					deferred.reject(errResponse);
//				}
//		);
//		return deferred.promise;
//	}
} ]);