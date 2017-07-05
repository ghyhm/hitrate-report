'use strict';

app.controller('HitrateController', [ '$scope', '$routeParams', '$window', '$location', 'HitrateService', function($scope, $routeParams, $window, $location, HitrateService) {
	var self = this;
	self.hitrate = {
		pid : null,
		name : '',
		location : ''
	};
	self.hitrates = [];
	self.submit = submit;
//	self.edit = edit;
//	self.deleteWine = deleteWine;
//	self.reset = reset;

//	if ($routeParams.id) {
//		edit($routeParams.id);
//	} else {
//		fetchAllWines();
//	}
	fetchAllHitrates();

	function fetchAllHitrates() {
		HitrateService.fetchAllHitrates()
			.then(
				function(d) {
					self.hitrates = d;
				},
				function(errResponse) {
					console.error('Error while fetching Hitrates');
				}
		);
	}

//	function edit(pid) {
//		console.log('id to be edited', pid);
//		HitrateService.getWine(pid)
//			.then(function(d) {
//				self.wine = d;
//			},
//				function(errResponse) {
//					console.error('Error while fetching Wines');
//				}
//		);
//	}
//
//	function createWine(wine) {
//		console.log("create");
//		HitrateService.createWine(wine)
//			.then(
//				fetchAllHitrates,
//				function(errResponse) {
//					console.error('Error while creating Wine');
//				}
//		);
//	}
//
//	function updateWine(wine, id) {
//		console.log("update");
//		HitrateService.updateWine(wine, id)
//			.then(
//				fetchAllHitrates,
//				function(errResponse) {
//					console.error('Error while updating Wine');
//				}
//		);
//	}
//
//	function submit(wine) {
//		self.wine = wine;
//		if (wine.pid == null) {
//			console.log('Saving New Wine', wine);
//			createWine(wine);
//		} else {
//			updateWine(wine, wine.pid);
//			console.log('Wine updated with pid ', wine.pid);
//		}
//		$location.url('/list');
//		$window.location.reload();
//	}
//
//	function deleteWine(id) {
//		HitrateService.deleteWine(id)
//			.then(
//				fetchAllHitrates,
//				function(errResponse) {
//					console.error('Error while deleting Wine');
//				}
//		);
//	}

//	function reset() {
//		self.hitrate = {
//			pid : null,
//			name : '',
//			location : ''
//		};
//		$scope.hitrateForm.$setPristine(); //reset Form
//	}
} ]);