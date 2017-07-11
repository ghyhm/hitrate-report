'use strict';

var app = angular.module('myApp', [ 'ngRoute' ])
	.config(function($routeProvider) {
		$routeProvider.when("/list", {
			templateUrl : "templates/hitrate-list",
			controller : "HitrateController"
		})
		.when("/loginForm", {
			controller: "LoginController as loginCtrl"
		})
//		.when("/add_wine", {
//			templateUrl : "templates/wine-details",
//			controller : "WineController"
//		})
//		.when("/wine/:id", {
//			templateUrl : "templates/wine-details/:id",
//			controller : "WineController as wineCtrl"
//		})
		.otherwise({
			redirectTo: "/list"
		});
	});
;