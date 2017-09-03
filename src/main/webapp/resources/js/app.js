'use strict';

var app = angular.module('myApp', [ 'ngRoute' ])
	.config(function($routeProvider) {
		$routeProvider.when("/list", {
			templateUrl : "templates/hitrate-list",
			controller : "HitrateController"
		})
//		.when("/loginForm", {
//			controller: "LoginController as loginCtrl"
//		})
		.otherwise({
			redirectTo: "/list"
		});
	});
;