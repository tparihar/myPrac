/**
 * 
 */
var app = angular.module("myApp", []);
app.controller("myController", [ '$scope', function($scope) {
	$scope.count = 0;
	$scope.a = "vishal";
	$scope.b = "singh";
	
	$scope.c = function() {
		return $scope.a + " " + $scope.b
	}
} ]);
